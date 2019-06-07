package br.ufrpe.greenhouse.repositories;

import br.ufrpe.greenhouse.entities.Item;
import br.ufrpe.greenhouse.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioItem extends JpaRepository<Item, Long> {

}
