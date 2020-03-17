package MissingNumber

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MissingNumberTest {

    private lateinit var SUT: MissingNumber

    @BeforeEach
    fun setup() {
        SUT = MissingNumber()
    }

    @Test
    fun missingNumber() {
        assertEquals(2, SUT.missingNumber(intArrayOf(3, 0, 1)))
        assertEquals(8, SUT.missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
    }
}