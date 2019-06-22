package br.ufrpe.greenhouse.service;
import br.ufrpe.greenhouse.entities.Item;
import br.ufrpe.greenhouse.entities.ItemPedido;
import br.ufrpe.greenhouse.repositories.RepositorioItem;
import br.ufrpe.greenhouse.repositories.RepositorioItemPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemPedidoService {

  private RepositorioItemPedido orderProductRepository;

  public ItemPedidoService(RepositorioItemPedido orderProductRepository) {
    this.orderProductRepository = orderProductRepository;
  }

  public ItemPedido create(ItemPedido orderProduct) {
    return this.orderProductRepository.save(orderProduct);
  }
}
