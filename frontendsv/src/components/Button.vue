<template>
    <button @click="onClick()" :style="{ background: color}" class="btn">{{ text }}</button>
</template>

<script>
export default{
    name: 'Button',
    props: {
        text: String,
        color: String,
        name: String
    },
    methods: {
        onClick(){
            this.$router.push("/" + this.name)
        }
    }
}
</script>
