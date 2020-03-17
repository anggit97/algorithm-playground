package MoveZero

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MoveZeroTest {

    private lateinit var SUT: MoveZero

    @BeforeEach
    fun setup() {
        SUT = MoveZero()
    }

    @Test
    fun moveZeroes() {
        assertEquals(intArrayOf(1, 3, 12, 0, 0).toMutableList(), SUT.moveZeroes(intArrayOf(0, 1, 0, 3, 12)).toMutableList())
    }
}