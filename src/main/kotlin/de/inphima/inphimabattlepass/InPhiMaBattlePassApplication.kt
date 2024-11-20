package de.inphima.inphimabattlepass

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication                                  //yay spring :D
class InPhiMaBattlePassApplication

fun main(args: Array<String>) {                         //that IS fun
    runApplication<InPhiMaBattlePassApplication>(*args)
}
