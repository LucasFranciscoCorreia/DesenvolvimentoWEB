package br.ufrpe.greenhouse.service;

import br.ufrpe.greenhouse.entities.Endereco;
import br.ufrpe.greenhouse.repositories.RepositorioEndereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    private RepositorioEndereco repo;

    @Autowired
    public EnderecoService(RepositorioEndereco rep){ this.repo = rep;}

    public List<Endereco> getAllEnderecos(){
        return this.repo.findAll();
    }

    public Endereco read(Long id) throws Exception{
        Optional<Endereco> fisicos = this.repo.findById(id);
        if(!fisicos.isPresent()){
            throw new Exception("Pessoa Fisica não encontrada");
        }

        return fisicos.get();
    }


    public void insert(Endereco end){
        this.repo.save(end);
    }
}
