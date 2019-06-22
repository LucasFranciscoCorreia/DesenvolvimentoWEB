package br.ufrpe.greenhouse.controller;

import br.ufrpe.greenhouse.entities.Pedido;
import br.ufrpe.greenhouse.entities.Usuario;
import br.ufrpe.greenhouse.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping(value = "/users")
    public List<Usuario> users() {
        return service.getAllUsers();
    }

    @GetMapping(value = "/users/id/{id}")
    public Usuario readUsuario(@PathVariable Long id) throws Exception {
        return this.service.read(id);
    }

    @GetMapping(path = "/users/filter")
    public List<Usuario> filterBy(@RequestParam String email) {
        return this.service.filterBy(email);
    }

    @PostMapping(value = "/adduser")
    public Long addUser(@RequestBody Usuario user) throws Exception {
        List<Usuario> users = this.users();
        if (!users.contains(user))
            this.service.insert(user);
        else
            throw new Exception("Usuario ja cadastrado");
        return user.getIdusuario();
    }

    @DeleteMapping(value = "/removeuser/{id}")
    public void removeUser(@PathVariable Long id) {
        this.service.drop(id);
    }


  @GetMapping(value = "/users/{email}/historico")
  public List<Pedido> readHistorico(@PathVariable String email) throws Exception {
    return this.service.readHistorico(email);
  }
}
