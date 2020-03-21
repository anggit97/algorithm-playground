package MinimumSwap

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MinimumSwapTest {

    private lateinit var SUT: MinimumSwap

    @BeforeEach
    fun setup() {
        SUT = MinimumSwap()
    }

    @Test
    fun minimumSwap() {
        assertEquals(
            3, SUT.minimumSwaps(
                arrayOf(
                    4, 3, 1, 2
                )
            )
        )

        assertEquals(
            3, SUT.minimumSwaps(
                arrayOf(
                    2, 3, 4, 1, 5
                )
            )
        )

        assertEquals(
            3, SUT.minimumSwaps(
                arrayOf(
                    1, 3, 5, 2, 4, 6, 7
                )
            )
        )
    }
}