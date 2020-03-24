package PickingNumber

import kotlin.math.abs

class PickingNumber {

    /**
     * Time Complexity : O(n2)
     * Space Complexity : O(n)
     */
    fun pickingNumbers(a: Array<Int>): Int {
        // Write your code here
        val sortedArray = a.sortedArray()

        val resultResult = mutableMapOf<Int, Int>()

        for ((index, item) in sortedArray.withIndex()) {

            val idx = index + 1

            if (resultResult.containsKey(item)) continue

            resultResult[item] = 1

            for (index2 in idx until sortedArray.size) {

                val sum = abs(item - sortedArray[index2])

                if (sum > 1) break

                if (resultResult.containsKey(item)) {
                    resultResult[item] = resultResult[item]!! + 1
                } else {
                    resultResult[item] = 1
                }
            }
        }

        var max = 0
        for (item in resultResult) {
            if (item.value > max) max = item.value
        }

        return max
    }
}