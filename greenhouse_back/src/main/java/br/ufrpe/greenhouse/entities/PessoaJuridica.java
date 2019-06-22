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

  public Long getId_usu_juridico() {
    return id_usu_juridico;
  }

  public void setId_usu_juridico(Long id_usu_juridico) {
    this.id_usu_juridico = id_usu_juridico;
  }

  public Long getFk_id_usuario() {
    return fk_id_usuario;
  }

  public void setFk_id_usuario(Long fk_id_usuario) {
    this.fk_id_usuario = fk_id_usuario;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }
}
