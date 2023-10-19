package br.com.example.funcionariosservice.funcionariosservice.controller;


import br.com.example.funcionariosservice.funcionariosservice.controller.dto.CargoDto;
import br.com.example.funcionariosservice.funcionariosservice.controller.mapper.RecursosHumanosContratosMapper;
import br.com.example.funcionariosservice.funcionariosservice.entity.CargoEntity;
import br.com.example.funcionariosservice.funcionariosservice.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rh/cargo")
public class CargoController {

    @Autowired
    CargoService service;

    @RequestMapping("/cadastro")
    public ResponseEntity<Object> cadastrarCargo(@RequestBody CargoDto cargo) {
        try {
            CargoEntity cargoEntity = RecursosHumanosContratosMapper.passerCargoDtoParaCargo(cargo);
            CargoEntity response = service.salvar(cargoEntity);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            String errorMessage = "Erro ao criar um novo cargo: " + e.getMessage();
            return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
