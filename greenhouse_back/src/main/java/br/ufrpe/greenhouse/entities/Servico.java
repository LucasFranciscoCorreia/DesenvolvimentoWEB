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
