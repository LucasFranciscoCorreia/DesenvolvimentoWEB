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
    private Long id_fisico;

    @Column(name = "fk_id_usuario", unique = true, nullable = false)
    private Long fk_id_usuario;

    @Column(name="sexo")
    private char sexo;

    @Column(name="cpf", unique = true, length = 11)
    private String cpf;

    @Column(name="data_nascimento")
    private Date data_nascimento;

    @Column(name="nome",length = 50)
    private String nome;

}
