package JumpingOnTheClouds

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class JumpingOnTheCloudsTest {

    private lateinit var SUT: JumpingOnTheClouds

    @BeforeEach
    fun setup() {
        SUT = JumpingOnTheClouds()
    }

    @Test
    fun jumpingOnTheCloud() {
        assertEquals(3, SUT.jumpingOnClouds(arrayOf(0, 0, 0, 0, 1, 0)))
        assertEquals(4, SUT.jumpingOnClouds(arrayOf(0, 0, 1, 0, 0, 1, 0)))
    }
}