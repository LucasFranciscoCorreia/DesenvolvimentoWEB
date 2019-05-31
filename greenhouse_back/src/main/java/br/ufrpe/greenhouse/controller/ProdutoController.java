package br.ufrpe.greenhouse.controller;

import br.ufrpe.greenhouse.entities.Produto;
import br.ufrpe.greenhouse.entities.Usuario;
import br.ufrpe.greenhouse.service.ProdutoService;
import br.ufrpe.greenhouse.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ProdutoController{

  @Autowired
  private ProdutoService service;
  

  @GetMapping(value = "/produtos")
  public List<Produto> produtos(){
    return service.getAllProdutos();
  }

  @PostMapping(value = "/produto")
  public void addProduto(@RequestBody Produto produto) throws Exception{
    List<Produto> produtos = this.produtos();
    if(!produtos.contains(produto))
      this.service.insert(produto);
    else
      throw new Exception("Produto ja cadastrado");
  }

}
