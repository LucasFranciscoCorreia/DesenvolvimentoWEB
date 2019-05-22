import Vue from "vue";
import Router from "vue-router"

import Inicio from "./components/Inicio.vue"
import Sobre from "./components/Sobre.vue"
import MinhaConta from "./components/MinhaConta.vue"
import Servico from "./components/Servicos.vue"
import Produto from "./components/Produtos.vue"
import Contato from "./components/Contato.vue"

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
            path: "/produtos",
            name: "Produtos",
            component: Produto
        },
        {
            path: "/user",
            name: "MinhaConta",
            component: MinhaConta
        },
        {
            path: "/contato",
            name: "Contato",
            component: Contato
        },
        {
            path:"/",
            name: "Inicio",
            component: Inicio
        },
        {
            path: "*",
            redirect: '/'
        }
    ]

});
