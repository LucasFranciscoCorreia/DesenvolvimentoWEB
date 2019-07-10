package br.ufrpe.greenhouse.controller;

import br.ufrpe.greenhouse.entities.PessoaFisica;
import br.ufrpe.greenhouse.entities.Usuario;
import br.ufrpe.greenhouse.service.FisicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.util.List;

@CrossOrigin
@RestController
public class PessoaFisicaController {

    @Autowired
    private FisicoService service;

    @GetMapping(value = "/fisicos")
    public List<PessoaFisica> fisicos() {return service.getAllFisicos();}

    @GetMapping(value = "/fisicos/id/{id}")
    public PessoaFisica readFisico(@PathVariable Long id) throws Exception{
        return this.service.read(id);
    }
  @PutMapping(path ="/fisico/{id}")
  public PessoaFisica updateCustomer(@RequestBody PessoaFisica usuario, @PathVariable Long id)throws Exception {

    PessoaFisica customerOptional = this.service.read(id);

    if (customerOptional == null)
      throw new Exception("Usuario não cadastrado");

    usuario.setFk_id_usuario(id);
    this.service.insert(usuario);

    return usuario;
  }

    @PostMapping(value = "/addfisico")
    public void addFisico(@RequestBody PessoaFisica pf) throws Exception{
        List<PessoaFisica> list = this.fisicos();
        if(!list.contains(pf)){
            this.service.insert(pf);
        }else{
            throw new Exception("Pessoa Fisica Já Cadastrada");
        }
    }
}
