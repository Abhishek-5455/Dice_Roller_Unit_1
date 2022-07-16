package com.abhishek.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generate_random() {
        val dice = DiceRoll(6)
        val number = dice.getRandom()
        assertTrue("number is between 1 and 6",number in 1..6)
    }
}