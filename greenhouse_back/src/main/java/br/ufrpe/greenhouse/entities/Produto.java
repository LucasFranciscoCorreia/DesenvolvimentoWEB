package br.ufrpe.greenhouse.entities;

import javax.persistence.*;


@Entity
@Table(name="produto")
public class Produto {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_produto")
  private Long id_produto;

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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Produto(){

  }

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

  public Long getId_produto() {
    return id_produto;
  }

  public void setId_produto(Long id_produto) {
    this.id_produto = id_produto;
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
    Produto produto = (Produto) o;
    return id_produto.equals(produto.id_produto);
  }

}
