<template>
  <main>
    <div id="banner_home" style="background-color: var(--main-color); color: white;">
      <div class="row">
        <div class="col-sm-6 col-md-6 col-lg-6" style="margin:auto;">
          <div class="row">
            <p class="centered start">
              <span class="focus">Economize</span> dinheiro enquanto
            </p>
          </div>
          <div class="row">
            <p class="centered start">
              <span class="focus">Salva</span> o meio ambiente
            </p>
          </div>
          <div v-if="!isLogged">
            <div class="row">
              <br>
              <br>
              <p style="margin:auto;">
                <strong>Se inscreva e faça parte da comunidade</strong>
              </p>
            </div>
            <div class="row">
              <button
                type="button"
                class="btn btn-dark"
                style="margin:auto;"
                @click="$modal.show('demo-login')"
              >Sign up</button>
            </div>
          </div>
        </div>
        <div class="col-sm-6">
          <img src="assets/banner.png" height="428">
        </div>
      </div>
    </div>
    <div>
      <h1 class="exp py-5">Como funciona?</h1>
      <div class="row">
        <div class="col-sm-1 col-md-1 col-lg-1"></div>
        <div class="col-sm-6 col-md-6 col-lg-6 exp">
          <br>
          <br>
          <br>
          <h3>
            <strong>Se inscreva</strong>
          </h3>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla vestibulum mauris ut diam
            vulputate, nec scelerisque magna maximus. Suspendisse sit amet ex vestibulum, semper nunc quis,
            consequat arcu. Pellentesque feugiat molestie enim a aliquam.
          </p>
        </div>
        <div class="col-sm-5 col-md-5 col-lg-5">
          <img src="assets/browser.png" class="image">
        </div>
      </div>
      <div class="row">
        <div class="col-sm-5 col-md-5 col-lg-5">
          <img src="assets/app.png" class="image">
        </div>
        <div class="col-sm-6 col-md-6 col-lg-6 exp">
          <br>
          <br>
          <h3>
            <strong>Peça o seu biodigestor</strong>
          </h3>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla vestibulum mauris ut diam
            vulputate, nec scelerisque magna maximus. Suspendisse sit amet ex vestibulum, semper nunc quis,
            consequat arcu. Pellentesque feugiat molestie enim a aliquam.
          </p>
        </div>
        <div class="col-sm-1 col-md-1 col-lg-1"></div>
      </div>

      <div class="row">
        <div class="col-sm-1 col-md-1 col-lg-1"></div>
        <div class="col-sm-5 col-md-5 col-lg-5 exp">
          <br>
          <br>
          <h3>
            <strong>Comece à combater o desperdício de comida!</strong>
          </h3>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla vestibulum mauris ut diam
            vulputate, nec scelerisque magna maximus. Suspendisse sit amet ex vestibulum, semper nunc quis,
            consequat arcu. Pellentesque feugiat molestie enim a aliquam.
          </p>
        </div>
        <div class="col-sm-6 col-md-6 col-lg-6">
          <img src="assets/trash.png" class="image">
        </div>
      </div>
    </div>
  </main>
</template>

<script>


export default {
  name: "Inicio",
  components:{
  },
  props: {
    isLogged: Boolean
  }
};
</script>

<style scoped>
.start {
  font-size: 30px;
  margin: auto;
}
.start .focus {
  font-size: 40px;
}

.centered {
  text-align: center;
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
</style>
