<template>
  <main style=" background-color: #E6E6E6;">
    <div id="banner_home" style="background-color: #0EBE57; overflow:hidden;" >
      <div class="container-fluid">
        <div class="row">
          <div class="col-sm-2 col-md-2 col-lg-2">
            <img class="banner image" src="assets/banner2.png">
          </div>
          <div class="col-sm-8 col-md-8 col-lg-8" style="margin:auto;">
            <div class="row">
              <h1 style="margin:auto;">
                <strong>Seu lixo descartado</strong>
              </h1>
            </div>
            <div class="row">
              <h1 class="display-3" style="margin:auto;">Conscientemente</h1>
            </div>
            <div class="row">
              <div class="col-sm-2 col-md-2 col-lg-2 display">
                <h1 class="display-3" style="text-align: center; margin:auto; padding: 30px;">0</h1>
              </div>
              <div class="col-sm-2 col-md-2 col-lg-2 display">
                <h1 class="display-3" style="text-align: center; margin:auto; padding: 30px;">0</h1>
              </div>
              <div class="col-sm-2 col-md-2 col-lg-2 display">
                <h1 class="display-3" style="text-align: center; margin:auto; padding: 30px;">1</h1>
              </div>
              <div class="col-sm-2 col-md-2 col-lg-2 display">
                <h1 class="display-3" style="text-align: center; margin:auto; padding: 30px;">0</h1>
              </div>
              <div class="col-sm-2 col-md-2 col-lg-2 display" style>
                <h1 class="display-3" style="text-align: center; margin:auto; padding: 30px;">Kg</h1>
              </div>
            </div>
          </div>
          <div class="col-sm-2 col-md-2 col-lg-2">
            <img class="banner image" src="assets/banner.png">
          </div>
        </div>
      </div>
    </div>
    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-6 col-md-6 col-lg-6" >
          <div style="background-color: white; border-radius: 1rem; padding: 20px; margin: 20px;" >
            <div class="row">
              <h1 style=" margin:auto;">
                <strong>Histórico</strong>
              </h1>
            </div>
            <Historico :historicoItems="items" id="historico"/>

            

          </div>
        </div>

        <div class="col-sm-6 col-md-6 col-lg-6">
          <div class="row py-4">
            <div class="col-sm-4 col-md-4 col-lg-4">
              <div style="background-color: white; border-radius: 2rem; padding: 10%">
                <img src="assets/cart.png" style=" margin:auto;">
              </div>
            </div>
            <div class="col-sm-4 col-md-4 col-lg-4">
              <div style="background-color: white; border-radius: 2rem; padding: 10%">
                <img src="assets/maintenance.png" height="128" style=" margin:auto;">
              </div>
            </div>
            <div class="col-sm-4 col-md-4 col-lg-4">
              <div style="background-color: white; border-radius: 2rem; padding: 10%">
                <img src="assets/truck.png" height="128" style=" margin:auto;">
              </div>
            </div>
            <div class="row">
              <div
                style="background-color: white; border-radius: 20px; padding: 20px; margin: 20px;"
              >
                <div class="row">
                  <div class="col-sm-8 col-md-8 col-lg-8">
                    <h1>
                      <strong>Como funciona?</strong>
                    </h1>
                  </div>
                  <div class="col-sm-4 col-md-4 col-lg-4">
                    <button type="button" class="btn btn-dark">Ler mais</button>
                  </div>
                </div>
                <div class="row py-4">
                  <div class="col-sm-4 col-md-4 col-lg-4">
                    <img src="assets/energy.png" >
                  </div>
                  <div class="col-sm-8 col-md-8 col-lg-8">
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla vestibulum mauris ut diam vulputate, nec scelerisque magna maximus. Suspendisse sit amet ex vestibulum, semper nunc quis, consequat arcu. Pellentesque feugiat molestie enim a aliquam.</p>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </main>
</template>

<script>
import Historico from "./Historico.vue"
import http from "../http-common";

class HistoricolItem {
  constructor(nome, data, srcPhoto,qtd) {
    this.nome = nome;
    this.data = data;
    this.srcPhoto = srcPhoto;
    this.qtd = qtd
  }
}
export default {
  name: "MinhaConta",
  components: {
    Historico
  },
  props: {
    isLogged: Boolean,
    user:Object
      },
  data: () => {
    return {
      items: []
    };
  },
   mounted(){
     let url = "/users/"+ this.user.email +"/historico"
    http
          .get(url)
          .then(response => {
            
            for(var i = response.data.length-1; i>=0 ; i--){
              for(var y = 0; y<response.data[i].orderProducts.length ; y++){
                this.items.push(new HistoricolItem(
                response.data[i].orderProducts[y].product.name,
                response.data[i].dateCreated,
                response.data[i].orderProducts[y].product.srcPhoto,
                response.data[i].orderProducts[y].quantity
                )
                
              )
              }
            }
            
          });
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
#historico{
  overflow: auto;
  height: 600px;
}
</style>
