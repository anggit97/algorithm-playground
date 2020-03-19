package DailyTemperatures

class DailyTemperatures {

    /**
     * O(n2)
     */
    fun dailyTemperatures(T: IntArray): IntArray {
        val result = mutableListOf<Int>()

        for ((index1, temp1) in T.withIndex()) {
            val idx = index1 + 1
            var distanceDay = 0
            for (index2 in idx until T.size) {
                if (temp1 < T[index2]) {
                    distanceDay = index2 - index1
                    break
                }
            }
            result.add(distanceDay)
        }
        return result.toIntArray()
    }

    /**
     * O(n)
     */
    fun dailyTemperaturesStack(T: IntArray): IntArray {
        val stack = mutableListOf<Int>()
        val result = IntArray(T.size)
        for ((index1, tmpr1) in T.withIndex()) {
            while (stack.isNotEmpty() && tmpr1 > T[stack.size - 1]) {
                val idx = stack[stack.size-1]
                stack.removeAt(stack.size - 1)
                result[idx] = index1 - idx
            }
            stack.add(index1)
        }
        return result
    }
}