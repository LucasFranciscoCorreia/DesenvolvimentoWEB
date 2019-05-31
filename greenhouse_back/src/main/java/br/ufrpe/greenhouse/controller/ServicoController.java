package br.ufrpe.greenhouse.controller;

import br.ufrpe.greenhouse.entities.Produto;
import br.ufrpe.greenhouse.entities.Servico;
import br.ufrpe.greenhouse.service.ProdutoService;
import br.ufrpe.greenhouse.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
public class ServicoController{

  @Autowired
  private ServicoService service;


  @GetMapping(value = "/servicos")
  public List<Servico> servicos(){
    return service.getAllServicos();
  }

  @PostMapping(value = "/servico")
  public void addServico(@RequestBody Servico servico) throws Exception{
    List<Servico> servicos = this.servicos();
    if(!servicos.contains(servico))
      this.service.insert(servico);
    else
      throw new Exception("Servico ja cadastrado");
  }

}
