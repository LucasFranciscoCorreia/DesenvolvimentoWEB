<template>
  <div>
    <div v-for="(item,index) in carouselItems" :key="index" :class="['carousel-item', {active: selected==index}]" 
    >
      <div class="col-sm-6 col-md-6 col-lg-6">
        <div class="card mb-2">
          <img class="image card-img-top" alt="Card image cap" :src="item.src">
          <div class="card-body">
            <h4 class="exp card-title font-weight-bold">{{item.title}}</h4>
            <p class="exp card-text">{{item.text}}</p>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Carousel",
  props: {
    carouselItems: Array
  },
  data: () => {
    return {
      selected: 0
    };
  }
};
</script>

<style scoped>
.image {
  width: 100%;
  max-width: 25em;
  max-height: 25em;
  display: block;
  margin-left: auto;
  margin-right: auto;
}
.exp {
  text-align: center;
  margin: auto;
  width: 50%;
  padding: 10px;
}
</style>
