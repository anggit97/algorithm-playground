package RotLeftArray

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RotLeftArrayTest {

    private lateinit var SUT: RotLeftArray

    @BeforeEach
    fun setup() {
        SUT = RotLeftArray()
    }

    @Test
    fun rotLeftArray() {
        val expected = arrayOf(5, 1, 2, 3, 4).toMutableList()
        val actual = SUT.rotLeft(arrayOf(1, 2, 3, 4, 5), 4).toMutableList()
        assertEquals(expected, actual)
    }
}