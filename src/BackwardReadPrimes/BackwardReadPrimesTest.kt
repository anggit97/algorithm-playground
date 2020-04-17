package BackwardReadPrimes

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BackwardReadPrimesTest{

    private lateinit var SUT: BackwardReadPrimes

    @BeforeEach
    fun setup(){
        SUT = BackwardReadPrimes()
    }

    @Test
    fun backwardReadPrimes(){
        assertEquals("7027 7043 7057", SUT.backwardsPrime(7000, 7100))
    }
}