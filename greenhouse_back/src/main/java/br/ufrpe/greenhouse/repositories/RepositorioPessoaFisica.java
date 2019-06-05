package br.ufrpe.greenhouse.repositories;

import br.ufrpe.greenhouse.entities.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioPessoaFisica extends JpaRepository<PessoaFisica, Long> {
    PessoaFisica findByCpf(String cpf);
}
