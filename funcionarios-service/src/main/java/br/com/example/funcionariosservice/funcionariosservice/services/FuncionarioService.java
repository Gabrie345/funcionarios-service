package br.com.example.funcionariosservice.funcionariosservice.services;


import br.com.example.funcionariosservice.funcionariosservice.entity.FuncionarioEntity;
import br.com.example.funcionariosservice.funcionariosservice.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

@Service
public record FuncionarioService(FuncionarioRepository funcionarioRepository) {

    public FuncionarioEntity salvar(FuncionarioEntity funcionario) {
        return funcionarioRepository.save(funcionario);
    }

}
