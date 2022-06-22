<template> 
  <button onclick="window.location.href='http://server.it-humke.de:8001';">Portal</button>
  <h1> Willkommen bei der Stadtverwaltung</h1>
</template>

<script>
import Button from './Button.vue'

export default {
    name: 'Header',
    props: {
        title: String,
    },
    components: {
        Button,
    }    
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->

<style scoped>
    button {
        display: inline-block;
        background: #41b883;
        color:#fff ;
        border: none;
        padding: 10px 20px;
        margin: 5px;
        border-radius: 5px;
        cursor: pointer;
        text-decoration: none;
        font-size: 15px;
        font-family: inherit;
    }
</style>