package br.ufrpe.greenhouse.repositories;

import br.ufrpe.greenhouse.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RepositorioItem extends JpaRepository<Item, Long> {

  List<Item> findByTipo(int id);


}
