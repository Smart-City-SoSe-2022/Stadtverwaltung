<template>
    <div>
    <h1>Voraussetzungen für das Gründen von einem Verein</h1>
    <h2>Wichtige Information</h2>
    </div>
    <div>
        <h4>1 Gründungsmitglied
           <p>Mindestens 7 Mitglieder</p> 
            <p>Vereinsname: keine Rassistischen oder extrimistischen Namen.
            Darf auch nicht heißen wie ein anderer Verein.</p>
            <p>Ein Klarer Name für das erkennen der Tätigkeit.</p>
            Verletzung von marken ist auch nicht gestattet.
            <p>Der Zweck vom Verein darf keine Geld gewinnung sein, sondern
            soll nur die Kosten decken.</p>
        </h4>
    </div>
</template>

<script>
import Button from '@/components/Button.vue'

export default {
    name: 'Requirement',
    props: {
        title: String,
    },
    components: {
        Button,
    }    
}
</script>