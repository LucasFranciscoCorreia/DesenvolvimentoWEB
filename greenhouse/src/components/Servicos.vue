<template>
  <div>
    <ServicoLogado v-if="isLogged" :carrinho="carrinho"/>
    <ServicoNLogado v-else />
  </div>
</template>

<script>
import ServicoLogado from "./ServicoLogado";
import ServicoNLogado from "./ServicoNLogado";
export default {
  name: "Servicos",
  components: {
    ServicoLogado,
    ServicoNLogado
  },
  props: {
    isLogged: Boolean,
    carrinho: Array
  }
};
</script>

<style scoped>
</style>
