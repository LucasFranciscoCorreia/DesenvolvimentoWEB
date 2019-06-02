<template>
<div>
<div v-for="(item,index) in historicoItems" :key="index" :class="['historico-item', {active: selected==index}]">
<div  class="row">
              <div class="col-sm-10 col-md-10 col-lg-10">
                <div class="row">
                  <h4>
                    <strong>{{item.nome}}</strong>
                  </h4>
                </div>
                <div class="row">
                  <h4>Data: {{item.data}}</h4>
                </div>
              </div>
              <div class="col-sm-2 col-md-2 col-lg-2">
                <img :src="item.srcPhoto" height="58" style=" margin:auto;">
              </div>
            </div>
</div>
</div>
</template>

<script>
export default {
  name: "Historico",
  props: {
    historicoItems: Array
  },
  data: () => {
    return {
      selected: 0
    };
  }
};
</script>