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
    private Long id_usu__juridico;

    @Column(name="fk_id_usuario")
    private Long fk_id_usuario;

    @Column(name="nome_fantasia")
    private String nome;

    @Column(name="cnpj")
    private String cnpj;
}
