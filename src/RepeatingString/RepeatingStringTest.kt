package RepeatingString

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RepeatingStringTest {

    private lateinit var SUT: RepeatingString

    @BeforeEach
    fun setup() {
        SUT = RepeatingString()
    }

    @Test
    fun repeatingString() {
        assertEquals(7, SUT.repeatedString2("aba", 10))
        assertEquals(100, SUT.repeatedString2("a", 100))
        assertEquals(1000000000000, SUT.repeatedString2("a", 1000000000000))
    }
}