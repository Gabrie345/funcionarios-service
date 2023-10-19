package br.com.example.funcionariosservice.funcionariosservice.controller.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
public class SetorDto implements Serializable {
    private Long id;
    private String nomeDoSetor;
    private String descricao;
}
