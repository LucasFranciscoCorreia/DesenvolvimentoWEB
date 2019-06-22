package br.ufrpe.greenhouse.controller;

import br.ufrpe.greenhouse.dto.ItemPedidoDto;
import br.ufrpe.greenhouse.entities.*;

import br.ufrpe.greenhouse.service.ItemPedidoService;
import br.ufrpe.greenhouse.service.ItemService;
import br.ufrpe.greenhouse.service.PedidoService;
import br.ufrpe.greenhouse.service.UsuarioService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class PedidoController {


  @Autowired
  private PedidoService service;

  @Autowired
  private ItemService productService;

  @Autowired
  private ItemPedidoService orderProductService;

  @Autowired
  private UsuarioService usuarioService;

  @GetMapping(path="/pedidos")
  public List<Pedido> pedidos() {
    return service.getAllPedidos();
  }


  @PostMapping(value = "/pedido")
  public void addPedido(@RequestBody OrderForm form) throws Exception {
    List<ItemPedidoDto> formDtos = form.getProductOrders();
    List<Pedido> pedidos = this.pedidos();
    Pedido order = new Pedido();
    order.setUsuario(usuarioService.filterBy(form.getUserEmail()).get(0) );
    order = this.service.insert(order);

    List<ItemPedido> orderProducts = new ArrayList<>();
    for (ItemPedidoDto dto : formDtos) {
      orderProducts.add(orderProductService.create(new ItemPedido(order,
        productService.getById(dto.getItem().getId()), dto.getQtd())));
    }

    order.setOrderProducts(orderProducts);

    this.service.update(order);

  }


}
