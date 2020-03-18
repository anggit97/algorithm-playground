package DailyTemperatures

class DailyTemperatures {

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
}