package HappyNumber

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HappyNumberTest{

    private lateinit var SUT: HappyNumber

    @BeforeEach
    fun setup(){
        SUT = HappyNumber()
    }

    @Test
    fun happyNumber(){
        assertEquals(true, SUT.isHappy(19))
    }
}