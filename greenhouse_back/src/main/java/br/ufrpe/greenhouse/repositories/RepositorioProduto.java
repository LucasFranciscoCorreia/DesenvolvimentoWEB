package br.ufrpe.greenhouse.repositories;

import br.ufrpe.greenhouse.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioProduto extends JpaRepository<Produto, Long> {

}
