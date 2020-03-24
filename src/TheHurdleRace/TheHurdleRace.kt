package TheHurdleRace

class TheHurdleRace {

    fun hurdleRace(k: Int, height: Array<Int>): Int {
        val maxNumberInArray = height.max()
        val diffrence = maxNumberInArray!! - k
        var posionNeeded = 0
        if (diffrence > 0) posionNeeded = diffrence
        return posionNeeded
    }
}