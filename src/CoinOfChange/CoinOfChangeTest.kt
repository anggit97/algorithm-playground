package CoinOfChange

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class CoinOfChangeTest {

    private lateinit var SUT: CoinOfChange

    @BeforeEach
    fun setup() {
        SUT = CoinOfChange()
    }

    @Test
    fun coinChangeIteration() {
        assertEquals(3, SUT.coinChangeIteration(intArrayOf(1, 2, 5), 11))
        assertEquals(-1, SUT.coinChangeIteration(intArrayOf(2), 3))
    }
}