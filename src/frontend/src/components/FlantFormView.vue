<template>
 <v-container>
 내 식물 등록 

<v-row>
          <v-col
            cols="12"
            md="4"
          >
            <v-text-field
              v-model="name"
              label="식물이름"
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
            >등록</v-btn>
            
        <router-link :to="`/FlantList`">
            <v-btn 
                 elevation="2"
            >내 식물 리스트 가기
            </v-btn>
        </router-link>

        </v-col>


        </v-row>
 </v-container>
</template>

<script>
export default {
    name: "FlantFormView"

}
</script>

<style>

</style>