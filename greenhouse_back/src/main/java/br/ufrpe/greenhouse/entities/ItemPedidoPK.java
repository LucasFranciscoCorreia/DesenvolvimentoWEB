package br.ufrpe.greenhouse.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class ItemPedidoPK implements Serializable {

  @JsonBackReference
  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  @JoinColumn(name = "id_pedido")
  private Pedido order;

  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  @JoinColumn(name = "id_item")
  private Item product;

  public ItemPedidoPK() {
  }

  public Pedido getOrder() {
    return order;
  }

  public void setOrder(Pedido order) {
    this.order = order;
  }

  public Item getProduct() {
    return product;
  }

  public void setProduct(Item product) {
    this.product = product;
  }
}
