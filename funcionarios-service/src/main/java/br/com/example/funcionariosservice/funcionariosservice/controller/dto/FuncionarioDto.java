package br.com.example.funcionariosservice.funcionariosservice.controller.dto;

import br.com.example.funcionariosservice.funcionariosservice.enumeration.Sexo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class FuncionarioDto implements Serializable {
    private Long id;
    private String nome;
    private String sobrenome;
    private String cpf;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataDeNascimento;
    private Sexo sexo;
    private Long cargoId; // Usando o ID do cargo em vez de uma referência direta
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataDeContratacao;
    private double salario;
    private String cidade;
    private String estado;
    private String cep;
    private String email;
    private String numeroDeTelefone;
    private String chefiaNome;
    private Long chefiaId;
}
