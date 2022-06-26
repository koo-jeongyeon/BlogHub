<template>
    <v-container>
        <v-row class="text-center">
            <v-col cols="12">
            
            로그인 창
            <div>
                    <v-text-field
                        label="Main input"
                        :rules="rules"
                        hide-details="auto"
                        v-model="id"
                    ></v-text-field>
                    <v-text-field 
                        label="Another input"
                        v-model="password"
                    ></v-text-field>

                    <v-btn
                    elevation="2"
                    @click="loginBtn()"
                    >로그인</v-btn>

            </div>
            </v-col>
        </v-row>
    </v-container>
</template>

<script>

export default {
    name: 'LoginView', 

    data: () => ({
        rules: [
        value => !!value || 'Required.',
        value => (value && value.length >= 3) || 'Min 3 characters',
        ],
        
        id: "",
        password: "",
    }),

    

    methods: {

        getUserInfo() {
            return this.$axios.post('/api/login',{
                parame: {
                    id: this.id,
                    password: this.password
                }
            })
        },
      
        async loginBtn () { 

            try {
                const getUserInfoPromise = await this.getUserInfo()
                
                this.$router.push({
                    name: "about",
                    query: {nickname: getUserInfoPromise.data.nickname}
                })

            } catch (error) {
                console.log(error);
            }
        },

        // loginBtn() {

        //      console.log("비동기 처리 1");

        //     axios({
        //         method: 'post',
        //         url: '/api/login'
        //     })
        //     .then(function (res) {
        //         console.log(res.data);
        //         console.log(res.status);
        //         console.log(res.headers);
                
        //     })
        //     .catch(function (error) {
        //         console.log(error);
        //     })

        //     console.log("비동기 처리 2");
            
        // }

    },
    
    // mounted() { //일반적으로 가장 많이 사용, 실제 dom에 부착되고 난 이후에 실행되므로 모든 요소에 접근이 가능함

    // },



}
</script>

<style>
 
</style>
 
