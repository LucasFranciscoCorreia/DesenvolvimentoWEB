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

    @GetMapping(value = "/")
    public String index(){
        return "index";
    }

    @GetMapping(value = "/users")
    public List<Usuario> users(){
        return service.getAllUsers();
    }

    @PostMapping(value = "/user")
    public void addUser(@RequestBody Usuario user) throws Exception{
        if (!this.users().contains(user)) {
            this.service.insert(user);
        }else{
            throw new Exception("Usuario ja cadastrado");
        }
    }

}