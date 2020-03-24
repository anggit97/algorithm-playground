package DistanceValueBetweenTwoArray

import kotlin.math.abs

class DistanceValueBetweenTwoArray {

    fun findTheDistanceValue(arr1: IntArray, arr2: IntArray, d: Int): Int {
        var countDistance = 0
        arr1.forEach { num1 ->
            arr2.forEach { num2 ->
                val calc = abs(num1.minus(num2))
                if (calc <= d) countDistance += 1
            }
        }
        return countDistance
    }
}