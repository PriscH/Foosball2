package jp.foosball

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Foosball

fun main(args: Array<String>) {
    runApplication<Foosball>(*args)
}
