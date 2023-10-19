package br.com.example.funcionariosservice.funcionariosservice.controller;

import br.com.example.funcionariosservice.funcionariosservice.controller.dto.FuncionarioDto;
import br.com.example.funcionariosservice.funcionariosservice.controller.mapper.RecursosHumanosContratosMapper;
import br.com.example.funcionariosservice.funcionariosservice.entity.FuncionarioEntity;
import br.com.example.funcionariosservice.funcionariosservice.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rh/funcionarios")
public class FuncionarioController {

    @Autowired
    FuncionarioService service;

    @RequestMapping("/novo")
    public ResponseEntity<Object> criarCadastroNovoFuncionario(@RequestBody FuncionarioDto funcionario) {
        try {
            FuncionarioEntity entity = RecursosHumanosContratosMapper.passerFuncionarioDtoParaFuncionario(funcionario);
            FuncionarioEntity response = service.salvar(entity);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            String errorMessage = "Erro ao criar novo funcionário: " + e.getMessage();
            return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
