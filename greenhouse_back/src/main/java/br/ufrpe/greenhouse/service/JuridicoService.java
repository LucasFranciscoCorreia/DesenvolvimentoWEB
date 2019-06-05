package br.ufrpe.greenhouse.service;

import br.ufrpe.greenhouse.entities.PessoaJuridica;
import br.ufrpe.greenhouse.repositories.RepositorioPessoaJuridica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JuridicoService {

    @Autowired
    private RepositorioPessoaJuridica repo;


    public List<PessoaJuridica> getAllFisicos(){
        return this.repo.findAll();
    }

    public PessoaJuridica read(Long id) throws Exception{
        Optional<PessoaJuridica> juridicos = this.repo.findById(id);
        if(!juridicos.isPresent()){
            throw new Exception("Pessoa Juridica não encontrada");
        }

        return juridicos.get();
    }

    public void insert(PessoaJuridica pf){
        this.repo.save(pf);
    }

    public PessoaJuridica filterBy(String nome) {
        return this.repo.findByNome(nome);
    }
}
