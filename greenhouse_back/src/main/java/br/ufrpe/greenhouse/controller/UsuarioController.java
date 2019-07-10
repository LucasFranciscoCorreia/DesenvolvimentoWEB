package br.ufrpe.greenhouse.controller;

import br.ufrpe.greenhouse.entities.Pedido;
import br.ufrpe.greenhouse.entities.Usuario;
import br.ufrpe.greenhouse.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        if (!users.contains(user)){
          user.setHistorico(new ArrayList<Pedido>());
          this.service.insert(user);
        }else
            throw new Exception("Usuario ja cadastrado");
        return user.getIdusuario();
    }
  @PutMapping(path ="/{email}")
  public Usuario updateCustomer(@RequestBody Usuario usuario, @PathVariable String email)throws Exception {

    List<Usuario> customerOptional = this.service.filterBy(email);

    if (customerOptional.isEmpty())
      throw new Exception("Usuario não cadastrado");

    usuario.setIdusuario(customerOptional.get(0).getIdusuario());
    this.service.insert(usuario);

    return usuario;
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
