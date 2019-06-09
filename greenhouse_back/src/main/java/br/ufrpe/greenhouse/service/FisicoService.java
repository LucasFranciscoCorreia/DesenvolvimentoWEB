package br.ufrpe.greenhouse.service;

import br.ufrpe.greenhouse.entities.PessoaFisica;
import br.ufrpe.greenhouse.repositories.RepositorioPessoaFisica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public PessoaFisica read(Long id) {
4        List<PessoaFisica> list = this.getAllFisicos();
        for(PessoaFisica pf : list){
            if(pf.getFk_id_usuario().longValue() == id.longValue()){
                return pf;
            }
        }
        return null;
    }

    public void insert(PessoaFisica pf){
        this.repo.save(pf);
    }
}
