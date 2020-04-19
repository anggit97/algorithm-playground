package BetweenTwoNumbers

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BetweenTwoNumbersTest {

    private lateinit var SUT: BetweenTwoNumbers

    @BeforeEach
    fun setup() {
        SUT = BetweenTwoNumbers()
    }

    @Test
    fun betweenTwoNumbers() {
        assertEquals(2, SUT.getTotalX(arrayOf(2, 6), arrayOf(24, 36)))
        assertEquals(3, SUT.getTotalX(arrayOf(2, 4), arrayOf(16, 32, 96)))
    }
}