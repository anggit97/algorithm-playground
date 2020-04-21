package SherlockAndSquares

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SherlockAndSquaresTest {

    private lateinit var SUT: SherlockAndSquares

    @BeforeEach
    fun setup() {
        SUT = SherlockAndSquares()
    }

    @Test
    fun sherlockAndSquares() {
        assertEquals(2, SUT.squares(3, 9))
        assertEquals(0, SUT.squares(17, 24))
    }
}