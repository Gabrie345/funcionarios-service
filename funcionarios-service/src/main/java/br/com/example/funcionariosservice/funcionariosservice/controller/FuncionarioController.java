package br.com.example.funcionariosservice.funcionariosservice.controller;

import br.com.example.funcionariosservice.funcionariosservice.controller.dto.FuncionarioDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rh/funcionarios")
public class FuncionarioController {

    @RequestMapping("/novo")
    public ResponseEntity<Object> CriarCadastroNovoFuncionario(@RequestBody FuncionarioDto funcionario) {

        return null;
    }
}
