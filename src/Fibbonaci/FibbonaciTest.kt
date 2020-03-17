package Fibbonaci

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FibbonaciTest{

    private lateinit var SUT: Fibbonaci

    @BeforeEach
    fun setup(){
        SUT = Fibbonaci()
    }

    @Test
    fun fibbonaci(){
        assertEquals(0, SUT.fib(0))
        assertEquals(1, SUT.fib(1))
        assertEquals(1, SUT.fib(2))
        assertEquals(2, SUT.fib(3))
        assertEquals(3, SUT.fib(4))
    }
}