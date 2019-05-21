import Vue from 'vue'
import App from './App.vue'
import router from "./router.js"

new Vue(
  Vue.util.extend({router}, App)
  // {
  // router,
  // render: h => h(App),
// }
).$mount('#app')
