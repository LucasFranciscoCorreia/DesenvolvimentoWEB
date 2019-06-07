package br.ufrpe.greenhouse.service;

import br.ufrpe.greenhouse.entities.Usuario;
import br.ufrpe.greenhouse.repositories.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService{


    private RepositorioUsuario repositorio;

    @Autowired
    public UsuarioService(RepositorioUsuario repositorio){ this.repositorio = repositorio;}

    public List<Usuario> getAllUsers(){
        return this.repositorio.findAll();
    }

    public Usuario read(Long id) throws Exception {
        Optional<Usuario> user = this.repositorio.findById(id);
        if (!user.isPresent()) {
            throw new Exception("Usuario não encontrado");
        }

        return user.get();
    }

    public List<Usuario> filterBy(String email) {
    return this.repositorio.findByEmail(email);
  }

  public void insert(Usuario user) throws Exception{
    repositorio.save(user);
  }
}
