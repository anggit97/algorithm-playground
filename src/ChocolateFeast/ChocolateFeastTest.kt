package ChocolateFeast

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class ChocolateFeastTest {

    private lateinit var SUT: ChocolateFeast

    @BeforeEach
    fun setup() {
        SUT = ChocolateFeast()
    }

    @Test
    fun chocolateFeast() {
        assertEquals(6, SUT.chocolateFeast(10, 2, 5))
        assertEquals(3, SUT.chocolateFeast(12, 4, 4))
        assertEquals(5, SUT.chocolateFeast(6, 2, 2))
    }
}