<template>
  <div id="app">
    <Navi/>
    <Footer/>
    
  </div>
</template>

<script>
import Navi from "./components/Navi.vue";
import Footer from "./components/Footer.vue";

export default {
  name: "app",
  components: {
    Navi,
    Footer
  }
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}
</style>
