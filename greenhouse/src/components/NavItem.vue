<template>
  <li :class="['nav-item',{active: getRoute() == getName()}]">
    <a :href="getContent()" :class="['nav-link',{disabled: getRoute()== getName()}]">
      <!-- <router-link :to="getContent()">{{tab.name}}</router-link> -->
      {{tab.name}}
    </a>
  </li>
</template>

<script>
export default {
  name: "NaviItem",
  props: {
    isLogged: Array,
    tab: Object
  },
  methods: {
    getName() {
      return this.tab.name;
    },
    getContent() {
      return this.tab.content;
    },
    getRoute() {
      return this.$router.currentRoute.name;
    }
  }
};
</script>

<style scoped>
</style>
