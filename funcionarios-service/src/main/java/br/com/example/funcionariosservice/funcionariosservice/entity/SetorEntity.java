package br.com.example.funcionariosservice.funcionariosservice.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "setor")
@Data
public class SetorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_do_setor")
    private String nomeDoSetor;

    @Column(name = "descricao")
    private String descricao;



}