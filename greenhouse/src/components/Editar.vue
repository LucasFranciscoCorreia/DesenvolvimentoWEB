<template>
  <div id="editar">
    <div class="row py-1">
      <div class="col-sm-6 col-lg-6 col-md-6">
        <input type="text" placeholder="Email">
      </div>
      <div class="col-sm-6 col-lg-6 col-md-6">
        <input type="password" placeholder="Password">
      </div>
    </div>
    <div class="row py-1">
      <div class="col-sm-12 col-lg-12 col-md-12">
        <input type="text" placeholder="Nome">
      </div>
    </div>
    <div class="row py-1">
      <div class="col-sm-6 col-lg-6 col-md-6">
        <input type="text" placeholder="CPF">
      </div>
      <div class="col-sm-3 col-lg-3 col-md-3">
        <input type="text" placeholder="Data de nascimento">
      </div>
      <div class="col-sm-3 col-md-3 col-lg-3">
        <input type="text" placeholder="CEP">
      </div>
    </div>
    <div class="row py-1">
      <div class="col-sm-6 col-md-6 col-lg-6">
        <input type="text" placeholder="Endereco">
      </div>
      <div class="col-sm-4 col-md-4 col-lg-4">
        <input type="text" placeholder="Complemento">
      </div>
      <div class="col-sm-2 col-lg-2 col-md-2">
        <input type="text" placeholder="Numero">
      </div>
    </div>
    <div class="row py-1">
      <div class="col-sm-6 col-lg-6 col-md-6">
        <input type="text" placeholder="Telefone 1">
      </div>
      <div class="col-sm-6 col-lg-6 col-md-6">
        <input type="text" placeholder="Telefone 2">
      </div>
    </div>
    <div id="row">
        <button id="cancel">Cancelar</button>
        <span class="col-sm-10 col-md-10 col-lg-10"></span>
        <button id="confirm">Confirmar</button>
    </div>
  </div>
</template>

<script>
export default {};
</script>

<style scoped>
    #editar{
        padding-left: 10%;
        padding-right: 10%;
        padding-top: 5%;
        padding-bottom: 5%;
    }
    #cancel{
        
    }
    #confim{
        float: right;
    }
    #buttons{
        display: inline-block;
    }
</style>
