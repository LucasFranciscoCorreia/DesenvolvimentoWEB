<template>
<div>
    <div class="row">
      <div class="col-lg-1 col-md-1 col-sm-1"></div>
    <div class="card mx-auto text-center col-lg-3 col-md-3 col-sm-3" v-for="item in items" :key="item" style="border-radius: 1rem; margin-top:15px;"
    :class="['servico-item', {active: selected==index}]">
        <img class="card-img-top" :src="item.src" alt="logo">
        <div class="card-body">
          <h5 class="card-title">{{item.nome}}</h5>
              <p class="card-text">{{item.text}}</p>
              <h5 class="card-title">R$ {{item.preco}}</h5>
              <button class="btn btn-md btn-dark" v-on:click="addItem(item)">Contratar</button>
        </div>
    </div>
    <div class="col-lg-1 col-md-1 col-sm-1"></div>
  </div>
</div>

</template>

<script>
class ItemPedido {
  constructor(nome, preco, srcPhoto, qtd, id) {
    this.item={
      name: nome,
      preco : preco,
      srcPhoto : srcPhoto,
      id : id
    }
    this.qtd = qtd;
   
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
      this.CarrinhoItems.push(new ItemPedido( item.nome, item.preco, item.src, 1, item.id))

    }
  }
};
</script>

<style scoped>
</style>
