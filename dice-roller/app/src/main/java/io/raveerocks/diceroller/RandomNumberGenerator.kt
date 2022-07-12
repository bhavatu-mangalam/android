package io.raveerocks.diceroller

import java.util.*

class RandomNumberGenerator {

    fun generateRandomNumber(): Int {
        return Random().nextInt(6) + 1
    }
}