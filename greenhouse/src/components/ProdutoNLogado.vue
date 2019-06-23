<template>
  <main>
    <div class="row py-4" style="background-color:var(--main-color)">
      <div class="col-lg-4 col-md-4 col-sm-4 ml-auto">
        <img src="assets/house.png" alt="house" width="300px">
      </div>
      <div class="col-lg-8 col-md-8 col-sm-8 mr-auto">
        <img src="assets/our_products.png" alt="Produtos" height="100px">
        <p class="white-text" style="font-size: 60px;font-weight: bold;font-family: Lato">
          <b>
            Sustentabilidade
            <br>é nossa prioridade
          </b>
        </p>
      </div>
    </div>

    <div class="row py-5">
      <div class="col-lg-3 col-md-3 col-sm-3"></div>
      <div class="col-lg-6 col-md-6 col-sm-6">
        <h1 style="text-align: center">Composteira</h1>
        <p class="font-small text-center">
          Gag ipsum dolar sit amet close enough i lied anonymous herp derp. Aww Yeah 9000 weekend joke
          hammer
          like
          a boss avenger games varius puking rainbows. Amet sweet jezus scumbag unlock cuteness overload
          pizza
          dead
          no asians. Russia fap fap fap le friend german dolar le me motherfucker fap fap brother fuck
          yeah. I
          Know That Feel y u no 140% le
          girlfriend dummies geek morbi cereal guy le derp wodka. Oh Stop It, You derpina food impossibru
          if
          you know what i mean grey
          so close genius stoned collection. True love gasp feel like a sir read female meme high school i
          see
          what
          you did there search left. Mom male jackie chan on back good guy mother luke. Homework oh god
          why
          fuck that shit essay keyboard
          all the things troll pokeman twitter tank michelle. Hac ipsum iron man hitler nother to do here
          phone sit on
          donut why. Facepalm laptop basic math the avengers sex monday.
        </p>
      </div>
      <div class="col-lg-3 col-md-3 col-sm-3">
        <img src="assets/compost.jpg" alt="logo" class="ml-auto" height="300em">
      </div>
    </div>
    <div class="row">
      <div class="col-lg-3 col-md-3 col-sm-3">
        <img src="assets/HomeBiogas.jpg" alt="logo" class="ml-auto" height="300em">
      </div>
      <div class="col-lg-6 col-md-6 col-sm-6">
        <h1 style="text-align: center">HomeBiogas</h1>
        <p class="font-small" style="text-align:center">
          Gag ipsum dolar sit amet close enough i lied anonymous herp derp. Aww Yeah 9000 weekend joke
          hammer
          like
          a boss avenger games varius puking rainbows. Amet sweet jezus scumbag unlock cuteness overload
          pizza
          dead
          no asians. Russia fap fap fap le friend german dolar le me motherfucker fap fap brother fuck
          yeah. I
          Know That Feel y u no 140% le
          girlfriend dummies geek morbi cereal guy le derp wodka. Oh Stop It, You derpina food impossibru
          if
          you know what i mean grey
          so close genius stoned collection. True love gasp feel like a sir read female meme high school i
          see
          what
          you did there search left. Mom male jackie chan on back good guy mother luke. Homework oh god
          why
          fuck that shit essay keyboard
          all the things troll pokeman twitter tank michelle. Hac ipsum iron man hitler nother to do here
          phone sit on
          donut why. Facepalm laptop basic math the avengers sex monday.
        </p>
      </div>
      <div class="col-lg-3 col-md-3 col-sm-3"></div>
    </div>
    <div class="row">
      <div class="col-lg-3 col-md-3 col-sm-3"></div>
      <div class="col-lg-6 col-md-6 col-sm-6">
        <h1 style="text-align: center">Decomposteira</h1>
        <p class="font-small" style="text-align:center">
          Gag ipsum dolar sit amet close enough i lied anonymous herp derp. Aww Yeah 9000 weekend joke
          hammer
          like
          a boss avenger games varius puking rainbows. Amet sweet jezus scumbag unlock cuteness overload
          pizza
          dead
          no asians. Russia fap fap fap le friend german dolar le me motherfucker fap fap brother fuck
          yeah. I
          Know That Feel y u no 140% le
          girlfriend dummies geek morbi cereal guy le derp wodka. Oh Stop It, You derpina food impossibru
          if
          you know what i mean grey
          so close genius stoned collection. True love gasp feel like a sir read female meme high school i
          see
          what
          you did there search left. Mom male jackie chan on back good guy mother luke. Homework oh god
          why
          fuck that shit essay keyboard
          all the things troll pokeman twitter tank michelle. Hac ipsum iron man hitler nother to do here
          phone sit on
          donut why. Facepalm laptop basic math the avengers sex monday.
        </p>
      </div>
      <div class="col-lg-3 col-md-3 col-sm-3">
        <img src="assets/decomposer.jpg" alt="logo" class="ml-auto" height="300em">
      </div>
    </div>

    <h3 class="text-center">Mais Produtos</h3>

    <div
      id="carousel-example-multi"
      class="carousel slide carousel-multi-item v-2"
      data-ride="carousel"
      style="height: 500px"
    >
      <div class="controls-top">
        <a class="btn-floating" href="#carousel-example-multi" data-slide="prev">
          <i class="fas fa-chevron-left"></i>
        </a>
        <a class="btn-floating" href="#carousel-example-multi" data-slide="next">
          <i class="fas fa-chevron-right"></i>
        </a>
      </div>
      <div class="carousel-inner v-2" style="padding-left:33%" role="listbox">
        <Carousel :carouselItems="items"/>
      </div>
    </div>
  </main>
</template>
<script>
import Carousel from "./Carousel.vue";
import http from "../http-common";

class CarouselItem {
  constructor(title, text, src) {
    this.title = title;
    this.text = text;
    this.src = src;
  }
}

export default {
  name: "ProdutoNLogado",
  components: {
    Carousel
  },
  data: () => {
    return {
      items: []
    };
  },
  mounted(){
    http
          .get("/produtos")
          .then(response => {
            for(var i = 0; i<response.data.length ; i++){
             this.items.push(new CarouselItem(
                response.data[i].name,
                response.data[i].tipo,
                response.data[i].srcPhoto
                
              )) 

            }
            
          });
  }
};
</script>

<style>
</style>
