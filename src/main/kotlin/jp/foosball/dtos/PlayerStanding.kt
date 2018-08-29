package jp.foosball.dtos

data class PlayerStanding(
    val position: Int,
    val name: String,
    val wins: Int,
    val losses: Int,
    val elo: Int,
    val change: Int
)