<template>
    <div class="request">
    <h1>Anfragen</h1>
    <Tasks @delete-task="deleteTask" :tasks="tasks" />
    </div>
</template>


<script>
// @ is an alias to /src
import Tasks from '@/components/Tasks.vue'


export default {
  name: 'Requests',
  components: {
    Tasks
  },
  data(){
    return{
        tasks: []
    }
  },
  methods: {
    deleteTask(id){
      if(confirm('Sind Sie sicher?')){
      this.tasks = this.tasks.filter((task) => task.id !==id)
      }
    },
    async fetchclubEntity(){
      const res = await fetch('http://server.it-humke.de:9003')

      const data = await res.json

      return data

    }
  },
  async created(){
    this.tasks = await this.fetchclubEntity()    
  },
}
</script>

<style scope>
.request{
        max-width: 500px;
        margin: 30px auto;
        overflow: auto;
        min-height: 300px;
        border: 1px solid steelblue;
        padding: 30px;
        border-radius: 5px;

    }
</style>