package jp.foosball

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FoosballApplication

fun main(args: Array<String>) {
    runApplication<FoosballApplication>(*args)
}
