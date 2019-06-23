<template>
<div>
    <hr class="my-4">
<div v-for="(item,index) in CarrinhoItems" :key="index" :class="['carrinho-item', {active: selected==index}]">
<div  class="row">
              <div class="col-sm-7 col-md-7 col-lg-7">
                  <div class="row">

                <div class="col-sm-3 col-md-3 col-lg-3">
                   <img :src="item.item.srcPhoto" height="58" style=" margin:auto;">
                </div>
                <div class="col-sm-9 col-md-9 col-lg-9">
                   <h4>
                    <strong>{{item.item.name}}</strong>
                  </h4>
                </div>
                  </div>
                </div>
                <div class="col-sm-3 col-md-3 col-lg-3">
                   Qtd. <input v-model="item.qtd" style="width: 40px;"/>
                </div>
                <div class="col-sm-2 col-md-2 col-lg-2">
                <h4>R$ {{item.item.preco * item.qtd}}</h4>
              </div>
              
            </div>
            
            <div class="row">
                <div class="col-sm-10 col-md-10 col-lg-10">
                </div>
                <div class="col-sm-2 col-md-2 col-lg-2">
                <a style="text-align:right; color:#0000EE;"  v-on:click="remover(index)" >Remover</a>
                </div>
            </div>
    <hr class="my-4">
</div>
</div>
</template>

<script>
export default {
  name: "CarrinhoItem",
  props: {
    CarrinhoItems: Array,
    total:Number,
    parentfunction: Function
  },
  data: () => {
    return {
      selected: 0,
    };
  },
  methods:{
      remover(index){
        this.CarrinhoItems.splice(index,1);
        this.parentfunction()
      }
      
  },
  mounted(){
      
  }
};
</script>