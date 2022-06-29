<template>
  <v-app>
    <v-app-bar
      app
      color="primary"
      dark
    >
      <div class="d-flex align-center">
        <v-img
          alt="Vuetify Logo"
          class="shrink mr-2"
          contain
          src="https://cdn.vuetifyjs.com/images/logos/vuetify-logo-dark.png"
          transition="scale-transition"
          width="40"
        />

        <v-img
          alt="Vuetify Name"
          class="shrink mt-1 hidden-sm-and-down"
          contain
          min-width="100"
          src="https://cdn.vuetifyjs.com/images/logos/vuetify-name-dark.png"
          width="100"
        />
      </div>

      <v-spacer></v-spacer>

      <div v-if="this.$store.state.name == ''">
      <router-link :to="`/login`">
        <span class="mr-2 logintext">로그인</span>
        </router-link>
      </div>
      <div v-else>
         <span class="mr-2 logintext">{{this.$store.state.name}}님 환영합니다</span>
      </div>
        
    </v-app-bar>

    <v-main>
      <router-view/>
    </v-main>
  </v-app>
</template>

<script>

export default {
  name: 'App',

  data: () => ({

    //
  }),

     methods: {
      

        // mounted() { //왜 dom구문에선 받아와 지고 스크립트에선 안되는거지? 알아야함,, 그리고 app.vue가 최상위라 home한테 넘긴 파라미터라도 같이 받는건가? 확인필요
        // console.log("??" + this.$store.state.nickname);
        // }
     }
};
</script>

<style>

.logintext{
  color: white;
}

</style>