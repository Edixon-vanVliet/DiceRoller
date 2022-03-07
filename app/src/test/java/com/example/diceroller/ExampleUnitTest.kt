package com.example.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generate_number() {
        val maxValue = 6
        val dice = Dice(maxValue)
        val roll = dice.roll()

        assertTrue("The roll was not between 1 and $maxValue", roll in 1..6)
    }
}