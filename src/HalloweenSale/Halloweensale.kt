package HalloweenSale

class Halloweensale {

    fun howManyGames(p: Int, d: Int, m: Int, s: Int): Int {
        // Return the number of games you can buy
        var remainingMoney = s
        var currentPrice = p
        var totalBuying = 0

        while (remainingMoney > m) {
            remainingMoney -= currentPrice
            currentPrice -= d
            if (currentPrice <= m) currentPrice = m
            totalBuying++
        }

        return totalBuying
    }
}