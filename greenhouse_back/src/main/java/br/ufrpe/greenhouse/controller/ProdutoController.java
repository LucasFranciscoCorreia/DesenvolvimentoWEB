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
public class ProdutoController{


  @Autowired
  private ItemService service;

  @GetMapping(path="/produtos")
  public List<Item> produtos() {
    return service.getAllByTipo(1);
  }

  @PostMapping(value = "/produto")
  public void addProduto(@RequestBody Item produto) throws Exception{
    List<Item> produtos = this.produtos();
    produto.setTipo(1);
    if(!produtos.contains(produto))
      this.service.insert(produto);
    else
      throw new Exception("Produto ja cadastrado");
  }

  @DeleteMapping(value = "/removeproduto/{id}")
  public void removeProduto(@PathVariable Long id) {
    this.service.drop(id);
  }
 /* @Autowired
  private ProdutoService service;


  /*@GetMapping(value = "/produtos")
  public List<Produto> produtos(){
    return service.getAllProdutos();
  }
/*
  @PostMapping(value = "/produto")
  public void addProduto(@RequestBody Produto produto) throws Exception{
    List<Produto> produtos = this.produtos();
    if(!produtos.contains(produto))
      this.service.insert(produto);
    else
      throw new Exception("Produto ja cadastrado");
  }
*/
}
