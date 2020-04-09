package FunnyString

import kotlin.math.abs

class FunnyString {

    fun funnyString(s: String): String {
        val reverseString = s.reversed().map { it.toInt() }
        val string = s.map { it.toInt() }

        for (i in 1 until reverseString.size) {
            val result = abs(reverseString[i] - reverseString[i - 1])
            val result1 = abs(string[i] - string[i - 1])
            if (result != result1) return "Not Funny"
        }

        return "Funny"
    }
}