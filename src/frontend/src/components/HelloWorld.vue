<template>
  <v-container>
    <v-row class="text-center">
      <v-col cols="12">
        <v-img
          :src="require('../assets/logo.svg')"
          class="my-3"
          contain
          height="200"
        />
      </v-col>

      <v-col class="mb-4">
        <h1 class="display-2 font-weight-bold mb-3">
          Welcome to Vuetify
        </h1>

        <p class="subheading font-weight-regular">
          For help and collaboration with other Vuetify developers,
          <br>please join our online
          <a
            href="https://community.vuetifyjs.com"
            target="_blank"
          >Discord Community</a>
        </p>
      </v-col>

      <v-col
        class="mb-5"
        cols="12"
      >
        <h2 class="headline font-weight-bold mb-3">
          What's next?
        </h2>

        <v-row justify="center">
          <a
            v-for="(next, i) in whatsNext"
            :key="i"
            :href="next.href"
            class="subheading mx-3"
            target="_blank"
          >
            {{ next.text }}
          </a>
        </v-row>
      </v-col>

      <v-col
        class="mb-5"
        cols="12"
      >
        <h2 class="headline font-weight-bold mb-3">
          Important Links
        </h2>

        <v-row justify="center">
          <a
            v-for="(link, i) in importantLinks"
            :key="i"
            :href="link.href"
            class="subheading mx-3"
            target="_blank"
          >
            {{ link.text }}
          </a>
        </v-row>
      </v-col>

      <v-col
        class="mb-5"
        cols="12"
      >
        <h2 class="headline font-weight-bold mb-3">
          Ecosystem
        </h2>

        <v-row justify="center">
          <a
            v-for="(eco, i) in ecosystem"
            :key="i"
            :href="eco.href"
            class="subheading mx-3"
            target="_blank"
          >
            {{ eco.text }}
          </a>
          <span v-bind:title="message">
            내 위에 잠시 마우스를 올리면 동적으로 바인딩된 타이틀을 볼수있습니다
          </span>
          <p v-if="seen"> 이 메시지 표시 </p>
          <ol>
            <li v-for="todo in todos" :key="todo.id">
              {{ todo.text }}
            </li>
          </ol>
        </v-row>
      </v-col>
      <v-col
        class="mb-5"
        cols="12"
      >
        <v-row>
          <p>{{message2}}</p>
          <button v-on:click="reverseMessage">메시지 뒤집기</button>
        </v-row>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
  export default {
    name: 'HelloWorld',

  

    data: () => ({

      message2: "안녕하세요 뷰2",
      
      todos:[
        {
          id: 1,
          text: "js배우기"
        },
        {
          id: 2,
          text: "vue 배우기"
        }
      ],
      seen: false,
      message: '이 페이지는'+new Date()+'에 로드되었습니다.',
      ecosystem: [
        {
          text: 'vuetify-loader',
          href: 'https://github.com/vuetifyjs/vuetify-loader',
        },
        {
          text: 'github',
          href: 'https://github.com/vuetifyjs/vuetify',
        },
        {
          text: 'awesome-vuetify',
          href: 'https://github.com/vuetifyjs/awesome-vuetify',
        },
      ],
      importantLinks: [
        {
          text: 'Documentation',
          href: 'https://vuetifyjs.com',
        },
        {
          text: 'Chat',
          href: 'https://community.vuetifyjs.com',
        },
        {
          text: 'Made with Vuetify',
          href: 'https://madewithvuejs.com/vuetify',
        },
        {
          text: 'Twitter',
          href: 'https://twitter.com/vuetifyjs',
        },
        {
          text: 'Articles',
          href: 'https://medium.com/vuetify',
        },
      ],
      whatsNext: [
        {
          text: 'Explore components',
          href: 'https://vuetifyjs.com/components/api-explorer',
        },
        {
          text: 'Select a layout',
          href: 'https://vuetifyjs.com/getting-started/pre-made-layouts',
        },
        {
          text: 'Frequently Asked Questions',
          href: 'https://vuetifyjs.com/getting-started/frequently-asked-questions',
        },
      ],
    }),

    beforeCreate() { //vue 인스턴스가 초기화된 직후
      console.log(this.message);
    },
    created() { //data에 직접 접근이 가능함, 컴포넌트 초기에 외부에서 받은 값으로 data를 세팅하거나 이벤트 리스너를 선언해야 할때 이단계가 적절
      console.log(this.message);
    },
    beforeMount() { //dom에 부착되기 직전에 호출되는 훅임, 가상 dom이 생성되어 있으나 실제 dom에 부착되지 않은 상태
      console.log(this.message);
    },
    mounted() { //일반적으로 가장 많이 사용, 실제 dom에 부착되고 난 이후에 실행되므로 모든 요소에 접근이 가능함
      console.log(this.message);
    },

    beforeUpdate() { //컴포넌트에서 사용되는 data의 값이 변해서 dom에도 그 변화를 적용시켜야할때 변화 직전에 호출됨, 변할 값을 이용해 가상dom을 호출하기 전이지만 이 값을 이용해 작업할 수 있음
      console.log(this.message);
    },
    update() { //가상dom을 렌더링 하고 실제 dom이 변경된 이후에 호출됨, 변경된 값들을 dom을 이용해 접근하고 싶으면 updated훅이 가장 적절함
    //다만, 이 훅에서 data를 변경하는건 무한 루프를 일으킬수있음
      console.log(this.message);
    },
    beforDestroy() { //해당 인스턴스가 해체되기 직전에 호출, 인스턴스가 사라지기전에 해야할 일들을 처리하면됨
      console.log(this.message);
    },
    destroyed() { //인스턴스가 해체된 직후 호출
      console.log(this.message);
    }

  }
</script>
