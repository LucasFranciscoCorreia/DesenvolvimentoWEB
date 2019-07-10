<template>
  <div id="editar">
    <div v-if="user.tpusuario == 'F'">
      <div class="row py-1">
        <div class="row col-sm-6 col-lg-6 col-md-6">
          <label for="editEmail" class="col-form-label">Email</label>
          <input
            type="text"
            id="editEmail"
            class="form-control"
            placeholder="Email"
            v-model="user.email"
          >
        </div>
        <div class="col-sm-6 col-lg-6 col-md-6">
          <label class="col-form-label">Password</label>
          <input type="password" class="form-control" placeholder="Password" v-model="password">
        </div>
      </div>
      <div class="row py-1">
        <div class="col-sm-12 col-lg-12 col-md-12">
          <label class="col-form-label">Nome</label>
          <input type="text" placeholder="Nome" v-model="pessoa.nome">
        </div>
      </div>
      <div class="row py-1">
        <div class="row col-sm-6 col-lg-6 col-md-6">
          <label class="col-form-label">CPF</label>
          <input type="text" placeholder="CPF" v-model="pessoa.cpf">
        </div>
        <div class="row col-sm-3 col-lg-3 col-md-3">
          <label class="col-form-label">Data de nascimento</label>
          <input type="text" placeholder="Data de Nascimento" v-model="pessoa.data_nascimento">
        </div>
        <div class="col-sm-3 col-md-3 col-lg-3">
          <label class="col-form-label">CEP</label>
          <input type="text" placeholder="CEP" v-model="endereco.cep">
        </div>
      </div>
      <div class="row py-1">
        <div class="col-sm-6 col-md-6 col-lg-6">
          <label class="col-form-label">Rua</label>
          <input type="text" placeholder="Endereco" v-model="endereco.rua">
        </div>
        <div class="col-sm-4 col-md-4 col-lg-4">
          <label class="col-form-label">Complemento</label>
          <input type="text" placeholder="Complemento" v-model="endereco.complemento">
        </div>
        <div class="col-sm-2 col-lg-2 col-md-2">
          <label class="col-form-label">Numero</label>
          <input type="number" placeholder="Numero" v-model="endereco.numero">
        </div>
      </div>
      <div class="row py-1">
        <div class="col-sm-6 col-lg-6 col-md-6">
          <label class="col-form-label">Telefone 1</label>
          <input type="text" placeholder="Telefone 1" v-model="endereco.tel_1">
        </div>
        <div class="col-sm-6 col-lg-6 col-md-6">
          <label class="col-form-label">Telefone 2</label>
          <input type="text" placeholder="Telefone 2" v-model="endereco.tel_2">
        </div>
      </div>
    </div>

    <!-- <button type="button" class="btn btn-danger" style="border-radius: 0.5rem" @click="voltar()">Cancelar</button> -->

    <button
      type="button"
      class="btn btn-success"
      style="float: right; border-radius: 0.5rem"
      @click="salvar()"
    >Confirmar</button>
  </div>
</template>

<script>
import http from "../http-common";

export default {
  name: "Editar",
  data: () => {
    return {
    password: "",
    email:""
    };
  },
  props: {
    user: Object,
    pessoa: Object,
    endereco: Object
  },
  methods: {
    async salvar() {
      this.password = this.password ? this.password : this.user.password
      if (this.user.tpusuario == "F") {
        if (
          this.user.email &&
          this.pessoa.nome &&
          this.pessoa.cpf &&
          this.pessoa.data_nascimento &&
          this.endereco.cep &&
          this.endereco.rua &&
          this.endereco.numero &&
          this.endereco.complemento
        ) {
          if (this.password.length < 5 || this.password.length > 15) {
              if (this.password.length < 5) {
                alert(
                  "Senha muito curta\nPreencha com pelo menos 5 caracteres"
                );
              } else {
                alert("Senha muito longa");
              }
            
          } else if (this.pessoa.nome.length < 5 || this.pessoa.nome.length > 30) {
            if (this.pessoa.nome.length < 5) {
              alert("Nome muito curto\n R U a robot?");
            } else {
              alert("Nome muito longo");
            }
          } else if (this.pessoa.cpf.length != 11) {
            alert("CPF invalido");
          } else if (this.pessoa.data_nascimento.length != 10) {
            alert("Informe uma data valida");
          } else if (this.user.email.length < 5 || this.user.email.length > 50) {
            if (this.user.email.length < 5) {
              alert("Email muito curto");
            } else {
              alert("Email muito longo");
            }
          } else if (this.endereco.numero < 1) {
            alert("Informe um numero valido");
          } else if (
            this.endereco.complemento.length < 3 ||
            this.endereco.complemento.length > 50
          ) {
            if (this.endereco.complemento.length < 3) {
              alert("Complemento muito pequeno");
            } else {
              alert("Complemento muito longo");
            }
          } else {
             let d = this.pessoa.data_nascimento.split("/");
            if (d[0].length != 2 || d[1].length != 2 || d[2].length != 4) {
              alert("Insira uma data valida");
            } else {
              let d = this.pessoa.data_nascimento.split("/");
              d = d[2] + "/" + d[1] + "/" + d[0];
              let password = this.password ? this.password : this.user.password
              //alert("cadastrando")
              let id = await http.put("/"+this.email, {
                tpusuario: this.user.tpusuario,
                email: this.user.email,
                password: password
              });
              //alert(this.user.idusuario)
              await http
                .put("/fisico/"+this.user.idusuario, {
                  fk_id_usuario: this.user.idusuario,
                  id_usu_fisico: this.pessoa.id_usu_fisico,
                  sexo: this.pessoa.sexo,
                  cpf: this.pessoa.cpf,
                  data_nascimento: d,
                  nome: this.pessoa.nome
                })
                .catch(function() {
                });
                
              await http.put("/endereco/" + this.user.idusuario, {
                fk_id_usuario: this.user.idusuario,
                id_endereco : this.endereco.id_endereco,
                rua: this.endereco.rua,
                numero: this.endereco.numero,
                complemento: this.endereco.complemento,
                cep: this.endereco.cep
              });
              alert("Cadastro realizado com sucesso");
              this.email = this.user.email;
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
  },
  mounted(){
    this.email = this.user.email;
  }
};
</script>

<style scoped>
#editar {
  padding-left: 10%;
  padding-right: 10%;
  padding-top: 5%;
  padding-bottom: 5%;
}
</style>
