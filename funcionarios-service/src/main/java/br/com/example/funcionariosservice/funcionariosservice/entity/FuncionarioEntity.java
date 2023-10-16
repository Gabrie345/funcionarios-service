package br.com.example.funcionariosservice.funcionariosservice.entity;

import java.time.LocalDate;
import java.util.Date;

import br.com.example.funcionariosservice.funcionariosservice.enumeration.Sexo;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "funcionario")
@Data
public class FuncionarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(name = "data_de_nascimento")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataDeNascimento;

    @Column(name = "sexo")
    private Sexo sexo;

    @Column(name = "cargo_id")
    private Long cargo_id;

    @Column(name = "data_de_contratacao")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataDeContratacao;

    @Column(name = "salario")
    private double salario;

    @Column(name = "endereco")
    private String enderecoCompleto;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;

    @Column(name = "cep")
    private String cep;

    @Column(name = "email")
    private String email;

    @Column(name = "numero_de_telefone")
    private String numeroDeTelefone;

    @Column(name = "chefia_nome")
    private String chefiaNome;

    @Column(name = "chefia_id")
    private Long chefiaId;

    @Column(name = "data_criacao")
    private Date dataCriacao;

}
