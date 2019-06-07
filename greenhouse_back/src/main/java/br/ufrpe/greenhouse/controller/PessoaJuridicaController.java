package br.ufrpe.greenhouse.controller;

import br.ufrpe.greenhouse.entities.PessoaJuridica;
import br.ufrpe.greenhouse.service.JuridicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PessoaJuridicaController {

    @Autowired
    private JuridicoService service;

    @GetMapping(value = "/juridicos")
    public List<PessoaJuridica> juridicos() {return service.getAllFisicos();}

    @GetMapping(value = "/juridicos/id/{id}")
    public PessoaJuridica readJuridico(@PathVariable Long id) throws Exception{
        return this.service.read(id);
    }
    @GetMapping(value = "/juridicos/nome/{nome}")
    public PessoaJuridica filterBy(@PathVariable String nome) throws Exception{
        return this.service.filterBy(nome);
    }

    @PostMapping(value = "addjuridico")
    public Long addJuridico(@RequestBody PessoaJuridica pj) throws Exception{
        List<PessoaJuridica> list = this.juridicos();
        if(!list.contains(pj)){
            this.service.insert(pj);
        }else{
            throw new Exception("Pessoa Juridica Já Cadastrada");
        }
        return pj.getId_usu_juridico();
    }

}
