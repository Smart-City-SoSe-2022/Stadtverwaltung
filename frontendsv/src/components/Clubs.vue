<template>
    <div :key="club.id" class="clubs" v-for="club in clubs">
        <p>Gründername:<br> {{club.founderName}} </p>
        <p>Clubname:<br> {{club.clubName}} </p>
        <p>Mitglieder: <br>{{club.member}} </p>
        <p>Tätigkeit:<br>{{club.task}} </p>
        <p>Finanzierung:<br>{{club.financing}}<br/> </p>
        <p>Beschreibung:<br>{{club.description}} </p>
    </div>
</template>

<script>
export default{
    name: 'Clubs',
    props:{
        clubs: Array
    }
}
</script>

<style scoped>
.clubs{
        max-width: 700px;
        margin: 30px auto;
        overflow: auto;
        min-height: 50px;
        border: 1px solid steelblue;
        padding: 30px;
        border-radius: 5px;
        background: #C8E6C9;
        

}
p {
        display:inline-block;
        justify-content: space-between;
        margin: 10px;
}
</style>