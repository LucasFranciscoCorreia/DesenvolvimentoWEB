package br.ufrpe.greenhouse.controller;

import br.ufrpe.greenhouse.entities.Item;
import br.ufrpe.greenhouse.entities.Servico;
import br.ufrpe.greenhouse.service.ItemService;
import br.ufrpe.greenhouse.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
public class ServicoController{

  @Autowired
  private ItemService service;

  @GetMapping(path="/servicos")
  public List<Item> servicos() {
    return service.getAllByTipo(2);
  }

  @PostMapping(value = "/servico")
  public void addServico(@RequestBody Item servico) throws Exception{
    List<Item> produtos = this.servicos();
    servico.setTipo(2);
    if(!produtos.contains(servico))
      this.service.insert(servico);
    else
      throw new Exception("Servico ja cadastrado");
  }

/*
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
*/
}
