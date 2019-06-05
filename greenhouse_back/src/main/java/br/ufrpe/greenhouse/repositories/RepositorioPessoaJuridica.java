package br.ufrpe.greenhouse.repositories;

import br.ufrpe.greenhouse.entities.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPessoaJuridica extends JpaRepository<PessoaJuridica, Long> {
    PessoaJuridica findByNome(String nome);
}
