import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    name: ""
  },
  getters: {
  },
  mutations: {
    SET_NAME(state,name){
      state.name = name
    }
  },
  actions: {
  },
  modules: {
  }
})
