<template>
    <v-card>
        <v-card-actions class="justify-center">
            <v-dialog persistent scrollable max-width="600"
                      v-model="dialogActive"
            >
                <v-btn large slot="activator">Capture Match Result</v-btn>

                <v-card>
                    <v-card-title class="headline grey lighten-2" primary-title>
                        Select Players
                    </v-card-title>

                    <v-card-text>
                        <v-text-field solo v-model.trim="playerFilter"></v-text-field>
                    </v-card-text>

                    <v-divider></v-divider>

                    <v-card-text style="height: 400px;">
                        <v-list>
                            <v-list-tile
                                v-for="(player) in filteredPlayers"
                                :key="player.name"
                                :class="player.selected ? 'selected' : ''"
                                @click="toggleSelection(player.name)"
                            >
                                {{player.name}}

                                <v-spacer></v-spacer>

                                <v-fade-transition>
                                    <v-icon x-large color="success"
                                            v-if="player.selected"
                                    >
                                        check_circle
                                    </v-icon>
                                </v-fade-transition>
                            </v-list-tile>
                        </v-list>
                    </v-card-text>

                    <v-divider></v-divider>

                    <v-card-actions>
                        <v-spacer></v-spacer>
                        <v-btn flat color="secondary"
                               @click="dialogActive = false"
                        >
                            Cancel
                        </v-btn>
                        <v-btn flat color="primary"
                               :disabled="!playerQuotaReached"
                               @click="dialogActive = false"
                        >
                            Continue
                        </v-btn>
                    </v-card-actions>
                </v-card>
            </v-dialog>
        </v-card-actions>
    </v-card>
</template>

<script>
    export default {
        props: {
        },
        data() {
            return {
                playerQuota: 4,
                dialogActive: false,
                players: [{
                    name: 'Jaco',
                    selected: false
                }, {
                    name: 'Pierre',
                    selected: false
                }, {
                    name: 'Chris',
                    selected: false
                }, {
                    name: 'Charl',
                    selected: false
                }, {
                    name: 'Marnes',
                    selected: false
                }, {
                    name: 'Channel',
                    selected: false
                }, {
                    name: 'Christopher',
                    selected: false
                }, {
                    name: 'Daniel',
                    selected: false
                }],
                playerFilter: ''
            }
        },
        computed: {
            filteredPlayers: function() {
                return this.players.filter(player =>
                    !this.playerFilter
                    || player.name.toLowerCase().includes(this.playerFilter.toLowerCase())
                    || player.selected
                ).sort((a, b) =>
                    a.name.localeCompare(b.name)
                )
            },
            playerQuotaReached: function() {
                return this.players.filter(player => player.selected)
                                   .length === this.playerQuota
            }
        },
        methods: {
            toggleSelection: function(playerName) {
                this.players.filter(player => { return player.name === playerName })
                            .forEach(player => {
                                if (player.selected || !this.playerQuotaReached)
                                    player.selected = !player.selected
                            })
            }
        }
    }
</script>

<style scoped lang="scss">
    .selected {
        background-color: green;
    }
</style>
