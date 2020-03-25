package MaximumStreaks

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MaximumStreaksTest {

    private lateinit var SUT: MaximumStreaks

    @BeforeEach
    fun setup() {
        SUT = MaximumStreaks()
    }

    @Test
    fun maximumStreaks() {
        val expected = arrayOf(2, 3).toMutableList()
        val actual =
            SUT.getMaxStreaks(arrayOf("Heads", "Tails", "Tails", "Tails", "Heads", "Heads", "Tails")).toMutableList()
        assertEquals(
            expected,
            actual
        )
    }
}