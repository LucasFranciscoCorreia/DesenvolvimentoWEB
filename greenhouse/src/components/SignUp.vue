<template>
  <modal name="demo-login" transition="pop-out" :width="modalWidth" :height="400">
    <div class="box">
      <div class="box-part" id="bp-left">
        <div class="partition" id="partition-register">
          <div class="partition-title">CRIAR CONTA</div>
          <div class="partition-form">
            <form autocomplete="false" method="post">
              <div class="autocomplete-fix">
                <input type="password">
              </div>
              <div class="row">
                <div class="custom-control custom-radio">
                  <input type="radio" class="custom-control-input" id="defaultUnchecked" name="defaultExampleRadios">
                  <label class="custom-control-label" for="defaultUnchecked">Default unchecked</label>
                </div>
              </div>
              <div></div>

              <div></div>
            </form>

            <div style="margin-top: 42px"></div>

            <div class="button-set" style="text-align: center;">
              <button type="button" class="btn btn-dark" v-on:click="signup()">Registrar</button>
            </div>

            <button class="large-btn github-btn">
              conectar com
              <span>google</span>
            </button>
            <button class="large-btn facebook-btn">
              conectar com
              <span>facebook</span>
            </button>
          </div>
        </div>
      </div>
      <div class="box-part" id="bp-right">
        <div class="box-messages"></div>
      </div>
    </div>
  </modal>
</template>

<script>
const MODAL_WIDTH = 328;
import http from "../http-common";
export default {
  name: "SignUp",
  data() {
    return {
      modalWidth: MODAL_WIDTH,
      email: "",
      password: "",
      nome: "",
      nome_fantasia: "",
      CPF: "",
      CNPJ: "",
      data_nascimento: "",
      sexo: ""
    };
  },
  created() {
    this.modalWidth =
      window.innerWidth < MODAL_WIDTH ? MODAL_WIDTH / 2 : MODAL_WIDTH;
  },
  methods: {
    signup() {
      if (this.email && this.password) {
        http
          .post("/user", {
            tpusuario: "S",
            email: this.email,
            password: this.password
          })
          .then(response => {
            alert("Usuario cadasttrado com sucesso");
          });
      } else {
        alert("Preencha os campos");
      }
    }
  }
};
</script>

<style lang="scss">
$background_color: #404142;
$github_color: #ea4335;
$facebook_color: #3880ff;
.box {
  background: white;
  overflow: hidden;
  width: 656px;
  height: 400px;
  border-radius: 2px;
  box-sizing: border-box;
  box-shadow: 0 0 40px black;
  color: #8b8c8d;
  font-size: 0;
  .box-part {
    display: inline-block;
    position: relative;
    vertical-align: top;
    box-sizing: border-box;
    height: 100%;
    width: 50%;
    &#bp-right {
      background: url("/static/panorama.jpg") no-repeat top left;
      border-left: 1px solid #eee;
    }
  }
  .box-messages {
    position: absolute;
    left: 0;
    bottom: 0;
    width: 100%;
  }
  .box-error-message {
    position: relative;
    overflow: hidden;
    box-sizing: border-box;
    height: 0;
    line-height: 32px;
    padding: 0 12px;
    text-align: center;
    width: 100%;
    font-size: 11px;
    color: white;
    background: #f38181;
  }
  .partition {
    width: 100%;
    height: 100%;
    .partition-title {
      box-sizing: border-box;
      padding: 30px;
      width: 100%;
      text-align: center;
      letter-spacing: 1px;
      font-size: 20px;
      font-weight: 300;
    }
    .partition-form {
      padding: 0 20px;
      box-sizing: border-box;
    }
  }
  input[type="password"],
  input[type="text"] {
    display: block;
    box-sizing: border-box;
    margin-bottom: 4px;
    width: 100%;
    font-size: 12px;
    line-height: 2;
    border: 0;
    border-bottom: 1px solid #dddedf;
    padding: 4px 8px;
    font-family: inherit;
    transition: 0.5s all;
    outline: none;
  }
  button {
    background: white;
    border-radius: 4px;
    box-sizing: border-box;
    padding: 10px;
    letter-spacing: 1px;
    font-family: "Open Sans", sans-serif;
    font-weight: 400;
    min-width: 140px;
    margin-top: 8px;
    color: #8b8c8d;
    cursor: pointer;
    border: 1px solid #dddedf;
    text-transform: uppercase;
    transition: 0.1s all;
    font-size: 10px;
    outline: none;
    &:hover {
      border-color: mix(#dddedf, black, 90%);
      color: mix(#8b8c8d, black, 80%);
    }
  }
  .large-btn {
    width: 100%;
    background: white;
    span {
      font-weight: 600;
    }
    &:hover {
      color: white !important;
    }
  }
  .button-set {
    margin-bottom: 8px;
  }
  #register-btn,
  #signin-btn {
    margin-left: 8px;
  }
  .facebook-btn {
    border-color: $facebook_color;
    color: $facebook_color;
    &:hover {
      border-color: $facebook_color;
      background: $facebook_color;
    }
  }
  .github-btn {
    border-color: $github_color;
    color: $github_color;
    &:hover {
      border-color: $github_color;
      background: $github_color;
    }
  }
  .autocomplete-fix {
    position: absolute;
    visibility: hidden;
    overflow: hidden;
    opacity: 0;
    width: 0;
    height: 0;
    left: 0;
    top: 0;
  }
}
.pop-out-enter-active,
.pop-out-leave-active {
  transition: all 0.5s;
}
.pop-out-enter,
.pop-out-leave-active {
  opacity: 0;
  transform: translateY(24px);
}
</style>