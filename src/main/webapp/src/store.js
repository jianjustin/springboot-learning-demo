import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
  	drawer: null,

  },
  mutations: {
  	setDrawer(context,msg){
     context.custid = msg;
   },

  },
  actions: {

  }
})
