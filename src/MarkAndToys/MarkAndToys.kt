package MarkAndToys

class MarkAndToys {

    fun maximumToys(prices: Array<Int>, k: Int): Int {
        prices.sort()
        var remainK = k
        var i = 0
        while (remainK > 0) {
            remainK -= prices[i]
            i++
        }
        return i - 1
    }
}