<template>
    <div :key="school.id" class="schools" v-for="school in schooles">
        <p>Schulname:<br> {{school.schoolName}} </p>
        <p>Gründername:<br> {{school.founderName}} </p>
        <p>Lehrkräfte: <br>{{school.teacher}} </p>
        <p>Klassenräume:<br>{{school.classrooms}} </p>
    </div>
</template>

<script>
export default{
    name: 'Schooles',
    props:{
        schooles: Array
    }
}
</script>

<style scoped>
.schools{
        max-width: 700px;
        margin: 30px auto;
        overflow: auto;
        min-height: 50px;
        border: 1px solid steelblue;
        padding: 30px;
        border-radius: 5px;
        background: #B3E5FC;
        

}
p {
        display:inline-block;
        justify-content: space-between;
        margin: 10px;
}
</style>