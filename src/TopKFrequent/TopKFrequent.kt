package TopKFrequent

fun main() {
    val testCaseArr1 = intArrayOf(1, 1, 1, 2, 2, 3)
    val k = 2
    println("Top $k element in array ${testCaseArr1.toList()}")
    println("Result : ${topKFrequent(testCaseArr1, k)}")
}

fun topKFrequent(nums: IntArray, k: Int): List<Int> {
    val frequencyMap = mutableMapOf<Int, Int>()
    val buckets = arrayOfNulls<MutableList<Int>>(nums.size + 1)

    nums.forEach { item ->
        if (frequencyMap.containsKey(item)) {
            val counting = frequencyMap[item]!! + 1
            frequencyMap[item] = counting
        } else {
            frequencyMap[item] = 1
        }
    }
    println(frequencyMap)
    println(buckets.toMutableList())

    println("===============")

    for (key in frequencyMap.keys) {
        val frequency = frequencyMap[key]
        if (buckets[frequency!!] == null) {
            buckets[frequency] = mutableListOf()
        }
        buckets[frequency]?.add(key)
    }

    println(frequencyMap)
    println(buckets.toMutableList())

    println("===============")

    val result = mutableListOf<Int>()
    var pos = buckets.size - 1
    while (pos >= 0 && result.size < k) {
        if (buckets[pos] != null) {
            result.addAll(buckets[pos]!!)
        }
        pos--
    }

    println(frequencyMap)
    println(buckets.toMutableList())
    println(result)

    println("===============")

    return result
}