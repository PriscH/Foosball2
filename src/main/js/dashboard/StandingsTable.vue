<template>
    <v-data-table :headers="headers" :items="players" hide-actions class="elevation-1">
        <template slot="items" slot-scope="props">
            <td>{{ props.item.position }}</td>
            <td>{{ props.item.name }}</td>
            <td>{{ props.item.wins }}</td>
            <td>{{ props.item.losses }}</td>
            <td>{{ props.item.elo }}</td>
            <td>{{ props.item.change }}</td>
        </template>
    </v-data-table>
</template>

<script>
    export default {
        props: {
            players: Array
        },
        data() {
            return {
                headers: [{
                    value: 'position',
                }, {
                    text: 'Player',
                    value: 'player',
                }, {
                    text: 'Wins',
                    value: 'wins',
                }, {
                    text: 'Losses',
                    value: 'losses',
                }, {
                    text: 'Elo',
                    value: 'elo',
                }, {
                    text: 'Change',
                    value: 'change',
                }]
            }
        }
    }
</script>