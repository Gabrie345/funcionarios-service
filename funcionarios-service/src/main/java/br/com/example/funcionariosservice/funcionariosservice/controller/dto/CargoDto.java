package br.com.example.funcionariosservice.funcionariosservice.controller.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;

@Data
public class CargoDto implements Serializable {
    @JsonIgnore
    private Long id;
    private String descricao;
    private String nomeCargo;
    private Long setorId;

}
