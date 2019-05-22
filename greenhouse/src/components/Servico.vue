<template>
  <div class="card mx-auto text-center col-lg-3 col-md-3 col-sm-3" style="border-radius: 1rem;">
    <img class="card-img-top" :src="src" alt="logo">
    <div class="card-body">
      <h5 class="card-title">{{title}}</h5>
      <p
        class="card-text"
      >{{text}}</p>
      <a href="#" class="btn btn-md btn-dark">Contratar</a>
    </div>
  </div>
</template>

<script>
export default {
  name: "Servico",
  props: {
    title: String,
    text: String,
    src: String
  }
};
</script>

<style scoped>
</style>
