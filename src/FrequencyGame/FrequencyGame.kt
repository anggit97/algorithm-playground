package FrequencyGame

fun main() {
    val testCaseArr = mutableListOf(2, 2, 5, 50, 1).also { it.sortDescending() }

    println("Minimum Number with lowest frequency : ")
    println(findMinimumNumberWithLowestFrequency(testCaseArr).toString())
}

fun findMinimumNumberWithLowestFrequency(testCaseArr: MutableList<Int>): Int {
    val mutableMap = mutableMapOf<Int, Int>()
    testCaseArr.forEach {
        if (mutableMap.containsKey(it)) {
            mutableMap[it] = mutableMap[it]!! + 1
        } else {
            mutableMap[it] = 1
        }
    }

    var smallestFrequency = mutableMap.entries.first().value
    var smallestNumber = mutableMap.entries.first().key

    mutableMap.forEach {
        if (smallestFrequency > it.value) {
            smallestFrequency = it.value
            smallestNumber = it.key
        } else {
            return it.key
        }
    }
    return smallestNumber
}
