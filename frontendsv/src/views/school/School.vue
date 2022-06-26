<template>
    <div class="School">
        <h1>Schulverwaltung</h1>
        <h4>Klicken Sie auf das gewünschte Feld,
            welches Sie dann weiterleiten wird</h4>
    </div>
    <div>
    <Button name="schule-umgebung" text="Schulen in der Umgebung" color="#0868AC" />
    <Button name="Sprechstunden" text="Sprechstunden" color="#0868AC" />
    <Button name="warteliste-schule" text="Eintragen auf die Warteliste" color="#0868AC" />
  </div>
</template>


<script>
import Button from '@/components/Button.vue';
export default {
    name: "School",
    props: {
        title: String
    },
    components: { Button }
}
</script>