<template>
<div>
    <div class="row">
      <div class="col-lg-1 col-md-1 col-sm-1"></div>
    <div class="card mx-auto text-center col-lg-3 col-md-3 col-sm-3" v-for="item in items" :key="item" style="border-radius: 1rem;"
    :class="['servico-item', {active: selected==index}]">
        <img class="card-img-top" :src="item.src" alt="logo">
        <div class="card-body">
          <h5 class="card-title">{{item.nome}}</h5>
              <p class="card-text">{{item.text}}</p>
              <button class="btn btn-md btn-dark" v-on:click="addItem(item)">Contratar</button>
        </div>
    </div>
    <div class="col-lg-1 col-md-1 col-sm-1"></div>
  </div>
</div>

</template>

<script>
class Item {
  constructor(nome, preco, srcPhoto, qtd, id) {
    this.nome = nome;
    this.preco = preco;
    this.srcPhoto = srcPhoto;
    this.qtd = qtd;
    this.id = id
  }
}
export default {
  name: "Servico",
  props: {
    items:Array,
    CarrinhoItems:Array,
  },
  data: () => {
    return {
      selected: 0,
    };
  },
  methods:{
    addItem(item){
      this.CarrinhoItems.push(new Item( item.nome, item.preco, item.src, 1, item.id))

    }
  }
};
</script>

<style scoped>
</style>
