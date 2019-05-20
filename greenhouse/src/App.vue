<template>
  <div id="app">
    <nav class="navbar navbar-expand-lg navbar-light mr-auto">
      <div class="collapse navbar-collapse ml-auto" id="navbarNav">
        <ul class="navbar-nav ml-auto">
          <li v-for="tab in tabs" :key="tab" @click="selected=tab" :class="['nav-item',{active: selected == tab}]">
            <a class="nav-link">{{tab}}</a>
          </li>
        </ul>
      </div>
    </nav>
    <component :is="selected" class="tab"></component>
  </div>
</template>

<script>
import Inicio from "./components/Inicio.vue"
import Sobre from "./components/Sobre.vue"
export default {
  name: "app",
  components: {
    Inicio,  Sobre
  },
  data: () => {
    return {
      tabs: ["Inicio", "Sobre"],
      selected: "Inicio"
    };
  },
};
</script>

<style>
#app {
  
}
</style>
