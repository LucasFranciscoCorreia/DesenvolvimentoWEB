package br.ufrpe.greenhouse.repositories;

import br.ufrpe.greenhouse.entities.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPessoaFisica extends JpaRepository<PessoaFisica, Long> {

}
