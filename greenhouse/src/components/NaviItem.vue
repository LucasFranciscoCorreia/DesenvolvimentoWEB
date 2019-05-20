<template>
  <li class="nav-item" v-bind:class="{active: isActive}">
    <a class="nav-link" v-bind:class="{disabled: isActive}" href="#">
      {{ name }}
    </a>
  </li>
</template>

<script>
export default {
  name: "NaviItem",
  props :{
      name: String,
      isActive: Boolean
  }
  
};
</script>

<style>
</style>
