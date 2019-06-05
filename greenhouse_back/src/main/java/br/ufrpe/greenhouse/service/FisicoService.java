package br.ufrpe.greenhouse.service;

import br.ufrpe.greenhouse.entities.PessoaFisica;
import br.ufrpe.greenhouse.repositories.RepositorioPessoaFisica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FisicoService {

    private RepositorioPessoaFisica repo;

    @Autowired
    public FisicoService(RepositorioPessoaFisica rep){
        this.repo = rep;
    }

    public List<PessoaFisica> getAllFisicos(){
        return this.repo.findAll();
    }

    public PessoaFisica read(Long id) throws Exception{
        Optional<PessoaFisica> fisicos = this.repo.findById(id);
        if(!fisicos.isPresent()){
            throw new Exception("Pessoa Fisica não encontrada");
        }

        return fisicos.get();
    }

    public PessoaFisica filterBy(String cpf){
        return repo.findByCpf(cpf);
    }
    public void insert(PessoaFisica pf){
        this.repo.save(pf);
    }
}
