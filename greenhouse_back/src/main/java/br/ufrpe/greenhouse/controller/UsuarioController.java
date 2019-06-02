package br.ufrpe.greenhouse.controller;

import br.ufrpe.greenhouse.entities.Usuario;
import br.ufrpe.greenhouse.repositories.RepositorioUsuario;
import br.ufrpe.greenhouse.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class UsuarioController{

    @Autowired
    private UsuarioService service;
    @GetMapping(value = "/")
    public String index(){
        return "index";
    }

    @GetMapping(value = "/users")
    public List<Usuario> users(){
        return service.getAllUsers();
    }

  @GetMapping(value = "/users/{id}")
  public Usuario readUsuario(@PathVariable Long id) throws Exception {
    return this.service.read(id);
  }
  @GetMapping(path="/users/filter")
  public List<Usuario> filterBy(@RequestParam String email) {
    return this.service.filterBy(email);
  }

    @PostMapping(value = "/user")
    public void addUser(@RequestBody Usuario user) throws Exception{
        List<Usuario> users = this.users();
        if(!users.contains(user))
            this.service.insert(user);
        else
            throw new Exception("Usuario ja cadastrado");
    }

}
