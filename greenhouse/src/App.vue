<template>
  <div id="app">
    <nav class="navbar navbar-expand-lg navbar-light mr-auto">
      <div class="collapse navbar-collapse ml-auto" id="navbarNav">
        <ul class="navbar-nav ml-auto">
          <li
            v-for="tab in tabs"
            :key="tab"
            @click="selected=tab"
            :class="['nav-item',{active: selected == tab}]"
          >
            <a class="nav-link">{{tab}}</a>
          </li>
        </ul>
      </div>
    </nav>
    <component :is="selected"></component>
    <footer class="page-footer font-small unique-color-dark py-1">
      <!-- Footer Links -->
      <div class="container text-center text-md-left mt-5">
        <!-- Grid row -->
        <div class="row mt-3">
          <!-- Grid column -->
          <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
            <!-- Content -->
            <h6 class="text-uppercase font-weight-bold">GreenHouse</h6>
            <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
          </div>
          <!-- Grid column -->

          <!-- Grid column -->
          <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">
            <p>
              <a href="#!">Home</a>
            </p>
            <p>
              <a href="#!">About</a>
            </p>
            <p>
              <a href="#!">Features</a>
            </p>
            <p>
              <a href="#!">Pricing</a>
            </p>
            <p>
              <a href="#!">Contact us</a>
            </p>
          </div>
          <!-- Grid column -->

          <!-- Grid column -->
          <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">
            <!-- Links -->
            <p>
              <a href="#!">Blog</a>
            </p>
            <p>
              <a href="#!">Search</a>
            </p>
            <p>
              <a href="#!">T & Cs</a>
            </p>
            <p>
              <a href="#!">Privacy</a>
            </p>
            <p>
              <a href="#!">Community</a>
            </p>
          </div>
          <!-- Grid column -->

          <!-- Grid column -->
          <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
            <p class="font-small">
              <i class="mr-auto">Get our newsletter</i>
            </p>
            <form class="input-group">
              <input
                type="text"
                class="form-control form-control-sm"
                placeholder="Your email"
                aria-label="Your email"
                aria-describedby="basic-addon2"
              >
              <div class="input-group-append">
                <button class="btn btn-sm btn-outline-white my-0" type="button">Subscribe</button>
              </div>
            </form>
            <br>
            <!--Facebook-->
            <a class="fb-ic mr-3" role="button">
              <i class="fab fa-lg fa-facebook-f"></i>
            </a>
            <!--Twitter-->
            <a class="tw-ic mr-3" role="button">
              <i class="fab fa-lg fa-twitter"></i>
            </a>
            <!--Google +-->
            <a class="gplus-ic mr-3" role="button">
              <i class="fab fa-lg fa-google-plus-g"></i>
            </a>
            <!--Instagram-->
            <a class="ins-ic mr-3" role="button">
              <i class="fab fa-lg fa-instagram"></i>
            </a>
            <!--Youtube-->
            <a class="yt-ic mr-3" role="button">
              <i class="fab fa-lg fa-youtube"></i>
            </a>
          </div>
          <!-- Grid column -->
        </div>
        <!-- Grid row -->
      </div>
    </footer>
  </div>
</template>

<script>
import Inicio from "./components/Inicio.vue";
import Sobre from "./components/Sobre.vue";
export default {
  name: "app",
  components: {
    Inicio,
    Sobre,
  },
  data: () => {
    return {
      tabs: ["Inicio", "Sobre"],
      selected: "Inicio"
    };
  }
};
</script>

<style>
#app {
}
</style>
