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

    public Endereco read(Long id) {
        List<Endereco> list = this.getAllEnderecos();
        for(Endereco end : list){
            if(end.getFk_id_usuario().longValue() == id.longValue()){
                return end;
            }
        }
        return null;
    }


    public void insert(Endereco end){
        this.repo.save(end);
    }
}
