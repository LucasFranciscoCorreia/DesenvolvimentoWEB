<template>
  <div id="app">
    
    <nav class="navbar navbar-expand-lg navbar-light mr-auto " id="navbarNav">
      <link rel="stylesheet" media="screen" href="https://fontlibrary.org/face/glacial-indifference" type="text/css"/>

      <div class="collapse navbar-collapse ml-auto"  >
        <a class="navbar-brand" href="#" style="margin-left:150px;">
          <img src="assets/logo1.png" alt="" style="max-height: 2.2em;">
          </a><h3 style="color:#47525E; font-family: 'GlacialIndifferenceRegular'; margin-top:auto;">GreenHouse</h3>
        <ul class="navbar-nav ml-auto" >

          <div v-for="tab in tabs" :key="tab">
            <li :class="['nav-item',{active: selected == tab}]">
              <a :class="['nav-link',{disabled: selected == tab}]" @click="selected = tab">{{tab}}</a>
            </li>
          </div>
          <li v-if="user.email != undefined" class="nav-item dropdown">
            <a
              class="nav-link dropdown-toggle"
              id="navbarDropdownMenuLink-4"
              data-toggle="dropdown"
              aria-haspopup="true"
              aria-expanded="false"
            >
              <i class="fas fa-user"></i>
              {{pessoa.nome}}
            </a>
            <div
              class="dropdown-menu dropdown-menu-right dropdown-info"
              aria-labelledby="navbarDropdownMenuLink-4"
            >
              <a class="dropdown-item" @click="selected='MinhaConta'">Minha conta</a>
              <a class="dropdown-item" @click="selected='Editar'">Editar</a>
              <a class="dropdown-item" @click="selected='Carrinho'">Carrinho</a>
              <a class="dropdown-item" @click="logout(); selected='Inicio'">Sair</a>
            </div>
          </li>
          <li v-else class="nav-item dropdown">
            <a
              class="nav-link dropdown-toggle"
              id="navbarDropdownMenuLink-4"
              data-toggle="dropdown"
              aria-haspopup="true"
              aria-expanded="false"
            >
              <i></i>Sign in
            </a>
            <div
              class="dropdown-menu dropdown-menu-right dropdown-info"
              aria-labelledby="navbarDropdownMenuLink-4"
            style="padding:0em; margin-top:5px;">
              <!-- Material form login -->
              <div class="card">
              <h5 class="card-header  white-text text-center py-4" style="background-color:#067635;" >
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
                          style="">Remember me</label>
                        </div>
                      </div>
                      <div>
                        <!-- Forgot password -->
                        <a>Forgot password?</a>
                      </div>
                    </div>

                    <!-- Sign in button -->
                    <button
                      class="btn btn-outline-green btn-rounded btn-block my-4 waves-effect z-depth-0"
                      type="submit"
                      style="border-radius: 2rem;"
                    >
                      <a @click="login()">Sign in</a>
                    </button>

                    <!-- Register -->
                    <p>
                      Not a member?
                      <a @click="$modal.show('demo-login')" >Register</a><SignUp/>
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
    <component
      :is="selected"
      :isLogged="user.email != undefined"
      :user="user"
      :pessoa="pessoa"
      :endereco="endereco"
      :carrinho="cart"
      style="margin-top:50px;"></component>
    <!-- <router-view :isLogged="isLogged" :key="isLogged"></router-view> -->
    <div
      v-if="user.email == undefined"
      id="banner_home"
      class="py-4"
      style="background-color: var(--main-color);color: white;"
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
import NaviItem from "./components/NavItem";
import BotaoSignUp from "./components/BotaoSignUp";

import Inicio from "./components/Inicio.vue";
import Sobre from "./components/Sobre.vue";
import Editar from "./components/Editar.vue";
import MinhaConta from "./components/MinhaConta.vue";
import Servico from "./components/Servicos.vue";
import Produto from "./components/Produtos.vue";
import Contato from "./components/Contato.vue";
import Carrinho from "./components/Carrinho.vue";
import ServicoLogado from "./components/ServicoLogado.vue";
import ProdutoLogado from "./components/ProdutoLogado.vue";

import http from "./http-common";
class Item {
  constructor(nome, preco, srcPhoto, qtd, id) {
    this.nome = nome;
    this.preco = preco;
    this.srcPhoto = srcPhoto;
    this.qtd = qtd;
    this.id = id;
  }
}
export default {
  name: "app",
  components: {
    NaviItem,
    BotaoSignUp,
    Inicio,
    Sobre,
    MinhaConta,
    Servico,
    Produto,
    Contato,
    Carrinho,
    ServicoLogado,
    ProdutoLogado,
    Editar
  },
  data: () => {
    return {
      tabs: ["Inicio", "Sobre", "Servico", "Produto", "Contato"],
      selected: "Inicio",
      email: "",
      password: "",
      user: {
        email: undefined,
        password: undefined, 
        
      },
      pessoa: {
        nome: undefined
      },
      endereco: undefined,
      cart: []
    };
  },
  methods: {
    encodeURL(url) {
      var uri = url;
      url = encodeURIComponent(uri);
    },
    async login() {
      if (this.email && this.password) {
        var uri = this.email
        var encodedEmail = encodeURIComponent(uri);
        let id = await http.get("/users/filter?email=" + encodedEmail);
        id = id.data[0];
        //alert(id)
        if (id.password == this.password) {
          this.user = id;
          this.selected = "MinhaConta";
          
          this.pessoa = await http
            .get("/fisicos/id/" + id.idusuario)
            /*.then(response => {
              this.pessoa = response.data;
            });*/ 
          
          this.pessoa = this.pessoa.data
         // alert(this.pessoa.nome)

         // alert(JSON.stringify(ppl.data.nome))
          this.endereco = await http
            .get("/enderecos/id/" + id.idusuario)
            /*.then(response => {
              this.endereco = response.data;
            });*/
            this.endereco = this.endereco.data
          console.log(this.user);
          console.log(this.pessoa);
          console.log(this.endereco);

          
        } else {
          alert("email ou senha incorreta");
        }
        if (this.user == undefined) {
          alert("usuario não cadastrado");
        }
      }
    },
    logout() {
      
    this.selected = "Inicio";
      this.user={
        email: undefined,
        password: undefined
      }
      this.pessoa = {
        nome: undefined
      }

      this.cart=[]

    
    }
  }
};
</script>

<style scoped>
#navbarNav {
  position:fixed; /* fixing the position takes it out of html flow - knows
  /* define height for content */
  background-color: white;
  left:0;           /* top left corner should start at leftmost spot */
  top:0;            /* top left corner should start at topmost spot */
  width:100vw;      /* take up the full browser width */
  z-index:200;  /* high z index so other content scrolls underneath */
  height:50px; 
  
}

[type=checkbox]:checked+label::before {
  border-right:2px solid  #216d32;
  border-bottom: 2px solid  #28a745;
  
}
</style>

