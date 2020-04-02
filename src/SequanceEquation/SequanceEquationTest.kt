package SequanceEquation

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SequanceEquationTest {

    private lateinit var SUT: SequanceEquation

    @BeforeEach
    fun setup() {
        SUT = SequanceEquation()
    }

    @Test
    fun sequanceEquation() {
        val expected = arrayOf(4, 2, 5, 1, 3).toMutableList()
        val actual = SUT.permutationEquation(arrayOf(5, 2, 1, 3, 4)).toMutableList()
        assertEquals(
            expected,
            actual
        )


        val expected2 = arrayOf(2, 3, 1).toMutableList()
        val actual2 = SUT.permutationEquation(arrayOf(2, 3, 1)).toMutableList()
        assertEquals(
            expected,
            actual
        )

        val expected3 = arrayOf(1, 3, 5, 4, 2).toMutableList()
        val actual3 = SUT.permutationEquation(arrayOf(4, 3, 5, 1, 2)).toMutableList()
        assertEquals(
            expected,
            actual
        )
    }
}