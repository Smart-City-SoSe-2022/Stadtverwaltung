<template>
    <div class="container">
        <h1>Schulen in der Umgebung</h1>
    </div>
    <Schooles :schooles="schooles"/>
</template>

<script>
import Schooles from '@/components/Schooles.vue'

export default {
    name: 'ClubArea',
    components:{
        Schooles
    },
  data() {
    return {
      schooles: []
    }
  },
  methods: {
    async fetchSchool() {
      var myHeaders = new Headers();
      myHeaders.append("Content-Type","application/json");
      var requestOptions = {
        method: 'GET',
        headers: myHeaders,
        redirect: 'follow',
        credentials: "include"
      }
      const res = await fetch('http://server.it-humke.de:9003/school/schoollist', requestOptions)
      const data = await res.json()
      return data
    }
  },
  async created() {
    this.schooles = await this.fetchSchool()
  }
}
</script>

<style scoped>
    
    .container {
        display: inline-block;
        justify-content: space-between;
        margin-left: 100px;
    }
</style>