package io.raveerocks.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val randomNumberGenerator = RandomNumberGenerator()

    @Test
    fun numberGeneratedIsInRange() {
        val numberGenerated = randomNumberGenerator.generateRandomNumber()
        assertTrue(numberGenerated > 0)
        assertTrue(numberGenerated < 7)
    }


}