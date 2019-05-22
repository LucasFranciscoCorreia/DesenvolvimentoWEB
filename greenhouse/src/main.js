import Vue from 'vue'
import App from './App.vue'
// import router from "./router.js"
// import Vuex from 'vuex'
import VModal from 'vue-js-modal'


Vue.use(VModal)
// Vue.use(Vuex)

new Vue(
  // Vue.util.extend({router}, App)
  {
  // router,
  render: h => h(App),
}
).$mount('#app')
