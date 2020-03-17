package CoinOfChange

class CoinOfChange {

    fun coinChangeIteration(coins: IntArray, amount: Int) : Int{
        if (amount < 1) return 0
        val dp = IntArray(amount + 1)
        var sum = 0

        while (++sum <= amount) {
            var min = -1
            for (coin in coins) {
                if (sum >= coin && dp[sum - coin] != -1) {
                    val temp = dp[sum - coin] + 1
                    min = if (min < 0) temp else if (temp < min) temp else min
                }
            }
            dp[sum] = min
        }
        return dp[amount]
    }

    fun coinChangeFailSolution(coins: IntArray, amount: Int): Int {
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
                println(remaningExchange)
                break
            }
        }
        println(mutableList)
        if (remaningExchange < 0) {
            return -1
        }

        return sumOfCoinExchange
    }
}