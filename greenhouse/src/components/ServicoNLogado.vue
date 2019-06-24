<template>
  <main>
<div class="row py-4" style="background-color:var(--main-color)">
      <div class="col-lg-4 col-md-4 col-sm-4 ml-auto">
        <img class="imageTop" src="assets/tools.png" alt="tools">
      </div>
      <p
        class="exp col-lg-4 col-md-4 col-sm-4 gray-text"
        style="font-size: 50px;font-weight: bold;font-family: Lato"
      >
        <b>Contrate um serviço</b>
      </p>
      <div class="col-lg-4 col-md-4 col-sm-4 ml-auto">
        <img class="imageTop" src="assets/naturehands.png" alt="naturehands" width="100px">
      </div>
    </div>
    <div class="py-5">
      <div class="row">
        <div class="col-lg-3 col-md-3 col-sm-3"></div>
        <div class="col-lg-6 col-md-6 col-sm-6">
          <h1 style="text-align: center">Composteira</h1>
          <p class="font-small text-center">{{text}}</p>
        </div>
        <div class="col-lg-3 col-md-3 col-sm-3">
          <img src="./assets/organic.png" alt="logo" class="ml-auto image">
        </div>
      </div>
      <div class="row">
        <div class="col-lg-3 col-md-3 col-sm-3">
          <img src="./assets/maintenance.png" alt="logo" class="ml-auto image">
        </div>
        <div class="col-lg-6 col-md-6 col-sm-6">
          <h1 style="text-align: center">Manuntenção</h1>
          <p class="font-small" style="text-align:center">{{text}}</p>
        </div>
      </div>
      <div class="row">
        <div class="col-lg-3 col-md-3 col-sm-3"></div>
        <div class="col-lg-6 col-md-6 col-sm-6">
          <h1 style="text-align: center">Descarte</h1>
          <p class="font-small" style="text-align:center">{{text}}</p>
        </div>
        <div class="col-lg-3 col-md-3 col-sm-3 text-md-right">
          <img src="assets/trash.png" alt="logo" class="ml-auto image">
        </div>
      </div>
    </div>
  </main>
</template>
<script>
export default {
  name: "ServicoNLogado",
  props: {
    isLogged: Boolean
  },
  data: () => {
    return {
      text:
        "Gag ipsum dolar sit amet close enough i lied anonymous herp derp. Aww Yeah 9000 weekend joke hammer like a boss avenger games varius puking rainbows. Amet sweet jezus scumbag unlock cuteness overload pizza dead no asians. Russia fap fap fap le friend german dolar le me motherfucker fap fap brother fuck yeah. I Know That Feel y u no 140% le girlfriend dummies geek morbi cereal guy le derp wodka. Oh Stop It, You derpina food impossibru if you know what i mean grey"
    };
  }
};
</script>

<style scoped>

.imageTop {
  width: 100%;
  max-width: 7em;
  display: block;
  margin-left: auto;
  margin-right: auto;
}


.image {
  /* width: 100%;
  max-width: 7em;
  display: block;
  margin-left: auto;
  margin-right: auto; */
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
.exp {
  text-align: center;
  margin: auto;
  width: 50%;
  padding: 10px;
}
</style>
