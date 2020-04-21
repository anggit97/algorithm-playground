package SherlockAndSquares

import kotlin.math.sqrt

class SherlockAndSquares {

    fun squares(a: Int, b: Int): Int {
        var count = 0
        for (i in a..b){
            val number = sqrt(i.toDouble())
            if (number%1.0 == 0.0) count++
        }
        return count
    }
}