package br.ufrpe.greenhouse.controller;

import br.ufrpe.greenhouse.entities.Endereco;
import br.ufrpe.greenhouse.entities.PessoaFisica;
import br.ufrpe.greenhouse.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EnderecoController {

    @Autowired
    private EnderecoService service;


    @GetMapping(value = "/enderecos")
    public List<Endereco> enderecos() {return service.getAllEnderecos();}

    @GetMapping(value = "/enderecos/id/{id}")
    public Endereco readFisico(@PathVariable Long id) throws Exception{
        return this.service.read(id);
    }

    @PostMapping(value = "/addendereco")
    public Long addEndereco(@RequestBody Endereco end) throws Exception {
        List<Endereco> list = this.enderecos();
        if (!list.contains(end)) {
            this.service.insert(end);
        } else {
            throw new Exception("Endereco Já Cadastrado");
        }
        return end.getId_endereco();
    }

  @PutMapping(path ="/endereco/{id}")
  public Endereco updateCustomer(@RequestBody Endereco endereco, @PathVariable Long id)throws Exception {

    Endereco customerOptional = this.service.read(id);

    if (customerOptional == null)
      throw new Exception("Endereco não cadastrado");

    endereco.setFk_id_usuario(id);
    this.service.insert(endereco);

    return endereco;
  }
}
