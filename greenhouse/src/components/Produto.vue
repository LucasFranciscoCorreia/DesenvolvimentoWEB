<template>
  <div class="row">
    <div class="col-lg-4 col-md-4 col-sm-4" v-for="item in items" :key="item">
      <div class="card mb-2">
        <img class="card-img-top" :src="item.src" alt="Card image cap">
        <div class="card-body">
          <p class="card-text">{{item.text}}</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Produto",
  props: {
    items: Array
  }
};
</script>


<style scoped>
</style>

