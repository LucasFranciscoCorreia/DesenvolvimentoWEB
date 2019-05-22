import Vue from 'vue'
import App from './App.vue'
import router from "./router.js"

import VModal from 'vue-js-modal'

Vue.use(VModal)

export var loggedIn = {is: false};

new Vue(
  Vue.util.extend({router}, App)
  // {
  // router,
  // render: h => h(App),
// }
).$mount('#app')
