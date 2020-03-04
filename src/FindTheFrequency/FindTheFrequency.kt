package FindTheFrequency

fun main() {
    val testCaseArr = mutableListOf(1, 3, 4, 10, 2, 3, 4, 1, 2, 3, 43, 3, 3, 3).also { it.sort() }
    val x = 3

    println("Frequency Number : $x")
    println(findFrequencyX(testCaseArr).toString())
}

fun findFrequencyX(testCaseArr: MutableList<Int>): Int {
    val mutableMap = mutableMapOf<Int, Int>()
    testCaseArr.forEach {
        if (mutableMap.containsKey(it)) {
            mutableMap[it] = mutableMap[it]!! + 1
        } else {
            mutableMap[it] = 1
        }
    }
    return mutableMap.values.max()!!
}


