

<template>
  <div id="app">
    <nav class="navbar navbar-expand-lg navbar-light mr-auto">
      <div class="collapse navbar-collapse ml-auto" id="navbarNav">
        <ul class="navbar-nav ml-auto">
          <div v-for="tab in tabs" :key="tab">
            <div v-if="isLogged && (tab.name == 'Serviço' || tab.name=='Produtos')">
              <li
                v-if="tab.name =='Serviço'"
                :class="['nav-item',{active: getRoute() == 'ServicoLogado'}]"
              >
                <a
                  :class="['nav-link',{disabled: getRoute()=='ServicoLogado'}]"
                  :href="'/servicosUser'"
                >Serviços</a>
              </li>

              <li
                v-else-if="tab.name =='Produtos'"
                :class="['nav-item',{active: getRoute() == 'ProdutoLogado'}]"
              >
                <a
                  :class="['nav-link',{disabled: getRoute()=='ProdutoLogado'}]"
                  :href="'/produtosUser'"
                >Produtos</a>
              </li>
            </div>
            <div v-else-if="!isLogged && (tab.name == 'Serviço' || tab.name=='Produtos')">
              <li
                v-if="tab.name=='Serviço'"
                :key="ServicoNLogado"
                :class="['nav-item',{active: getRoute() == 'ServicoNLogado'}]"
              >
                <a
                  :class="['nav-link',{disabled: getRoute()=='ServicoNLogado'}]"
                  :href="'/servicos'"
                >Serviços</a>
              </li>
              <li
                v-if="tab.name=='Produtos'"
                :key="ProdutoNLogado"
                :class="['nav-item',{active: getRoute() == 'ProdutoNLogado'}]"
              >
                <a
                  :class="['nav-link',{disabled: getRoute()=='ProdutoNLogado'}]"
                  :href="'/produtos'"
                >Produtos</a>
              </li>
            </div>
            <div v-else>
              <li :key="tab" :class="['nav-item',{active: getRoute() == tab.name}]">
                <a
                  :class="['nav-link',{disabled: getRoute() == tab.name}]"
                  :href="tab.content"
                >{{tab.name}}</a>
              </li>
            </div>
          </div>

          <li v-if="isLogged" class="nav-item dropdown">
            <a
              class="nav-link dropdown-togogle"
              id="navbarDropdownMenuLink-4"
              data-toggle="dropdown"
              aria-haspopup="true"
              aria-expanded="false"
            >
              <i class="fas fa-user"></i> Maria M
            </a>
            <div
              class="dropdown-menu dropdown-menu-right dropdown-info"
              aria-labelledby="navbarDropdownMenuLink-4"
            >
              <a class="dropdown-item" href="#" v-on:click="getRoute()=='MinhaConta'":href="'/minhaConta'">Minha conta</a>
              <a class="dropdown-item" href="#" v-on:click='logout()'>Sair</a>
            </div>
          </li>
          <li v-else class="nav-item dropdown">
            <a
              class="nav-link dropdown-toggle"
              id="navbarDropdownMenuLink-4"
              data-toggle="dropdown"
              aria-haspopup="true"
              aria-expanded="false"
            >Sign in</a>
            <div
              class="dropdown-menu dropdown-menu-right dropdown-info"
              aria-labelledby="navbarDropdownMenuLink-4"
            >
              <!-- Material form login -->
              <div class="card">
                <h5 class="card-header info-color white-text text-center py-4">
                  <strong>Sign in</strong>
                </h5>

                <!--Card content-->
                <div class="card-body px-lg-5 pt-0">
                  <!-- Form -->
                  <form class="text-center" style="color: #757575;">
                    <br class="py-2">
                    <input
                      type="email"
                      id="defaultLoginFormEmail"
                      class="form-control mb-4"
                      placeholder="E-mail"
                      v-model="email"
                    >

                    <!-- Password -->
                    <input
                      type="password"
                      id="defaultLoginFormPassword"
                      class="form-control mb-4"
                      placeholder="Password"
                      v-model="password"
                    >

                    <div class="d-flex justify-content-around">
                      <div>
                        <!-- Remember me -->
                        <div class="form-check">
                          <input
                            type="checkbox"
                            class="form-check-input"
                            id="materialLoginFormRemember"
                          >
                          <label
                            class="form-check-label"
                            for="materialLoginFormRemember"
                          >Remember me</label>
                        </div>
                      </div>
                      <div>
                        <!-- Forgot password -->
                        <a href>Forgot password?</a>
                      </div>
                    </div>

                    <!-- Sign in button -->
                    <button
                      class="btn btn-outline-info btn-rounded btn-block my-4 waves-effect z-depth-0"
                      type="submit"
                      style="border-radius: 2rem"
                      v-on:click="loginIn()"
                    >Sign in</button>

                    <!-- Register -->
                    <p>
                      Not a member?
                      <a href>Register</a>
                    </p>
                  </form>
                  <!-- Form -->
                </div>
              </div>
              <!-- Material form login -->
            </div>
          </li>
        </ul>
      </div>
    </nav>
    <!-- <component :is="selected" :isLogged="isLogged"></component> -->
    <router-view></router-view>
    <div
      v-if="!isLogged"
      id="banner_home"
      class="py-4"
      style="background-color: #0EBE57;color: white;"
    >
      <div class="container">
        <div class="row" style="margin:auto;">
          <div class="col-sm-6 col-md-6 col-lg-6">
            <h3>Pronto?</h3>
            <h2>Comece agora mesmo!</h2>
          </div>
          <div class="col-sm-6 col-md-6 col-lg-6" style="margin:auto;">
            <BotaoSignUp/>
          </div>
        </div>
      </div>
    </div>
    <footer class="page-footer font-small unique-color-dark py-1">
      <!-- Footer Links -->
      <div class="container text-center text-md-left mt-5">
        <!-- Grid row -->
        <div class="row mt-3">
          <!-- Grid column -->
          <div class="col-md-3 col-lg-3 col-xl-3 mx-auto mb-4">
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
                <button
                  class="btn btn-sm btn-outline-white my-0"
                  type="button"
                  style="border-radius: 0.5rem"
                >Subscribe</button>
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
import BotaoSignUp from "./components/BotaoSignUp.vue";
// import Inicio from "./components/Inicio.vue";
// import Sobre from "./components/Sobre.vue";
// import MinhaConta from "./components/MinhaConta.vue"

// class User{
//   constructor(email, password, name){
//     this.email = email;
//     this.password = password;
//     this.name = name;
//   }
// }
export default {
  name: "app",
  components: {
    // Inicio,
    // Sobre,
    // MinhaConta
    BotaoSignUp
  },
  data: () => {
    return {
      tabs: [
        { name: "Inicio", content: "/" },
        { name: "Sobre", content: "/sobre" },
        { name: "Produtos", content: "/produtos" },
        { name: "Serviço", content: "/servico" }
      ],
      isLogged: false,
      email: "",
      password: "",
      user: "",
      users: []
    };
  },
  methods: {
    loginIn() {
      this.isLogged = true;
      this.selected = "/user/123";
    },
    logout() {
      this.isLogged = false;
      this.selected = "/";
    },
    getRoute() {
      return this.$router.currentRoute.name;
    }
  }
};
</script>

<style scoped>
#app {
}
</style>

