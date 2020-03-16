package MorseCodeDecoder

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MorseCodeDecoderTest{

    private lateinit var SUT: MorseCodeDecoder

    @BeforeEach
    fun setup(){
        SUT = MorseCodeDecoder()
    }

    @Test
    fun morseCodeDecoder(){
        assertEquals("ACE", SUT.decodeMorse(".- -.-. ."))
        assertEquals("ACE ECA", SUT.decodeMorse(".- -.-. .  . -.-. .-"))
        assertEquals("HEY JUDE", SUT.decodeMorse(".... . -.--   .--- ..- -.. ."))
    }
}