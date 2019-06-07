package br.ufrpe.greenhouse.entities;

  import lombok.Data;
  import org.springframework.web.bind.annotation.CrossOrigin;

  import javax.persistence.*;
  import java.util.List;
  import java.util.Objects;

@Entity
@Data
@Table(name="item")
public class Item {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Long id;

  @Column(name = "tipo")
  private int tipo;

  @Column(name = "preco")
  private Double preco;

  @Column(name = "name")
  private String name;

  @Column(name = "srcPhoto")
  private String srcPhoto;

  @Column(name = "description")
  private String description;

  public Item(){

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Item item = (Item) o;
    return id.equals(item.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public int getTipo() {
    return tipo;
  }

  public void setTipo(int tipo) {
    this.tipo = tipo;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
