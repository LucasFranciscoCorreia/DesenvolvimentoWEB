<template>
  <li :class="['nav-item',{active: getRoute() == getName()}]">
    <a :class="['nav-link',{disabled: getRoute()== getName()}]" :href="getContent()">
        {{tab.name}}
    </a>
  </li>
</template>

<script>
export default {
  name: "NaviItem",
  props: {
    isLogged: Boolean,
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
