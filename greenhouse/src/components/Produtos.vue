<template>
  <div>
    <ProdutoLogado v-if="isLogged" :carrinho="carrinho"/>
    <ProdutoNLogado v-else/>
  </div>
</template>

<script>
import ProdutoLogado from "./ProdutoLogado";
import ProdutoNLogado from "./ProdutoNLogado";
export default {
  name: "Produto",
  components: {
    ProdutoLogado,
    ProdutoNLogado
  },
  props: {
    isLogged: Boolean,
    carrinho: Array
  }
};
</script>

<style scoped>
</style>
