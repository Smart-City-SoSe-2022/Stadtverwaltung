<template>
    <div>
    <h1>Sprechstunden</h1>

    <h2>Montag - Freitag</h2>
    <h3>8:00 Uhr - 10:00 Uhr</h3>
    <h3>13:00 Uhr - 14:00 Uhr</h3>
    </div>
    <div>
        <h1>Zoom Link</h1>
        <h3>https//schulverwaltung.zoom.us/walterhelfer</h3>
    </div>
    <div>
        <h1>Email-Adresse</h1>
        <h3>walter.helfer@schulverwaltung.de</h3>
    </div>
</template>

<script>
import Button from '@/components/Button.vue'

export default {
    name: 'Sprechstunden',
    props: {
        title: String,
    },
    components: {
        Button,
    }    
}
</script>