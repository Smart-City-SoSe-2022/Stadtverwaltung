<template>
  <div>
    <h2>Schule in die Warteliste eintragen</h2>
      <p class="w-lg-50">
        Die Felder einmal ausfüllen zum einreihen in die Warteliste.
      </p>
  </div>
  <header class="request">
    <section>
      <div>
          <div>
            <br/>
              </div>
              <form class="rebox" method="post" @submit.prevent="createSchool">
                <div class="mb-3">
                  <input class="form-control" type="text" name="schoolName" placeholder="Schulname" v-model="schoolName"/>
                </div>
                <div class="mb-3">
                  <input class="form-control" type="text" name="founderName" placeholder="Gründername" v-model="founderName"/>
                </div>
                <div class="mb-3">
                  <input class="form-control" type="number" name="teacher" placeholder="Lehrkräfte" v-model="teacher"/>
                </div>
                <div class="mb-3">
                  <input class="form-control" type="number" name="classrooms" placeholder="Klassenräume" v-model="classrooms"/>
                </div>
                <div class="mb-2">
                  <button class="btn"  color="blue" type="submit">Bestätigen</button>
                </div>
              </form>
      </div>
    </section>
  </header>
</template>

<script>
export default {
  name: "createSchool",
  data() {
    return {
      schoolName: null,
      founderName: null,
      teacher: null,
      classrooms: null,
    }
  },
  methods: {
    createSchool() {
      var myHeaders = new Headers();
      myHeaders.append("Content-Type", "application/json");
      var raw = JSON.stringify({
        "schoolName": this.schoolName,
        "founderName": this.founderName,
        "teacher": this.teacher,
        "classrooms": this.classrooms,
      });
      var requestOptions = {
        method: 'POST',
        headers: myHeaders,
        body: raw,
        redirect: 'follow',
        credentials: "include"
      };
      fetch("http://server.it-humke.de:9003/school/create", requestOptions)
          .then(response => response.text())
          .then(result => console.log(result))
          .then(() => this.$router.push({
            name: "home"
          }))
          .catch(error => console.log('error', error));
    }
  } 
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
      background: #0868AC;
    }
    .form-control{
      padding: 5px 5px;
      border-block-end-width: 3px;
      block-size: 20px;
      border: 1px solid steelblue;
    }
</style>