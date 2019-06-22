package br.ufrpe.greenhouse.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Entity
@Table(name = "pedido")
public class Pedido {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate dateCreated;

  @JsonIgnore
  @ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="idusuario")
  private Usuario usuario;

  @JsonManagedReference
  @OneToMany(mappedBy = "pk.order")
  @Valid
  private List<ItemPedido> orderProducts = new ArrayList<>();


  @Transient
  public Double getTotalOrderPrice() {
    double sum = 0D;
    List<ItemPedido> orderProducts = getOrderProducts();
    for (ItemPedido op : orderProducts) {
      sum += op.getTotalPrice();
    }

    return sum;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDate getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(LocalDate dateCreated) {
    this.dateCreated = dateCreated;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public List<ItemPedido> getOrderProducts() {
    return orderProducts;
  }

  public void setOrderProducts(List<ItemPedido> orderProducts) {
    this.orderProducts = orderProducts;
  }
}
