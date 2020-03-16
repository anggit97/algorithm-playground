package CoinOfChange

fun main() {
    val testCaseArr = intArrayOf(186, 419, 83, 408)
    val amount = 6249
    println("fewest number of coins is : ")
    println(coinChange(testCaseArr, amount))
}

fun coinChange(coins: IntArray, amount: Int): Int {
    var remaningExchange = amount
    val mutableList = mutableListOf<Int>()
    var sumOfCoinExchange = 0
    val sortedArray = coins.toMutableList().sortedDescending()
    while (remaningExchange > 0) {
        for ((index, item) in sortedArray.withIndex()) {
            val lastItem = index >= sortedArray.size - 1
            if ((lastItem && sumOfCoinExchange < 0) || (lastItem && item > remaningExchange)) {
                remaningExchange = -1
                break
            }

            if (item > remaningExchange) continue

            remaningExchange -= item
            mutableList.add(item)
            sumOfCoinExchange++
            break
        }
    }
    println(mutableList)

    if (remaningExchange < 0) {
        return -1
    }

    return sumOfCoinExchange
}