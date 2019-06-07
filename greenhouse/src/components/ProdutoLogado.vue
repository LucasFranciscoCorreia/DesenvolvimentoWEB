<template>
	<main>
        <div class="py-4 row" style="background-color: #63CF67">
            <div class="col-lg-2 col-md-2 col-sm-2 text-center">
                <img src="assets/plant.png" alt="plant1">
            </div>
            <div class="col-lg-8 col-md-8 col-sm-8">
                <br>
                <br>
                <h2 class="white-text text-center">
                    Ajude o meio ambiente com nossos biodigestores!
                </h2>
            </div>
            <div class="col-lg-2 col-md-2 col-sm-2 text-center">
                <img src="assets/plant (1).png" alt="plant2">
            </div>
        </div>
        <div class="py-4 row" style="background-color: #E6E6E6">
            <div class="col-lg-3 text-center" style="background-color: #ffffff;border-radius: 5rem">
                <br>
                <h3 class="title"><span>Linhas</span></h3>
                <div class="row py-1">
                    <div class="col-lg-6">
                        <img src="assets/image.png" alt="image1" style="height: auto;width: 100px">
                    </div>
                    <div class="col-lg-6">
                        <img src="assets/image (1).png" alt="image2" style="height: auto;width: 100px">
                    </div>
                </div>
                <div class="row py-1">
                    <div class="col-lg-12">
                        <img src="assets/image (2).png" alt="image3" style="height: auto;width: 250px">
                    </div>
                </div>
                <br>
                <h3 class="title"><span>Destaques</span></h3>
                <div>
                    <ul>
                        <li v-for="i in (0, 15)" :key="i">this is a list item</li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-9">
                
                    <Produto :items="items" :CarrinhoItems="carrinho"/>
                
            </div>
        </div>
    </main>
</template>

<script>
import Produto from "./Produto.vue"
import http from "../http-common";

class Item {
  constructor(nome, preco, srcPhoto, qtd, id, text) {
    this.nome = nome;
    this.preco = preco;
    this.text= text;
    this.srcPhoto = srcPhoto;
    this.qtd = qtd;
    this.id = id
  }
}
export default {
    name: "ProdutoLogado",
    components: {
        Produto
    },
    props:{
        carrinho: Array
    },
    data:() => {
        return{
            items: [
                /*new ProdutoItem("assets/decomposer.jpg", "Some text here"),
                new ProdutoItem("assets/compost.jpg", "Some text here"),
                new ProdutoItem("assets/HomeBiogas.jpg", "Some text here"),
                new ProdutoItem("assets/decomposer.jpg", "Some text here"),
                new ProdutoItem("assets/compost.jpg", "Some text here"),
                new ProdutoItem("assets/HomeBiogas.jpg", "Some text here")*/
            ]
        }
    },
  mounted(){
    http
          .get("/produtos")
          .then(response => {
            for(var i = 0; i<response.data.length ; i++){
             this.items.push({nome: response.data[i].name,
                text: response.data[i].description,
                src: response.data[i].srcPhoto,
                preco: response.data[i].preco,
                qtd: 1}) 

            }
            
          });
  }
}
</script>

<style scoped>

</style>
