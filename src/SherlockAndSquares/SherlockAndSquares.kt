package SherlockAndSquares

import kotlin.math.sqrt

class SherlockAndSquares {

    fun squares(a: Int, b: Int): Int {
//        var count = 0
//        for (i in a..b){
//            val number = sqrt(i.toDouble())
//            if (number%1.0 == 0.0) count++
//        }
//        return count

        var numOfSquares = 0
        var x = 1
        while (x*x < a) x++
        while (x*x <= b){
            numOfSquares++
            x++
        }
        return numOfSquares
    }
}