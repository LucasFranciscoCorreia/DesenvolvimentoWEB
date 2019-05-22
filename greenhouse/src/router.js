import Vue from "vue";
import Router from "vue-router"

import Inicio from "./components/Inicio.vue"
import Sobre from "./components/Sobre.vue"
import MinhaConta from "./components/MinhaConta.vue"


  import ServicoNLogado from "./components/ServicoNLogado.vue"
  import ServicoLogado from "./components/ServicoLogado.vue"
  import ProdutoNLogado from "./components/ProdutoNLogado.vue"
  import ProdutoLogado from "./components/ProdutoLogado.vue"

Vue.use(Router)
export default new Router({
    mode: "history",
    routes: [{
        path: "/",
        name: "Inicio",
        component: Inicio
    },
    {
        path: "/sobre",
        name: "Sobre",
        component: Sobre
    },
    {
        path: "/servicosUser",
        name: "ServicoLogado",
        component: ServicoLogado
    },
    {
        path: "/produtosUser",
        name: "ProdutoLogado",
        component: ProdutoLogado
    },
    {
        path: "/produtos",
        name: "ProdutoNLogado",
        component: ProdutoNLogado
    },
    {
        path: "/servicos",
        name: "ServicoNLogado",
        component: ServicoNLogado
    },
    {
        path: "/minhaConta",
        name: "MinhaConta",
        component: MinhaConta
    },

    {
        path: "user/123",
        name: "Usuario",
        component: MinhaConta
    }
    ]
    
});
