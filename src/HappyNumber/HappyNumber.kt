package HappyNumber

class HappyNumber {

    fun isHappy(n: Int): Boolean {
        val inLoop = mutableSetOf<Int>()
        var squareSum: Int
        var remain: Int
        var tempN = n
        while (inLoop.add(tempN)) {
            squareSum = 0
            while (tempN > 0) {
                remain = tempN % 10
                squareSum += remain * remain
                tempN /= 10
            }
            if (squareSum == 1)
                return true
            else
                tempN = squareSum

        }
        return false
    }
}