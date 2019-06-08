package br.ufrpe.greenhouse.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name="fisico")
public class PessoaFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usu_fisico", unique = true, nullable = false)
    private Long id_usu_fisico;

    @JoinColumn(name="fk_id_usuario", referencedColumnName = "idusuario",nullable = false, unique = true)
    private Long fk_id_usuario;

    @Column(name="sexo", nullable = false)
    private char sexo;

    @Column(name="cpf", unique = true, length = 11, nullable = false)
    private String cpf;

    @Column(name="data_nascimento", nullable = false)
    private Date data_nascimento;

    @Column(name="nome",length = 50, nullable = false)
    private String nome;
}
