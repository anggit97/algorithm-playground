package DailyTemperatures

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DailyTemperaturesTest {

    private lateinit var SUT: DailyTemperatures

    @BeforeEach
    fun setup() {
        SUT = DailyTemperatures()
    }

    @Test
    fun dailyTemperatures() {
        assertEquals(
            intArrayOf(1, 1, 4, 2, 1, 1, 0, 0).toMutableList(),
            SUT.dailyTemperatures(intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)).toMutableList()
        )
    }

    @Test
    internal fun dailyTemperaturesStack() {
        assertEquals(
            intArrayOf(1, 1, 4, 2, 1, 1, 0, 0).toMutableList(),
            SUT.dailyTemperaturesStack(intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)).toMutableList()
        )
    }
}