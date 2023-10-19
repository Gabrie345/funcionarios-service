package br.com.example.funcionariosservice.funcionariosservice.services;

import br.com.example.funcionariosservice.funcionariosservice.entity.SetorEntity;
import br.com.example.funcionariosservice.funcionariosservice.repository.SetorRepository;
import org.springframework.stereotype.Service;


@Service
public record SetorService(SetorRepository setorRepository) {

    public SetorEntity salvar(SetorEntity setor) {

        return setorRepository.save(setor);
    }

}
