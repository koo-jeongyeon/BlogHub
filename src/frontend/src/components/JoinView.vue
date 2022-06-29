<template>
<div>
    <v-form v-model="valid">
      <v-container>
           회원가입창
        <v-row>
          <v-col
            cols="12"
            md="4"
          >
            <v-text-field
              v-model="name"
              :rules="nameRules"
              :counter="10"
              label="이름"
              required
            ></v-text-field>
          </v-col>
  
          <v-col
            cols="12"
            md="4"
          >
            <v-text-field
              v-model="homeid"
              :rules="nameRules"
              :counter="10"
              label="id"
              required
            ></v-text-field>
          </v-col>
  
          <v-col
            cols="12"
            md="4"
          >
            <v-text-field
              v-model="password"
              :rules="passwordRules"
              label="비밀번호"
              required
            ></v-text-field>
          </v-col>
        </v-row>
        <v-row>
          <v-col
            cols="12"
            md="6"
          >
            <v-text-field
              v-model="email"
              :rules="emailRules"
              :counter="10"
              label="이매알"
              require
            ></v-text-field>
          </v-col>
  
          <v-col
            cols="12"
            md="6"
          >
            <v-text-field
              v-model="phone"
              :rules="phoneRules"
              :counter="10"
              label="폰번호"
              required
            ></v-text-field>
          </v-col>
        </v-row>

        <v-row class="text-center">
             <v-col
            cols="12"
          >
            <v-btn
            elevation="2"
            @click="JoinBtn()"
            >회원가입</v-btn>
            <router-link :to="`/login`">
                 <v-btn
                    elevation="2"
                    >로그인</v-btn>
                </router-link>
            </v-col>
        </v-row>
      </v-container>
    </v-form>


      

</div>
</template>

<script>
export default {
    name: "JoinView",

    data: () => ({
        valid: false,
        name: '',
        homeid: '',
        password: '',
        email: '',
        phone: '',

        nameRules: [
        v => !!v || 'Name is required',
        v => v.length <= 10 || 'Name must be less than 10 characters',
        ],
        emailRules: [
        v => !!v || 'E-mail is required',
        v => /.+@.+/.test(v) || 'E-mail must be valid',
        ],
        passwordRules: [],
        phoneRules: []
    }),

    methods: {

        addUserInfo() {
                console.log("name" + this.name);
                return this.$axios({
                    method: 'post',
                    url: '/api/join',
                    data: {
                        homeid: this.homeid,
                        name: this.name,
                        password: this.password,
                        email: this.email,
                        phone: this.phone
                    }
                })
        },

        async JoinBtn() {

            try {
                await this.addUserInfo();

                this.$router.push({
                    name: "login"
                })
            } catch (error) {
                console.log(error);
            }

        }

    }
}
</script>

<style>

</style>