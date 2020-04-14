package CaesarCipher

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CaesarChiperTest {

    private lateinit var SUT: CaesarChiper

    @BeforeEach
    fun setup() {
        SUT = CaesarChiper()
    }

    @Test
    fun caesarChiper() {
        assertEquals("okffng-Qwvb", SUT.caesarCipher("middle-Outz", 2))
    }
}