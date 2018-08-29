package jp.foosball.models

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Player(
    @Id val id: String
)