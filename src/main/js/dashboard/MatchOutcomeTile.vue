<template>
    <v-card>
        <v-card-text class="pa-1">
            <p class="time-since">1 hour ago</p>
            <p class="winner">Jaco</p>
            <p>Pierre</p>
            <p>Chris</p>
            <p class="pseudo-loser">Charl</p>
        </v-card-text>
    </v-card>
</template>

<script>
    export default {
        props: {
        },
        data() {
            return {
            }
        }
    }
</script>

<style scoped lang="scss">
    p {
        line-height: 0;
    }

    .time-since {
        font-style: italic;
    }

    .winner {
        font-weight: bold;
        color: green;
    }

    .loser {
        font-weight: bold;
        color: red;
    }

    .vs-offset {
        padding-left: 1.5em;
    }
</style>
