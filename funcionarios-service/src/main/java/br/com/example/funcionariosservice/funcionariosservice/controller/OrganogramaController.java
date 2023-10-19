package br.com.example.funcionariosservice.funcionariosservice.controller;


import br.com.example.funcionariosservice.funcionariosservice.controller.dto.CargoDto;
import br.com.example.funcionariosservice.funcionariosservice.controller.dto.SetorDto;
import br.com.example.funcionariosservice.funcionariosservice.controller.mapper.RecursosHumanosContratosMapper;
import br.com.example.funcionariosservice.funcionariosservice.entity.CargoEntity;
import br.com.example.funcionariosservice.funcionariosservice.entity.SetorEntity;
import br.com.example.funcionariosservice.funcionariosservice.services.CargoService;
import br.com.example.funcionariosservice.funcionariosservice.services.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rh/organograma")
public class OrganogramaController {

    @Autowired
    CargoService serviceCargo;
    @Autowired
    SetorService serviceSetor;

    @RequestMapping("/cargos/cadastro")
    public ResponseEntity<Object> cadastrarCargo(@RequestBody CargoDto cargo) {
        try {
            CargoEntity cargoEntity = RecursosHumanosContratosMapper.passerCargoDtoParaCargo(cargo);
            CargoEntity response = serviceCargo.salvar(cargoEntity);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            String errorMessage = "Erro ao criar um novo cargo: " + e.getMessage();
            return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @RequestMapping("/setor/cadastro")
    public ResponseEntity<Object> cadastrarSetor(@RequestBody SetorDto setor) {
        try {
            SetorEntity setorEntity = RecursosHumanosContratosMapper.passerSetorDtoParaSetor(setor);
            SetorEntity response = serviceSetor.salvar(setorEntity);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            String errorMessage = "Erro ao criar um novo setor: " + e.getMessage();
            return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
