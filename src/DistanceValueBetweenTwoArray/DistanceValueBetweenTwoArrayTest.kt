package DistanceValueBetweenTwoArray

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DistanceValueBetweenTwoArrayTest {

    private lateinit var SUT: DistanceValueBetweenTwoArray

    @BeforeEach
    fun setup() {
        SUT = DistanceValueBetweenTwoArray()
    }

    @Test
    fun distanceValueBetweenTwoArray() {
        assertEquals(
            3, SUT.findTheDistanceValue(
                intArrayOf(4, 5, 8),
                intArrayOf(10, 9, 1, 8),
                2
            )
        )

        assertEquals(
            2, SUT.findTheDistanceValue(
                intArrayOf(1, 4, 2, 3),
                intArrayOf(1 - 4, -3, 6, 10, 20, 30),
                3
            )
        )
    }
}