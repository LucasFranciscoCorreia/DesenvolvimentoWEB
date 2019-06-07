package br.ufrpe.greenhouse.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_endereco", unique = true, nullable = false)
    private Long id_endereco;

    @Column(name = "fk_id_usuario", nullable = false)
    private Long fk_id_usuario;

    @Column(name="rua", nullable = false)
    private String rua;

    @Column(name="numero", nullable = false)
    private int numero;

    @Column(name="complemento", nullable = false)
    private String complemento;

    @Column(name="tel_1")
    private String tel_1;

    @Column(name="tel_2")
    private String tel_2;

    @Column(name="cep",nullable = false)
    private String cep;

}
