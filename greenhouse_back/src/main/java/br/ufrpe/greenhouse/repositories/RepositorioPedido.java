
package br.ufrpe.greenhouse.repositories;

  import br.ufrpe.greenhouse.entities.Item;
  import br.ufrpe.greenhouse.entities.Pedido;
  import org.springframework.data.jpa.repository.JpaRepository;
  import org.springframework.stereotype.Repository;

  import java.util.List;


@Repository
public interface RepositorioPedido extends JpaRepository<Pedido, Long> {

}
