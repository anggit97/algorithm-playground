package MinimumDistance

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MinimumDistanceTest {

    private lateinit var SUT: MinimumDistance

    @BeforeEach
    fun setup() {
        SUT = MinimumDistance()
    }

    @Test
    fun minimumDistance() {
        assertEquals(2, SUT.minimumDistances(arrayOf(3, 2, 1, 2, 3)))
        assertEquals(3, SUT.minimumDistances(arrayOf(7, 1, 3, 4, 1, 7)))
    }
}