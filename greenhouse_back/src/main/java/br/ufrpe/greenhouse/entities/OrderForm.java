package br.ufrpe.greenhouse.entities;

import br.ufrpe.greenhouse.dto.ItemPedidoDto;
import lombok.Data;

import javax.persistence.*;
import java.util.List;


public class OrderForm {

  private String userEmail;

  private List<ItemPedidoDto> productOrders;

  public List<ItemPedidoDto> getProductOrders() {

    return productOrders;
  }

  public void setProductOrders(List<ItemPedidoDto> productOrders) {
    this.productOrders = productOrders;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }
}
