package RansomNote

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RansomNoteTest {

    private lateinit var SUT: RansomNote

    @BeforeEach
    fun setup() {
        SUT = RansomNote()
    }

    @Test
    fun checkMagazine() {
        val yes = "Yes"
        val no = "No"
        assertEquals(
            yes, SUT.checkMagazine(
                arrayOf(
                    "give", "me", "one", "grand", "today", "night"
                ),
                arrayOf(
                    "give", "one", "grand", "today"
                )
            )
        )

        assertEquals(
            no, SUT.checkMagazine(
                arrayOf(
                    "two", "times", "three", "is", "not", "four"
                ),
                arrayOf(
                    "two", "times", "two", "is", "four"
                )
            )
        )

        assertEquals(
            no, SUT.checkMagazine(
                arrayOf(
                    "ive", "got", "a", "lovely", "bunch", "of", "coconuts"
                ),
                arrayOf(
                    "ive", "got", "some", "coconuts"
                )
            )
        )
    }
}