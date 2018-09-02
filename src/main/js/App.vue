<template>
    <v-app>
        <v-content>
            <standings-table :players="players"></standings-table>
            <v-btn @click="greet">Click me!</v-btn>
        </v-content>
    </v-app>
</template>

<script>
    import axios from 'axios';
    import StandingsTable from './dashboard/StandingsTable.vue';

    export default {
        data() {
            return {
                players: []
            };
        },
        mounted() {
            axios.get('api/players')
                 .then(response => (this.players = response.data));
        },
        methods: {
            greet: function () {
                let test = 'Jaco'
                alert('Hello ' + test + '!')
            }
        },
        components: {
            'standings-table': StandingsTable
        }
    }
</script>