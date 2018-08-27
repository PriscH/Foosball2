<template>
    <v-app>
        <v-content>
            <standings-table v-bind:headers="headers" v-bind:items="values"></standings-table>
        </v-content>
    </v-app>
</template>

<script>
    import StandingsTable from './dashboard/StandingsTable.vue'

    export default {
        data() {
            return {
                headers: [{
                    text: 'A',
                    value: 'a',
                }, {
                    text: 'B',
                    value: 'b',
                }, {
                    text: 'C',
                    value: 'c',
                }],
                values: [{
                    a: '1',
                    b: '2',
                    c: '3'
                }, {
                    a: 'Uno',
                    b: 'Dos',
                    c: 'Tres'
                }]
            }
        },
        components: {
            'standings-table': StandingsTable
        }
    }
</script>