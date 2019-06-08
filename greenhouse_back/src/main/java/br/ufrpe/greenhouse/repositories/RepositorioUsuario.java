package br.ufrpe.greenhouse.repositories;


import br.ufrpe.greenhouse.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
  List<Usuario> findByEmail(String email);
}
