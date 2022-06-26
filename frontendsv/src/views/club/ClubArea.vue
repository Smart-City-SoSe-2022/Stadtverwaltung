<template>
    <div class="container">
        <h1>Vereine in der Umgebung</h1>
    </div>
    <Clubs :clubs="clubs"/>
</template>

<script>
import Clubs from '@/components/Clubs.vue'

export default {
    name: 'ClubArea',
    components:{
        Clubs
    },
  data() {
    return {
      clubs: []
    }
  },
  methods: {
    async fetchClub() {
      var myHeaders = new Headers();
      myHeaders.append("Content-Type","application/json");
      var requestOptions = {
        method: 'GET',
        headers: myHeaders,
        redirect: 'follow',
        credentials: "include"
      }
      const res = await fetch('http://server.it-humke.de:9003/club/clublist', requestOptions)
      const data = await res.json()
      return data
    }
  },
  async created() {
    this.clubs = await this.fetchClub()
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