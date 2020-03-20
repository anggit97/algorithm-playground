package BasicCalculator2

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BasicCalculator2Test {

    private lateinit var SUT: BasicCalculator2

    @BeforeEach
    fun setup() {
        SUT = BasicCalculator2()
    }

    @Test
    fun calculate() {
        assertEquals(9, SUT.calculate("3+2*2+2"))
        assertEquals(-1, SUT.calculate("8/8-2"))
        assertEquals(5, SUT.calculate("3+5 / 2"))
        assertEquals(49, SUT.calculate("7*7"))
    }
}