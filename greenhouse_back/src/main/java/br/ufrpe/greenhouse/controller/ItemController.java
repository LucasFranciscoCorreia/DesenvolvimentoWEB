package br.ufrpe.greenhouse.controller;

import br.ufrpe.greenhouse.entities.Item;
import br.ufrpe.greenhouse.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ItemController{

  @Autowired
  private ItemService service;


  @GetMapping(value = "/itens")
  public List<Item> itens(){
    return service.getAllItens();
  }

  @PostMapping(value = "/item")
  public void addItem(@RequestBody Item item) throws Exception{
    List<Item> itens = this.itens();
    if(!itens.contains(item))
      this.service.insert(item);
    else
      throw new Exception("Item ja cadastrado");
  }
/*
  @GetMapping(path="/produtos")
  public List<Item> produtos() {
    return service.getAllByTipo(1);
  }

  @GetMapping(path="/itens/servicos")
  public List<Item> servicos() {
    return service.getAllByTipo(2);
  }

  @PostMapping(value = "/produto")
  public void addProduto(@RequestBody Item produto) throws Exception{
    List<Item> produtos = this.produtos();
    produto.setTipo(1);
    if(!produtos.contains(produto))
      this.service.insert(produto);
    else
      throw new Exception("Produto ja cadastrado");
  }*/
}
