package br.ufrpe.greenhouse.service;

import br.ufrpe.greenhouse.entities.Produto;
import br.ufrpe.greenhouse.repositories.RepositorioProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService{


  private RepositorioProduto repositorio;

  @Autowired
  public ProdutoService(RepositorioProduto repositorio){ this.repositorio = repositorio;}

  public List<Produto> getAllProdutos(){
    return this.repositorio.findAll();
  }

  public void insert(Produto produto) throws Exception{
    repositorio.save(produto);
  }
}
