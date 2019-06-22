package br.ufrpe.greenhouse.repositories;

import br.ufrpe.greenhouse.entities.ItemPedido;
import br.ufrpe.greenhouse.entities.ItemPedidoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioItemPedido extends JpaRepository<ItemPedido, ItemPedidoPK> {
}
