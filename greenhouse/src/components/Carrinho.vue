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
                        <div class="col-sm-10 col-md-10 col-lg-10 ">
                          
                            <input id="cartao" type="text" placeholder="XXXX XXXX XXXX XXXX" v-model="cartao">
                            <label for="cartao" style="color: #949494;"> Numero do cartao</label>
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-md-6 col-lg-6">
                          
                            <input type="text" placeholder="MM/AA" v-model="vencimento">
                            <label for="cartao" style="color:#949494;">Data de Vencimento</label>
                        </div>

                        <div class="col-sm-6 col-md-6 col-lg-6">
                            <input type="text" placeholder="3 ou 4 dígitos" v-model="codSeguranca">
                            <label for="cartao" style="color:#949494;">Código de Segurança</label>

                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-6 col-md-6 col-lg-6">
                          
                            <input type="text" placeholder="Como consta no cartão" v-model="nome">
                            <label for="cartao" style="color:#949494;">Nome</label>
                        </div>

                        <div class="col-sm-6 col-md-6 col-lg-6">
                          
                            <input type="text" placeholder="Como consta no cartão" v-model="sobrenome">
                            <label for="cartao" style="color:#949494;">Sobrenome</label>
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
import http from "../http-common";

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
      cartao:"",
      vencimento: "",
      codSeguranca:"",
      nome: "",
      sobrenome: ""

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
    verificaCampos(){
      if (
          this.cartao &&
          this.vencimento &&
          this.codSeguranca &&
          this.nome &&
          this.sobrenome 
        ) {
          if (this.cartao.length <16 || this.cartao.length > 19) {
            alert("Número de Cartão inválido")
            return false;
          } else if (this.vencimento.length != 5) { // mes-ano
            alert("Informe uma data valida");
            return false;
          } else if (this.nome.length < 2 || this.nome.length > 30) {
            if (this.nome.length < 2) {
              alert("Nome muito curto\n R U a robot?");
            } else {
              alert("Nome muito longo");
            }
            return false;
          } else if (this.sobrenome.length < 2 || this.sobrenome.length > 30) {
            if (this.sobrenome.length < 2) {
              alert("Sobrenome muito curto\n R U a robot?");
            } else {
              alert("Sobrenome muito longo");

            }
            return false;
          }
           else if (this.codSeguranca.length < 3 || this.codSeguranca.length > 4) { // 3 ou 4 digitos
            alert("Código inválido");
            return false;

          } else {
            return true;
          }
        } else {
          alert("Preencha todos os campos corretamente");
          return false;
        }
    }
    ,
    comprar(){
      if(this.verificaCampos()){


            var erro = false;
            let d = this.vencimento.split("-");
            if (d[0].length != 2 || d[1].length != 2) {
              alert("Insira uma data valida");
            } else {
              
            }
      }

      
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
