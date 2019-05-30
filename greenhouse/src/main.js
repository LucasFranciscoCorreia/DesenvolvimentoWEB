import Vue from 'vue'
import VModal from 'vue-js-modal'
import VueResource from 'vue-resource'
import BootstrapVue from 'bootstrap-vue'
import axios from 'axios'
import VueAxios from 'vue-axios'
import App from './App.vue'
// import router from "./router.js"
// import Vuex from 'vuex'

Vue.use(VModal)
Vue.use(BootstrapVue)
Vue.use(VueResource)
Vue.use(axios)
Vue.use(VueAxios)
// Vue.use(Vuex)

new Vue(
  // Vue.util.extend({router}, App)
  
  {
  // router,
  render: h => h(App),
}
).$mount('#app')
