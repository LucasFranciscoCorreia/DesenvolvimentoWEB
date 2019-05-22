import Vue from "vue";
import Router from "vue-router"

import Inicio from "./components/Inicio.vue"
import Sobre from "./components/Sobre.vue"
import MinhaConta from "./components/MinhaConta.vue"

import Servico from "./components/Servicos.vue"
// import ProdutoNLogado from "./components/ProdutoNLogado.vue"

Vue.use(Router)
export default new Router({
    mode: "history",
    routes: [
        {
            path: "/sobre",
            name: "Sobre",
            component: Sobre
        },
        {
            path: "/servicos",
            name: "Servico",
            component: Servico
        },
        {
            path: "/user",
            name: "MinhaConta",
            component: MinhaConta
        },
        {
            path: "*",
            name: "Inicio",
            component: Inicio
        }
    ]

});
