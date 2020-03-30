package CountNumberOfTeams

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CountNumberOfTeamsTest {

    private lateinit var SUT: CountNumberOfTeams

    @BeforeEach
    fun setup() {
        SUT = CountNumberOfTeams()
    }

    @Test
    fun countNumberOfTeams() {
        assertEquals(3, SUT.numTeams(intArrayOf(2, 5, 3, 4, 1)))
    }
}