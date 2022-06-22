<template>
  <div class="verein">
    <h1>Vereinseite</h1>
    <h4>Klicken Sie auf das gewünschte Feld,
        welches Sie dann weiterleiten wird</h4>
  </div>
  <div>
    <Button name="verein-umgebung" text="Vereine in der Umgebung" color="green" />
    <Button name="voraussetzungen" text="Voraussetzungen" color="green" />
    <Button name="warteliste-verein" text="Eintragen auf die Warteliste" color="green" />
  </div>
</template>

<script>
import Button from '@/components/Button.vue';
export default {
    name: "Verein",
    props: {
        title: String
    },
    components: { Button }
}
</script>