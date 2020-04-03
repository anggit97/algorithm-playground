package MinimumDistance

import kotlin.math.abs

class MinimumDistance {

    fun minimumDistances(a: Array<Int>): Int {
        //3, 2, 1, 2, 3
        val result = mutableListOf<Int>()

        for ((index, item) in a.withIndex()) {
            for (index2 in index + 1 until a.size) {
                if (item == a[index2]) {
                    val distance = abs(index2 - index)
                    result.add(distance)
                }
            }
        }

        return result.min() ?: 0
    }
}