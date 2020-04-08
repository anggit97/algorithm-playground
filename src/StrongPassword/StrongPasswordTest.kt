package StrongPassword

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StrongPasswordTest{

    private lateinit var SUT: StrongPassword

    @BeforeEach
    fun setup(){
        SUT = StrongPassword()
    }

    @Test
    fun strongPassword(){
        assertEquals(3, SUT.minimumNumber(3, "Ab1"))
    }
}