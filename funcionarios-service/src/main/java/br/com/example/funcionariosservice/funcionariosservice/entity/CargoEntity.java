package br.com.example.funcionariosservice.funcionariosservice.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cargo")
@Data
public class CargoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_do_cargo")
    private String nomeDoCargo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "salario_base")
    private double salarioBase;

    @ManyToOne
    @JoinColumn(name = "setor_id")
    private SetorEntity setor;

}