package br.ufrpe.greenhouse.dto;

import br.ufrpe.greenhouse.entities.Item;

public class ItemPedidoDto {

  private Item item;
  //private long item;
  private int qtd;


  public ItemPedidoDto() {

  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public int getQtd() {
    return qtd;
  }

  public void setQtd(int qtd) {
    this.qtd = qtd;
  }
}
