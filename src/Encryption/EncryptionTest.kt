package Encryption

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class EncryptionTest {

    private lateinit var SUT: Encryption

    @BeforeEach
    fun setup() {
        SUT = Encryption()
    }

    @Test
    fun encryption() {
        assertEquals("hae and via ecy", SUT.encryption("haveaniceday"))
//        assertEquals("fto ehg ee dd", SUT.encryption("feedthedog"))
    }
}