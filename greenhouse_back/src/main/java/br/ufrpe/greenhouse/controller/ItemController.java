package br.ufrpe.greenhouse.controller;

import br.ufrpe.greenhouse.entities.Item;
import br.ufrpe.greenhouse.entities.Produto;
import br.ufrpe.greenhouse.service.ItemService;
import br.ufrpe.greenhouse.service.ProdutoService;
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

}
