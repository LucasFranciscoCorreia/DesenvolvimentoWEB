package br.ufrpe.greenhouse.service;

import br.ufrpe.greenhouse.entities.Usuario;
import br.ufrpe.greenhouse.repositories.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService{


    private RepositorioUsuario repositorio;

    @Autowired
    public UsuarioService(RepositorioUsuario repositorio){ this.repositorio = repositorio;}

    public List<Usuario> getAllUsers(){
        return this.repositorio.findAll();
    }

    public void insert(Usuario user) throws Exception{
        repositorio.save(user);
    }
}