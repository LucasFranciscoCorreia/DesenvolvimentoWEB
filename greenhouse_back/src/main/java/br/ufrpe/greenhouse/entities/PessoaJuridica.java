package br.ufrpe.greenhouse.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="juridico")
public class PessoaJuridica {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usu_juridico")
    private Long id_usu_juridico;

    @Column(name="fk_id_usuario", nullable = false)
    private Long fk_id_usuario;

    @Column(name="nome_fantasia", nullable = false)
    private String nome;

    @Column(name="cnpj", nullable = false)
    private String cnpj;
}
