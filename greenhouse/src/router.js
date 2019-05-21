import Vue from "vue";
import Router from "vue-router"

import Inicio from "./components/Inicio.vue"
import Sobre from "./components/Sobre.vue"
import MinhaConta from "./components/MinhaConta.vue"

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
        path: "user/123",
        name: "Usuario",
        component: MinhaConta
    }
    ]
});
