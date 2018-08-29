<template>
    <v-app>
        <v-content>
            <standings-table :players="players"></standings-table>
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
            axios.get('players')
                 .then(response => (this.players = response.data));
        },
        components: {
            'standings-table': StandingsTable
        }
    }
</script>