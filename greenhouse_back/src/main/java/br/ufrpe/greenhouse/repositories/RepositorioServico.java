package br.ufrpe.greenhouse.repositories;

import br.ufrpe.greenhouse.entities.Produto;
import br.ufrpe.greenhouse.entities.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioServico extends JpaRepository<Servico, Long> {

}
