<template>
  <main>
    <div class="row py-4" style="background-color:var(--main-color);">
      <div class="container col-lg-5 ml-auto">
        <img src="assets/planet.png" alt="planet" class="image">
      </div>
      <div class="container col-lg-7 mr-auto exp">
        <img src="assets/about.png" alt="about" height="150px">
        <img src="assets/about1.png" height="150px">
        <p class="white-text" style="font-size: 60px;font-weight: bold;font-family: Lato">
          <b>
            Uma questão de
            <br>conscientização!
          </b>
        </p>
      </div>
    </div>
    <div class="row">
      <div class="px-5 col-lg-5 col-md-5 col-sm-5 exp">
        <h1 style="text-align: center">Nosso Objetivo</h1>
        <p class="font-small">
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
      <div class="ml-auto col-lg-5">
        <img src="assets/logo.png" alt="logo" class="ml-auto image">
      </div>
    </div>

    <h3 class="text-center">Nossos Parceiros</h3>

    <div
      id="carousel-example-multi"
      class="carousel slide carousel-multi-item v-2"
      data-ride="carousel"
      style="height: 550px"
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
        <Carousel :carouselItems="items" />
      </div>
    </div>
  </main>
</template>

<script>
import Carousel from "./Carousel.vue";

class CarouselItem{
  constructor(title, text, src) {
    this.title = title;
    this.text = text;
    this.src = src;
  }
}

export default {
  name: "Sobre",
  components: {
    Carousel
  },
  props: {
    isLogged: Boolean
  },
  data: () => {
    return {
      items: [
        new CarouselItem(
          "Card Title",
          "Some text here",
          "assets/parceiros/parceiro1.png"
        ),
        new CarouselItem(
          "Card Title",
          "Some text here",
          "assets/parceiros/parceiro2.png"
        ),
        new CarouselItem(
          "Card Title",
          "Some text here",
          "assets/parceiros/parceiro3.png"
        ),
        new CarouselItem(
          "Card Title",
          "Some text here",
          "assets/parceiros/parceiro4.png"
        ),
        new CarouselItem(
          "Card Title",
          "Some text here",
          "assets/parceiros/parceiro5.png"
        ),
        new CarouselItem(
          "Card Title",
          "Some text here",
          "assets/parceiros/parceiro6.png"
        )
      ]
    };
  }
};
</script>

<style scoped>
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

