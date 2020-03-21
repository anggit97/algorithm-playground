package RotLeftArray

import kotlin.math.abs

class RotLeftArray {

    /**
     * o(n)
     */
    fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
        val result = Array(a.size) { 0 }

        for ((index, item) in a.withIndex()) {
            var remainder: Int = d - index
            when {
                remainder > 0 -> {
                    remainder = a.size - remainder
                    result[remainder] = item
                }
                remainder == 0 -> result[0] = item
                else -> result[abs(remainder)] = item
            }
        }

        return result
    }
}