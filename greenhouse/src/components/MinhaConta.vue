<template>
  <main style=" background-color: #E6E6E6;">
    <div id="banner_home" style="background-color: #0EBE57; ">
      <div class="container-fluid">
        <div class="row">
          <div class="col-sm-3 col-md-3 col-lg-3">
            <img src="assets/banner2.png" height="428">
          </div>
          <div class="col-sm-6 col-md-6 col-lg-6" style="margin:auto;">
            <div class="row">
              <h1 style="margin:auto;">
                <strong>Seu lixo descartado</strong>
              </h1>
            </div>
            <div class="row">
              <h1 class="display-3" style="margin:auto;">Conscientemente</h1>
            </div>
            <div class="row">
              <div
                class="col-sm-2 col-md-2 col-lg-2"
                style=" background-color: white; border-radius: 50px; padding: 10px; margin: 10px;"
              >
                <h1 class="display-3" style="text-align: center; margin:auto; padding: 30px;">0</h1>
              </div>
              <div
                class="col-sm-2 col-md-2 col-lg-2"
                style=" background-color: white; border-radius: 50px; padding: 10px; margin: 10px;"
              >
                <h1 class="display-3" style="text-align: center; margin:auto; padding: 30px;">0</h1>
              </div>
              <div
                class="col-sm-2 col-md-2 col-lg-2"
                style=" background-color: white; border-radius: 50px; padding: 10px; margin: 10px;"
              >
                <h1 class="display-3" style="text-align: center; margin:auto; padding: 30px;">1</h1>
              </div>
              <div
                class="col-sm-2 col-md-2 col-lg-2"
                style=" background-color: white; border-radius: 50px; padding: 10px; margin: 10px;"
              >
                <h1 class="display-3" style="text-align: center; margin:auto; padding: 30px;">0</h1>
              </div>
              <div
                class="col-sm-2 col-md-2 col-lg-2"
                style=" background-color: white; border-radius: 50px; padding: 10px; margin: 10px;"
              >
                <h1 class="display-3" style="text-align: center; margin:auto; padding: 30px;">Kg</h1>
              </div>
            </div>
          </div>
          <div class="col-sm-3 col-md-3 col-lg-3">
            <img src="assets/banner.png" height="428">
          </div>
        </div>
      </div>
    </div>
    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-6 col-md-6 col-lg-6">
          <div style="background-color: white; border-radius: 20px; padding: 20px; margin: 20px;">
            <div class="row">
              <h1 style=" margin:auto;">
                <strong>Histórico</strong>
              </h1>
            </div>

            <div class="row">
              <div class="col-sm-10 col-md-10 col-lg-10">
                <div class="row">
                  <h4>
                    <strong>Serviço de Coleta de Lixo</strong>
                  </h4>
                </div>
                <div class="row">
                  <h4>Data: 11/02/2019</h4>
                </div>
              </div>
              <div class="col-sm-2 col-md-2 col-lg-2">
                <img src="assets/truck.png" height="58" style=" margin:auto;">
              </div>
            </div>

            <div class="row">
              <div class="col-sm-10 col-md-10 col-lg-10">
                <div class="row">
                  <h4>
                    <strong>Serviço de Coleta de Lixo</strong>
                  </h4>
                </div>
                <div class="row">
                  <h4>Data: 11/02/2019</h4>
                </div>
              </div>
              <div class="col-sm-2 col-md-2 col-lg-2">
                <img src="assets/truck.png" height="58" style=" margin:auto;">
              </div>
            </div>
          </div>
        </div>

        <div class="col-sm-6 col-md-6 col-lg-6">
          <div class="row">
            <div class="col-sm-4 col-md-4 col-lg-4">
              <div
                style="background-color: white; border-radius: 20px; padding: 20px; margin: 20px;"
              >
                <img src="assets/cart.png" height="128" style=" margin:auto;">
              </div>
            </div>
            <div class="col-sm-4 col-md-4 col-lg-4">
              <div
                style="background-color: white; border-radius: 20px; padding: 20px; margin: 20px;"
              >
                <img src="assets/maintenance.png" height="128" style=" margin:auto;">
              </div>
            </div>
            <div class="col-sm-4 col-md-4 col-lg-4">
              <div
                style="background-color: white; border-radius: 20px; padding: 20px; margin: 20px;"
              >
                <img src="assets/truck.png" height="128" style=" margin:auto;">
              </div>
            </div>
            <div class="row">
              <div
                style="background-color: white; border-radius: 20px; padding: 20px; margin: 20px;"
              >
                <div class="row">
                  <div class="col-sm-6 col-md-6 col-lg-6">
                    <h1>
                      <strong>Como funciona?</strong>
                    </h1>
                  </div>
                  <div class="col-sm-6 col-md-6 col-lg-6">
                    <button type="button" class="btn btn-dark">Ler mais</button>
                  </div>
                </div>
                <div class="row">
                  <div class="col-sm-2 col-md-2 col-lg-2">
                    <img src="assets/energy.png" height="128" style=" margin:auto;">
                  </div>
                  <div class="col-sm-10 col-md-10 col-lg-10">
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
export default {
    name: "MinhaConta",
    props: {
        isLogged: Array
    }
};
</script>

<style scoped>
</style>
