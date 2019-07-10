<template>
  <modal name="demo-login" transition="pop-out" :width="modalWidth" :height="550">
    <div class="box">
      <div class="box-part" id="bp-left">
        <div class="partition" id="partition-register">
          <div class="partition-title">CRIAR CONTA</div>

          <div class="partition-form">
            <form autocomplete="false" method="post">
              <div class="autocomplete-fix">
                <input type="password">
              </div>

              <div class="row form-check" style="margin: auto">
                <input
                  @click="selected = 'F'"
                  type="radio"
                  class="form-check-input col-sm-1 col-md-1 col-lg-1"
                  id="materialChecked"
                  name="tipoPessoa"
                  checked
                >
                <label
                  class="form-check-label col-sm-5 col-md-5 col-lg-5"
                  for="materialChecked"
                >Física</label>

                <input
                  @click="selected = 'J'"
                  type="radio"
                  class="form-check-input col-sm-1 col-md-1 col-lg-1"
                  id="materialUnchecked"
                  name="tipoPessoa"
                >
                <label
                  class="form-check-label col-sm-5 col-md-5 col-lg-5"
                  for="materialUnchecked"
                >Jurídica</label>
              </div>

              <div v-if="selected == 'F'" style class="py-1">
                <input type="text" placeholder="Email" v-model="email">
                <input type="password" placeholder="Password" v-model="password">
                <input type="text" placeholder="Nome" v-model="nome">
                <input type="text" placeholder="CPF" v-model="CPF">
                <div class="row" style="margin:auto;padding-left:20%">
                  <input
                    @click="sexo = 'M'"
                    type="radio"
                    class="form-check-input col-sm-1 col-md-1 col-lg-1"
                    id="sexChecked"
                    name="sexoPessoa"
                    checked
                  >
                  <label class="form-check-label col-sm-5 col-md-5 col-lg-5" for="sexChecked">M</label>

                  <input
                    @click="sexo = 'F'"
                    type="radio"
                    class="form-check-input col-sm-1 col-md-1 col-lg-1"
                    id="sexUnchecked"
                    name="sexoPessoa"
                  >
                  <label class="form-check-label col-sm-5 col-md-5 col-lg-5" for="sexUnchecked">F</label>
                </div>
                <input v-model="data_nascimento" type="text" placeholder="04-06-2019">
              </div>

              <div v-else style class="py-1">
                <input type="text" placeholder="Email" v-model="email">
                <input type="password" placeholder="Password" v-model="password">
                <input type="text" placeholder="Nome" v-model="nome_fantasia">
                <input type="text" placeholder="CNPJ" v-model="CNPJ">
              </div>
              <div>
                <div class="col-sm-12 col-md-12 col-lg-12">
                  <input type="text" placeholder="CEP" v-model="CEP" @keyup="findAddress()">
                </div>
                <div class="col-sm-12 col-md-12 col-lg-12">
                  <input type="text" placeholder="Endereco" v-model="endereco">
                </div>
              </div>
              <div class="row">
                <div class="col-sm-6 col-md-6 col-lg-6">
                  <input type="text" placeholder="Complemento" v-model="complemento">
                </div>
                <div class="col-sm-6 col-md-6 col-lg-6">
                  <input type="text" placeholder="Número" v-model="numero">
                </div>
              </div>
            </form>

            <div class="button-set" style="text-align: center;">
              <button type="button" class="btn btn-dark" v-on:click="signup()">Registrar</button>
            </div>
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
const MODAL_HEIGHT = 480;
import http from "../http-common";
export default {
  name: "SignUp",
  data() {
    return {
      modalWidth: MODAL_WIDTH,
      modalHeight: MODAL_HEIGHT,
      email: "",
      password: "",
      nome: "",
      nome_fantasia: "",
      CPF: "",
      CNPJ: "",
      data_nascimento: "",
      sexo: "M",
      selected: "F",
      endereco: "",
      numero: 0,
      complemento: "",
      CEP: ""
    };
  },
  created() {
    this.modalWidth =
      window.innerWidth < MODAL_WIDTH ? MODAL_WIDTH / 2 : MODAL_WIDTH;
  },
  methods: {
    findAddress() {
      if (this.CEP.length == 8) {
        http
          .get("https://viacep.com.br/ws/" + this.CEP + "/json")
          .then(response => {
            this.endereco = response.data.logradouro;
          })
          .catch(function() {
            this.endereco = "";
            alert("Digite um CEP valido");
          });
      } else {
        this.endereco = "";
      }
    },
    async signup() {
      if (this.selected == "F") {
        if (
          this.email &&
          this.nome &&
          this.CPF &&
          this.data_nascimento &&
          this.CEP &&
          this.endereco &&
          this.numero &&
          this.complemento
        ) {
          if (this.password.length < 5 || this.password.length > 15) {
            if (this.password.length < 5) {
              alert("Senha muito curta\nPreencha com pelo menos 5 caracteres");
            } else {
              alert("Senha muito longa");
            }
          } else if (this.nome.length < 5 || this.nome.length > 30) {
            if (this.nome.length < 5) {
              alert("Nome muito curto\n R U a robot?");
            } else {
              alert("Nome muito longo");
            }
          } else if (this.CPF.length != 11) {
            alert("CPF invalido");
          } else if (this.data_nascimento.length != 10) {
            alert("Informe uma data valida");
          } else if (this.email.length < 5 || this.email.length > 50) {
            if (this.email.length < 5) {
              alert("Email muito curto");
            } else {
              alert("Email muito longo");
            }
          } else if (this.numero < 1) {
            alert("Informe um numero valido");
          } else if (
            this.complemento.length < 3 ||
            this.complemento.length > 50
          ) {
            if (this.complemento.length < 3) {
              alert("Complemento muito pequeno");
            } else {
              alert("Complemento muito longo");
            }
          } else {
            var erro = false;
            let d = this.data_nascimento.split("/");
            if (d[0].length != 2 || d[1].length != 2 || d[2].length != 4) {
              alert("Insira uma data valida");
            } else {

              d = d[2] + "/" + d[1] + "/" + d[0];
              let id = await http.post("/adduser", {
                tpusuario: this.selected,
                email: this.email,
                password: this.password
              }).catch(function() {
                  erro = true
                  alert("ERRO 1");
                });
              await http
                .post("/addfisico", {
                  fk_id_usuario: id.data,
                  sexo: this.sexo,
                  cpf: this.CPF,
                  data_nascimento: d,
                  nome: this.nome
                })
                .catch(function() {
                  http.delete("/removeuser/" + id.data);
                  erro = true
                  alert("ERRO");
                });
              await http.post("/addendereco", {
                fk_id_usuario: id.data,
                rua: this.endereco,
                numero: this.numero,
                complemento: this.complemento,
                cep: this.CEP
              }).then(response=>{
                if(!erro){
                  alert("Cadastro realizado com sucesso");
                  this.selected = "MinhaConta";
                }
                
              });
              
            }
          }
        } else {
          alert("Preencha todos os campos corretamente");
        }
      } else {
        if (this.CNPJ && this.nome_fantasia && this.password && this.email) {
          if (this.CNPJ.length != 14) {
            alert("Insira um CNPJ valido");
          } else if (
            this.nome_fantasia.length < 5 ||
            this.nome_fantasia.length > 50
          ) {
            if (this.nome_fantasia.length < 5) {
              alert("Nome muito curto");
            } else {
              alert("Nome muito longo");
            }
          } else if (this.password.length < 5 || this.password.length > 15) {
            if (this.password.length < 5) {
              alert("Senha muito curta");
            } else {
              alert("Senha muito longa");
            }
          } else if (this.email.length < 5 || this.email.length > 50) {
            if (this.email.length < 5) {
              alert("Email muito curto");
            } else {
              alert("Email muito longo");
            }
          } else {
            if (
              this.email &&
              this.password &&
              this.CNPJ &&
              this.nome_fantasia &&
              this.CEP &&
              this.endereco &&
              this.complemento &&
              this.numero
            ) {
              if (this.password.length < 5 || this.password.length > 15) {
                if (this.password.length < 5) {
                  alert(
                    "Senha muito curta\nPreencha com pelo menos 5 caracteres"
                  );
                } else {
                  alert("Senha muito longa");
                }
              } else if (
                this.nome_fantasia.length < 5 ||
                this.nome_fantasia.length > 30
              ) {
                if (this.nome_fantasia.length < 5) {
                  alert("Nome muito curto\n R U a robot?");
                } else {
                  alert("Nome muito longo");
                }
              } else if (this.CNPJ.length != 14) {
                alert("CNPJ invalido");
              } else if (this.complemento.length < 5 || this.complemento > 50) {
                if (this.complemento.length < 5) {
                  alert("Complemento muito pequeno");
                } else {
                  alert("Complemento muito longo");
                }
              } else if (this.numero <= 0) {
                alert("Informe um numero valido");
              } else {
                this.encodeEmail()
     
                let id = await http.post("/adduser", {
                  tpusuario: this.selected,
                  email: this.email,
                  password: this.password
                });
                id = id.data;
                await http
                  .post("/addjuridico", {
                    fk_id_usuario: id,
                    cnpj: this.CNPJ,
                    nome: this.nome_fantasia
                  })
                  .catch(function() {
                    http.delete("/removeuser/" + id);
                  });
                await http.post("/addendereco", {
                  fk_id_usuario: id,
                  rua: this.endereco,
                  numero: this.numero,
                  complemento: this.complemento,
                  cep: this.CEP
                });
              }
              alert("Usuario (Pessoa Juridica) cadastrada com sucesso");
            }
          }
        } else {
          alert("Preencha todos os campos corretamente");
        }
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
  height: 100%;

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