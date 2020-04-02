package CutTheStick

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CutTheStickTest {

    private lateinit var SUT: CutTheStick

    @BeforeEach
    fun setup() {
        SUT = CutTheStick()
    }

    @Test
    fun cutTheStick() {
        val expected = arrayOf(6, 4, 2, 1).toMutableList()
        val actual = SUT.cutTheSticks(arrayOf(5, 4, 4, 2, 2, 8)).toMutableList()
        assertEquals(
            expected,
            actual
        )
    }
}