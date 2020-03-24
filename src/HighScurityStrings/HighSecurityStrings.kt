package HighScurityStrings

class HighSecurityStrings {

    fun getStrength(password: String, weight_a: Int): Int {
        // Complete the function
        val wordWeightDic = mutableMapOf<Char, Int>()

        var weight = weight_a
        for (c in 'a'..'z') {
            if (weight == 26) weight = 0

            wordWeightDic[c] = weight
            weight++
        }

        var sumWeight = 0
        password.forEach {
            sumWeight += wordWeightDic[it]!!
        }

        return sumWeight
    }
}