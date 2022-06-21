<template>
    
    <Button />
</template>

<script>
import Button from './Button.vue'

export default {
    name: 'Body',
    props: {
        title: String,
    },
    components: {
        Button
    }    
}
</script>