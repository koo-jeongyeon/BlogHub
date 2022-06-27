import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../components/HomeView.vue'
import LoginView from '../components/LoginView.vue'
import JoinView from '../components/JoinView.vue'
import FlantListView from '../components/FlantListView.vue'
import FlantFormView from '../components/FlantFormView.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/login',
    name: 'login',
    component: LoginView
  },
  {
    path: '/Join',
    name: 'Join',
    component: JoinView
  },
  {
    path: '/FlantList',
    name: 'FlantList',
    component: FlantListView
  },
  {
    path: '/FlantFormView',
    name: 'FlantFormView',
    component: FlantFormView
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
