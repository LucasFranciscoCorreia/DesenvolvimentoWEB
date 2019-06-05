package br.ufrpe.greenhouse.controller;

import br.ufrpe.greenhouse.entities.Usuario;
import br.ufrpe.greenhouse.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UsuarioController{
    @Autowired
    private UsuarioService service;

    @GetMapping(value = "/users")
    public List<Usuario> users(){
        return service.getAllUsers();
    }

    @GetMapping(value = "/users/id/{id}")
    public Usuario readUsuario(@PathVariable Long id) throws Exception {
        return this.service.read(id);
    }

    @GetMapping(value="/users/email/{email}")
    public List<Usuario> filterBy(@PathVariable String email) {
        return this.service.filterBy(email);
    }

    @PostMapping(value = "/adduser")
    public void addUser(@RequestBody Usuario user) throws Exception{
        List<Usuario> users = this.users();
        if(!users.contains(user))
            this.service.insert(user);
        else
            throw new Exception("Usuario ja cadastrado");
    }
}
