package ViralAdvertising

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ViralAdvertisingTest {

    private lateinit var SUT: ViralAdvertising

    @BeforeEach
    fun setup() {
        SUT = ViralAdvertising()
    }

    @Test
    fun viralAdvertising() {
        assertEquals(9, SUT.viralAdvertising(3))
    }
}