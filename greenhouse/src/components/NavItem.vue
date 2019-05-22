<template>
  <li :class="['nav-item',{active: selected == tab}]">
    <a :class="['nav-link',{disabled: selected == tab}]" @click="selected = tab">
      {{tab}}
    </a>
  </li>
</template>

<script>
export default {
  name: "NaviItem",
  props: {
    isLogged: Boolean,
    tab: String
  }
};
</script>

<style scoped>
</style>
