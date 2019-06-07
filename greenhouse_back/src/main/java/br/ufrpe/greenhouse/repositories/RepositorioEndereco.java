package br.ufrpe.greenhouse.repositories;

import br.ufrpe.greenhouse.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEndereco extends JpaRepository<Endereco, Long> {

}
