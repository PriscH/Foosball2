<template>
    <v-data-table :headers="headers" :items="items" hide-actions class="elevation-1">
        <template slot="items" slot-scope="props">
            <td>{{ props.item.a }}</td>
            <td>{{ props.item.b }}</td>
            <td>{{ props.item.c }}</td>
        </template>
    </v-data-table>
</template>

<script>
    export default {
        props: {
            headers: Array,
            items: Array
        },
        data() {
            return {}
        }
    }
</script>