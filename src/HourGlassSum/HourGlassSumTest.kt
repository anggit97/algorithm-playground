package HourGlassSum

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HourGlassSumTest {

    private lateinit var SUT: HourGlassSum

    @BeforeEach
    fun setup() {
        SUT = HourGlassSum()
    }

    @Test
    fun hourglassSum() {
        assertEquals(
            19,
            SUT.hourglassSum(
                arrayOf(
                    arrayOf(1, 1, 1, 0, 0, 0),
                    arrayOf(0, 1, 0, 0, 0, 0),
                    arrayOf(1, 1, 1, 0, 0, 0),
                    arrayOf(0, 0, 2, 4, 4, 0),
                    arrayOf(0, 0, 0, 2, 0, 0),
                    arrayOf(0, 0, 1, 2, 4, 0)
                )
            )
        )

        assertEquals(
            28,
            SUT.hourglassSum(
                arrayOf(
                    arrayOf(-9, -9, -9, 1, 1, 1),
                    arrayOf(0, -9, 0, 4, 3, 2),
                    arrayOf(-9, -9, -9, 1, 2, 3),
                    arrayOf(0, 0, 8, 6, 6, 0),
                    arrayOf(0, 0, 0, -2, 0, 0),
                    arrayOf(0, 0, 1, 2, 4, 0)
                )
            )
        )
    }
}