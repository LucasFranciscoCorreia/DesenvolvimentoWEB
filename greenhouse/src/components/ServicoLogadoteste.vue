
<template>
  <main>
    <div class="row py-4" style="background-color:#63CF67">
      <div class="col-lg-4 col-md-4 col-sm-4 ml-auto">
        <img class="image" src="assets/tools.png" alt="tools">
      </div>
      <p
        class="exp col-lg-4 col-md-4 col-sm-4 gray-text"
        style="font-size: 50px;font-weight: bold;font-family: Lato"
      >
        <b>Contrate um serviço</b>
      </p>
      <div class="col-lg-4 col-md-4 col-sm-4 ml-auto">
        <img class="image" src="assets/naturehands.png" alt="naturehands" width="100px">
      </div>
    </div>
   <Servico :items="items" :CarrinhoItems="carrinho" :parentfunction="addItem" style="margin-top: 20px; margin-bottom:20px;" />


    <div class="row py-4 text-md-right" style="background-color:#FFF285">
      <p class="gray-text" style="font-size: 38px;font-weight: lighter;font-family: Lato">
        <b>Tem uma outra necessidade com que possamos ajudar?</b>
      </p>

      <p class="gray-text" style="font-size: 38px;font-weight: bold;font-family: Lato">
        <u>Fale Conosco</u>
      </p>

      <div class="col-lg-3 col-md-3 col-sm-3 text-md-center">
        <img src="assets/smiley.png" alt="smiley" width="110px">
      </div>
    </div>
  </main>
</template>
<script>
import Servico from "./Servico.vue";
import http from "../http-common";

import CarrinhoItem from "./CarrinhoItem.vue"

class Item {
  constructor(nome,text, preco, srcPhoto, qtd, id) {
    this.nome = nome;
    this.text = text
    this.preco = preco;
    this.srcPhoto = srcPhoto;
    this.qtd = qtd;
    this.id = id
  }
}
export default {
  name: "ServicoLogado",
  components: {
    Servico,
    CarrinhoItem
  },
  props:{
    isLogged: Boolean,
    parentfunction: Function,
    
  },
  data: () => {
    return {
      items: [
      /*{
        title: "Abastecimento",
        text: "Lorem ipsum dolor sit amet, consectetur adipiscing elit.Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
        src: "./assets/organic.png"
      },
      {
        title: "Manuntenção",
        text: "Lorem ipsum dolor sit amet, consectetur adipiscing elit.Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
        src: "./assets/maintenance.png"
      },
      {
        title: "Coleta",
        text: "Lorem ipsum dolor sit amet, consectetur adipiscing elit.Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
        src: "./assets/truck.png"
      }*/],

      carrinho:Array
      
    
      
    }
  },
  methods:{
    addItem(){
      alert(this.carrinho.length)
      this.cart.push(new Item("Serviço de Coleta de Lixo",400.00,"assets/truck.png",2 ,2))
      this.parentfunction()
      alert(this.cart.length)
      this.carrinho = this.cart
    }
  },
   mounted(){
    // alert("aaa"+this.carrinho.length)
    http
          .get("/servicos")
          .then(response => {
            for(var i = 0; i<response.data.length ; i++){
             this.items.push({
                nome: response.data[i].name,
                text: response.data[i].description,
                src: response.data[i].srcPhoto,
                preco: response.data[i].preco,
                qtd: 1,
             }
                
              )

            }
            
          });
  }
};
</script>
<style scoped>
.image {
  width: 100%;
  max-width: 7em;
  display: block;
  margin-left: auto;
  margin-right: auto;
}
.exp {
  text-align: center;
  margin: auto;
  width: 50%;
  padding: 10px;
}
</style>
