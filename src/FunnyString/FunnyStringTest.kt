package FunnyString

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FunnyStringTest {

    private lateinit var SUT: FunnyString

    @BeforeEach
    fun setup() {
        SUT = FunnyString()
    }

    @Test
    fun funnyString() {
        assertEquals("Funny", SUT.funnyString("acxz"))
        assertEquals("Not Funny", SUT.funnyString("bcxz"))
    }
}