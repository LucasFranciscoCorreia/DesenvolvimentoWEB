package br.ufrpe.greenhouse.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name="endereco")
public class Endereco {

  @Id
  @GeneratedValue(generator = "increment")
  @GenericGenerator(name = "increment", strategy = "increment")
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

  public Long getId_endereco() {
    return id_endereco;
  }

  public void setId_endereco(Long id_endereco) {
    this.id_endereco = id_endereco;
  }

  public Long getFk_id_usuario() {
    return fk_id_usuario;
  }

  public void setFk_id_usuario(Long fk_id_usuario) {
    this.fk_id_usuario = fk_id_usuario;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getTel_1() {
    return tel_1;
  }

  public void setTel_1(String tel_1) {
    this.tel_1 = tel_1;
  }

  public String getTel_2() {
    return tel_2;
  }

  public void setTel_2(String tel_2) {
    this.tel_2 = tel_2;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }
}
