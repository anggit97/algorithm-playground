package BeatifulDaysAtMovies

import kotlin.math.abs

class BeatifulDaysAtMovies {

    fun beautifulDays(i: Int, j: Int, k: Int): Int {
        var num: Int
        var count = 0
        var gn: Int
        var quo: Int
        var newNum: Int
        for (x in i..j) {
            num = x
            newNum = 0
            //For reversing no
            while (num != 0) {
                quo = num % 10
                newNum = 10 * newNum + quo
                num /= 10
            }
            gn = abs(x - newNum)
            if (gn % k == 0) {
                count++
            }
        }
        return count
    }
}