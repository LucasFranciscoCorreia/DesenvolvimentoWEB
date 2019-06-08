package br.ufrpe.greenhouse.service;

import br.ufrpe.greenhouse.entities.Servico;
import br.ufrpe.greenhouse.repositories.RepositorioServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService{


  private RepositorioServico repositorio;

  @Autowired
  public ServicoService(RepositorioServico repositorio){ this.repositorio = repositorio;}

  public List<Servico> getAllServicos(){
    return this.repositorio.findAll();
  }

  public void insert(Servico servico) throws Exception{
    repositorio.save(servico);
  }
}
