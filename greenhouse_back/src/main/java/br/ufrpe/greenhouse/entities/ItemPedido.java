package br.ufrpe.greenhouse.entities;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class ItemPedido {

    @EmbeddedId
    @JsonIgnore
    private ItemPedidoPK pk;

    @Column(nullable = false)
    private Integer quantity;

  public ItemPedido() {
  }

  public ItemPedido(Pedido order, Item product, Integer quantity) {
      pk = new ItemPedidoPK();
      pk.setOrder(order);
      pk.setProduct(product);
      this.quantity = quantity;
    }

    @Transient
    public Item getProduct() {
      return this.pk.getProduct();
    }

    @Transient
    public Double getTotalPrice() {
      return getProduct().getPreco() * getQuantity();
    }

    public ItemPedidoPK getPk() {
      return pk;
    }

    public void setPk(ItemPedidoPK pk) {
      this.pk = pk;
    }

    public Integer getQuantity() {
      return quantity;
    }

    public void setQuantity(Integer quantity) {
      this.quantity = quantity;
    }


  }
