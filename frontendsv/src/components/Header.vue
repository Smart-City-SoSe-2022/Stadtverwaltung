<template> 
    <button class="btns" onclick="window.location.href='http://server.it-humke.de:8001';">Portal</button>
  <div class="container">
    <h1> Willkommen bei der Stadtverwaltung</h1>
    <h3>Hier kannst du einen Verein oder eine Schule anmelden.</h3>
    <h4>Oben siehst du die Links zum anklicken, die dich auf die gewünschte Seite weiterleitet.
        <p>Wir Wünschen dir viel Spaß!</p>
    </h4>
  </div>
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

    .container{
        max-width: 500px;
        margin: 30px auto;
        overflow: auto;
        min-height: 300px;
        border: 1px solid steelblue;
        padding: 30px;
        border-radius: 5px;

    }
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
    .btns{
        margin:auto 5px;
    }
</style>