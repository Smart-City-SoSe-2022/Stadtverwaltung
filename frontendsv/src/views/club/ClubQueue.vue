<template>
        <div class="col-md-8 col-xl-6 text-center mx-auto">
            <h2>Verein in die Warteliste eintragen</h2>
            <p class="w-lg-50">
              Die Felder einmal ausfüllen zum einreihen in die Warteliste.
            </p>
        </div>
  <header class="request">
    <section >
      <div>
        <br/>   
          <form class="rebox" method="post" @submit.prevent="createClub">
                <div class="mb-3">
                  <input class="form-control" type="text" name="foundername" placeholder="Gründername" v-model="founderName"/>
                </div>
                <div class="mb-3">
                  <input class="form-control" type="text" name="clubname" placeholder="Vereinsname" v-model="clubName"/>
                </div>
                <div class="mb-3">
                  <input class="form-control" type="number" name="member" placeholder="Mitglieder" v-model="member"/>
                </div>
                <div class="mb-3">
                  <input class="form-control" type="text" name="task" placeholder="Tätigkeit" v-model="task"/>
                </div>
                <div class="mb-3">
                  <input class="form-control" type="text" name="financing" placeholder="Finanzierung" v-model="financing"/>
                </div>
                <div class="mb-3">
                  <input class="form-control" type="textbox" name="description" placeholder="Beschreibung" v-model="description"/>
                </div>
                <div class="mb-2">
                  <button class="btn" color="blue" type="submit">Bestätigen</button>
                </div>
          </form>
      </div>
    </section>
  </header>
</template>

<script>
import { handleError } from '@vue/runtime-core';
export default {
  name: "createClub",
  data() {
    return {
      founderName: null,
      clubName: null,
      member: null,
      task: null,
      financing: null,
      description: null
    }
  },
  methods: {
    createClub() {
      var myHeaders = new Headers();
      myHeaders.append("Content-Type", "application/json");
      var raw = JSON.stringify({
        "founderName": this.founderName,
        "clubName": this.clubName,
        "member": this.member,
        "task": this.task,
        "financing": this.financing,
        "description": this.description
      });
      var requestOptions = {
        method: 'POST',
        headers: myHeaders,
        body: raw,
        redirect: 'follow',
        credentials: "include"
      };
      fetch("http://server.it-humke.de:9003/club/create", requestOptions)
          .then(response => response.text())
          .then(result => console.log(result))
          .then(() => this.$router.push({
            name: "home"
          }))
          .catch(error => console.log('error', error));
    }
  },
}
</script>

<style scoped>

.request{
        max-width: 200px;
        margin: 30px auto;
        overflow: auto;
        min-height: 300px;
        border: 1px solid steelblue;
        padding: 30px;
        border-radius: 5px;

    }
    .rebox{
      display: block;
    padding: 10px 6px;
    width: 100%;
    box-sizing: border-box;
    border: 10px;
    border-bottom: 1px solid #ddd;
    color: #555;
    }
    .mb-3{
    background: white;
    border: 0;
    padding: 5px 5px;
    color: white;
    border-radius: 50px;
    
    
    }
    .btn{
      background: green;
    }
    .form-control{
      padding: 5px 5px;
      border-block-end-width: 3px;
      block-size: 20px;
      border: 1px solid steelblue;
    }
</style>