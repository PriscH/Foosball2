package jp.foosball.repositories

import jp.foosball.models.Player
import org.springframework.data.repository.CrudRepository

interface PlayerRepository : CrudRepository<Player, String>