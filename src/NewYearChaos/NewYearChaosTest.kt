package NewYearChaos

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NewYearChaosTest {

    private lateinit var SUT: NewYearChaos

    @BeforeEach
    fun setup() {
        SUT = NewYearChaos()
    }

    @Test
    fun newYearChaos() {
        assertEquals(3, SUT.minimumBribes(arrayOf(2, 1, 5, 3, 4)))
        assertEquals(-1, SUT.minimumBribes(arrayOf(2, 5, 1, 3, 4)))
    }
}