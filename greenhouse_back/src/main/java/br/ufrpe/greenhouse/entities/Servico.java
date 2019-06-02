package br.ufrpe.greenhouse.entities;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name="servico")
public class Servico {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_servico")
  private Long id_servico;

  @Column(name = "preco")
  private Double preco;

  @Column(name = "tipo")
  private int tipo;

  @Column(name = "name")
  private String name;

  @Column(name = "srcPhoto")
  private String srcPhoto;

  @Column(name = "description")
  private String description;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSrcPhoto() {
    return srcPhoto;
  }

  public void setSrcPhoto(String srcPhoto) {
    this.srcPhoto = srcPhoto;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Servico(){

  }

  public Long getId_servico() {
    return id_servico;
  }

  public void setId_servico(Long id_servico) {
    this.id_servico = id_servico;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public int getTipo() {
    return tipo;
  }

  public void setTipo(int tipo) {
    this.tipo = tipo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Servico servico = (Servico) o;
    return id_servico.equals(servico.id_servico);
  }


}
