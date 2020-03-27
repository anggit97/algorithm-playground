package FindDigit

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FindDigitTest{

    private lateinit var SUT: FindDigit

    @BeforeEach
    fun setup(){
        SUT = FindDigit()
    }

    @Test
    fun findDigit(){
        assertEquals(2, SUT.findDigits(12))
        assertEquals(3, SUT.findDigits(1012))
    }
}