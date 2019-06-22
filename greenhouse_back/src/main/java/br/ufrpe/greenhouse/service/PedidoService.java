package br.ufrpe.greenhouse.service;

import br.ufrpe.greenhouse.entities.Item;
import br.ufrpe.greenhouse.entities.Pedido;
import br.ufrpe.greenhouse.repositories.RepositorioItem;
import br.ufrpe.greenhouse.repositories.RepositorioPedido;
import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PedidoService {

  private RepositorioPedido repositorio;

  @Autowired
  public PedidoService(RepositorioPedido repositorio){ this.repositorio = repositorio;}

  public List<Pedido> getAllPedidos(){
    return this.repositorio.findAll();
  }

  public Pedido insert(Pedido pedido) throws Exception{
    pedido.setDateCreated(LocalDate.now());
    return repositorio.save(pedido);
  }

  public void update(Pedido order) {
    this.repositorio.save(order);
  }

}
