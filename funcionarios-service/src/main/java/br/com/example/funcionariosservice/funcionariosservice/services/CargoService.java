package br.com.example.funcionariosservice.funcionariosservice.services;

import br.com.example.funcionariosservice.funcionariosservice.controller.dto.CargoDto;
import br.com.example.funcionariosservice.funcionariosservice.entity.CargoEntity;
import br.com.example.funcionariosservice.funcionariosservice.entity.FuncionarioEntity;
import br.com.example.funcionariosservice.funcionariosservice.repository.CargoRepository;
import br.com.example.funcionariosservice.funcionariosservice.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;


@Service
public record CargoService(CargoRepository cargoRepository) {

    public CargoEntity salvar(CargoEntity cargo) {
        return cargoRepository.save(cargo);
    }

}
