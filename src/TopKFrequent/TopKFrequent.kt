package TopKFrequent

fun main() {
    val testCaseArr1 = intArrayOf(2, 2, 3, 7, 7, 7)
    val k = 2
    println("Top $k element in array ${testCaseArr1.toList()}")
    println("Result : ${topKFrequent(testCaseArr1, k)}")
}

fun topKFrequent(nums: IntArray, k: Int): List<Int> {
    val mutableMap = mutableMapOf<Int, Int>()
    val result = mutableListOf<Int>()

    nums.forEach { item ->
        if (mutableMap.containsKey(item)) {
            val counting = mutableMap[item]!! + 1
            mutableMap[item] = counting
        } else {
            mutableMap[item] = 1
        }
    }

//    val sortedMap = mutableMap.toSortedMap(compareBy{ it })
//
//    var i = 0
//    for (item in 0 until k){
//        result.add(sortedMap.keys[i])
//        i++
//    }

    return result
}