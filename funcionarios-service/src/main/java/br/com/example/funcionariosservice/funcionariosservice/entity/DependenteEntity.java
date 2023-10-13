package br.com.example.funcionariosservice.funcionariosservice.entity;


import br.com.example.funcionariosservice.funcionariosservice.enumeration.Sexo;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "dependente")
@Data
public class DependenteEntity {

    @Column(name = "funcionario_id")
    private Long funcionarioId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDependente;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(name = "tipo_parente")
    private String tipoParente;

    @Column(name = "sexo")
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Column(name = "idade")
    private String idade;

}