<template>
 <v-container>
 내 식물 리스트 

  <v-row class="text-center">
             <v-col
            cols="12"
          >

          <!-- 내가 등록한 식물들 리스트 쭉 보여줌 -->
            <!-- 달력버튼 누르면 달력 컴포넌트로 변경 -->
           <v-btn
                 elevation="2"
            >달력</v-btn>
            
            <router-link :to="`/flantform`">
            <v-btn
                 elevation="2"
            >식물 등록하기
            </v-btn>
            </router-link>

            </v-col>


        </v-row>
 </v-container>
</template>

<script>
export default {
    name: "FlantListView"

}
</script>

<style>

</style>