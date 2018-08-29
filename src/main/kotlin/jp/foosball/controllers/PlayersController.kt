package jp.foosball.controllers

import jp.foosball.dtos.PlayerStanding
import jp.foosball.repositories.PlayerRepository
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class PlayersController (
    private val playerRepository: PlayerRepository
) {

    @GetMapping("/players")
    fun index(model: Model): List<PlayerStanding> =
        playerRepository.findAll()
                        .mapIndexed { i, player ->  PlayerStanding(i + 1, player.id, (0..10).random(), (0..10).random(), ((3 - i) * 500), (-50..50).random() )}

    private fun ClosedRange<Int>.random() =
        Random().nextInt((endInclusive + 1) - start) + start
}