<template>
  <div>
    <ProdutoLogado v-if="isLogged"/>
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
    
  }
};
</script>

<style scoped>
</style>
