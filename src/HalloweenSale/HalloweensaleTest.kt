package HalloweenSale

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HalloweensaleTest {

    private lateinit var SUT: Halloweensale

    @BeforeEach
    fun setup() {
        SUT = Halloweensale()
    }

    @Test
    fun halloweenSale() {
        assertEquals(6, SUT.howManyGames(20, 3, 6, 80))
        assertEquals(7, SUT.howManyGames(20, 3, 6, 85))
        assertEquals(0, SUT.howManyGames(100 ,1 ,1 ,99))
    }
}