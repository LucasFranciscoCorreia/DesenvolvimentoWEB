<template>
  <main style=" background-color: #E6E6E6;">

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-8 col-md-8 col-lg-8">
          <div style="background-color: white; border-radius: 1rem; padding: 20px; margin: 20px;">
            <div class="row">
              <h1 style=" margin:auto;">
                <strong>Carrinho</strong>
              </h1>
            </div>
            <CarrinhoItem :CarrinhoItems="carrinho" :total="total" :parentfunction="calcular()"/>

            

          </div>
        </div>
        <div class="col-sm-4 col-md-4 col-lg-4">

          <div style="background-color: white; border-radius: 1rem; padding: 20px; margin: 20px;">
            <div class="row">
              <h1 style=" margin:auto;">
                <strong>Resumo</strong>
              </h1>
            </div>
            <hr class="my-4">
            <div class="row">
                <div class="col-sm-8 col-md-8 col-lg-8">
                    <h4>
                        Total
                    </h4>

                </div>
                <div class="col-sm-4 col-md-4 col-lg-4">
                   <h4> R$ {{total}}</h4>
                
                </div>

            </div>
            </div>

          
        <div class="row">
        
          <div style="background-color: white; border-radius: 1rem; padding: 20px; margin: 20px;">
            <div class="row">
              <h1 style=" margin:auto;">
                <strong>Pagamento</strong>
              </h1>
              
            </div><hr class="my-4">
            <div class="row">
                    <div class="row">
                        <div class="col-sm-10 col-md-10 col-lg-10">
                            <input type="text" placeholder="Número do Cartão" v-model="email">
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-md-6 col-lg-6">
                            <input type="password" placeholder="Data de Vencimento" v-model="password">
                        </div>

                        <div class="col-sm-6 col-md-6 col-lg-6">
                            <input type="password" placeholder="Código de Segurança" v-model="password">
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-6 col-md-6 col-lg-6">
                            <input type="text" placeholder="Nome" v-model="nome">
                        </div>

                        <div class="col-sm-6 col-md-6 col-lg-6">
                            <input type="text" placeholder="Sobrenome   " v-model="CPF">
                        </div>
                    </div>
                    
            </div>
            
            
            <button type="button" class="btn btn-dark" v-on:click="comprar" style="width:100%">Finalizar Compra</button>
            </div>
             </div>
      </div>
      </div>
    </div>
  </main>
</template>

<script>
import CarrinhoItem from "./CarrinhoItem.vue"

class Item {
  constructor(nome, preco, srcPhoto, qtd, id) {
    this.nome = nome;
    this.preco = preco;
    this.srcPhoto = srcPhoto;
    this.qtd = qtd;
    this.id = id
  }
}
export default {
  name: "Carrinho",
  components: {
    CarrinhoItem
  },
  props: {
    isLogged: Boolean,
    total:Number,
    carrinho: Array
  },
  data: () => {
    return {
    };
  },
  methods:{
    calcular(){
      var valor = 0
       for(var i=0; i< this.carrinho.length;i++){
          valor = valor + (this.carrinho[i].preco * this.carrinho[i].qtd)
      }
      this.total = valor
    },
    comprar(){

      
    }
  },
   mounted(){
       this.total = 0
      for(var i=0; i< this.carrinho.length;i++){
          this.total = this.total + (this.carrinho[i].preco * this.carrinho[i].qtd)
      }
  }
};

</script>

<style scoped>
.banner {
  widows: 100%;
  width: 100%;
  max-width: 10em;
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  margin: auto;
}
.image {
  width: 100%;
  max-width: 25em;
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

.display {
  background-color: white;
  border-radius: 50px;
  padding: 10px;
  margin: 10px;
}
</style>
