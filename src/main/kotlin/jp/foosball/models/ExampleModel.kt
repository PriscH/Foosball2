package jp.foosball.models

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class ExampleModel(
    @Id val login: String,
        val firstname: String,
        val lastname: String,
        val description: String? = null)