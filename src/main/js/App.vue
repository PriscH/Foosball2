<template>
    <v-app>
        <v-content>
            <v-container>
                <v-layout row>
                    <v-flex>
                        <match-outcome-tile></match-outcome-tile>
                    </v-flex>
                    <v-flex>
                        <match-outcome-tile></match-outcome-tile>
                    </v-flex>
                    <v-flex>
                        <match-outcome-tile></match-outcome-tile>
                    </v-flex>
                    <v-flex>
                        <match-outcome-tile></match-outcome-tile>
                    </v-flex>
                </v-layout>
                <match-players-select></match-players-select>
                <standings-table :players="players"></standings-table>
                <v-btn @click="greet">Click me!</v-btn>
            </v-container>
        </v-content>
    </v-app>
</template>

<script>
    import axios from 'axios';

    import StandingsTable from './dashboard/StandingsTable.vue';
    import MatchOutcomeTile from './dashboard/MatchOutcomeTile.vue';
    import MatchPlayersSelect from "./dashboard/MatchPlayersSelect.vue";

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
            MatchPlayersSelect,
            MatchOutcomeTile,
            StandingsTable
        }
    }
</script>