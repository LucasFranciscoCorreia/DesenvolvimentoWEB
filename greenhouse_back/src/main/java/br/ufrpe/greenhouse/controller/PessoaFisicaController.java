package br.ufrpe.greenhouse.controller;

import br.ufrpe.greenhouse.entities.PessoaFisica;
import br.ufrpe.greenhouse.service.FisicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value = "/fisicos/cpf/{cpf}")
    public PessoaFisica filterBy(@PathVariable String cpf) throws Exception{
        return this.service.filterBy(cpf);
    }

    @PostMapping(value = "/addfisico")
    public Long addFisico(@RequestBody PessoaFisica pf) throws Exception {
        List<PessoaFisica> list = this.fisicos();
        if (!list.contains(pf)) {
            this.service.insert(pf);
        } else {
            throw new Exception("Pessoa Fisica Já Cadastrada");
        }
        return pf.getId_usu_fisico();
    }
}
