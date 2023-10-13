package br.com.example.funcionariosservice.funcionariosservice.repository;

import br.com.example.funcionariosservice.funcionariosservice.entity.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {

}
