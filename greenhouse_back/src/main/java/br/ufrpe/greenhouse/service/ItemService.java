package br.ufrpe.greenhouse.service;

import br.ufrpe.greenhouse.entities.Item;
import br.ufrpe.greenhouse.repositories.RepositorioItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService{


  private RepositorioItem repositorio;

  @Autowired
  public ItemService(RepositorioItem repositorio){ this.repositorio = repositorio;}

  public List<Item> getAllItens(){
    return this.repositorio.findAll();
  }

  public void insert(Item item) throws Exception{
    repositorio.save(item);
  }

  public List<Item> getAllByTipo(int tipo){
    return this.repositorio.findByTipo(tipo);
  }

  public Item getById(Long id){
    return this.repositorio.findById(id).orElseThrow();
  }

}
