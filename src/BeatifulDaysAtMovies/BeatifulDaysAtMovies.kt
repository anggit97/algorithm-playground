package BeatifulDaysAtMovies

import kotlin.math.abs

class BeatifulDaysAtMovies {

    fun beautifulDays(i: Int, j: Int, k: Int): Int {
        var countBeatifulDay = 0
        for (index in i..j) {
            val rev = index.toString().reversed().toInt()
            val v = abs(index-rev)
            if (v % k == 0) {
                countBeatifulDay++
            }
        }
        return countBeatifulDay
    }
}