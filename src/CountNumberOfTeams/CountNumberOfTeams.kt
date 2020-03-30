package CountNumberOfTeams

class CountNumberOfTeams {

    fun numTeams(rating: IntArray): Int {
        var res = 0
        for (i in 1 until rating.size - 1) {
            val less = IntArray(2)
            val greater = IntArray(2)
            for (j in 0 until rating.size) {
                if (rating[i] < rating[j])
                    ++less[if (j > i) 1 else 0]
                if (rating[i] > rating[j])
                    ++greater[if (j > i) 1 else 0]
            }
            res += less[0] * greater[1] + greater[0] * less[1]
        }
        return res
    }
}