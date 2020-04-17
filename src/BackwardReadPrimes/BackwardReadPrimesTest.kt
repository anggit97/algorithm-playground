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
        assertEquals("13 17 31 37 71 73 79 97", SUT.backwardsPrime(2, 100))
        assertEquals("7027 7043 7057", SUT.backwardsPrime(7000, 7100))
        assertEquals("70001 70009 70061 70079 70121 70141 70163 70241", SUT.backwardsPrime(70000, 70245))
    }

    @Test
    fun isPrivateNumber(){
        assertEquals(true, SUT.isPrimeNumber(29))
        assertEquals(true, SUT.isPrimeNumber(19))
        assertEquals(false, SUT.isPrimeNumber(21))
    }
}