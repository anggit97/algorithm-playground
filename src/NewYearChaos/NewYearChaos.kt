package NewYearChaos

import kotlin.math.max

class NewYearChaos {

    fun minimumBribes(q: Array<Int>): Int {
        var countBribe = 0
        var i = q.size - 1
        while (i >= 0) {
            if (q[i] - (i + 1) > 2) {
                return -1
            }

            var j = max(0, q[i] - 2)
            while (j < i) {
                if (q[j] > q[i]) countBribe++
                j++
            }

            i--
        }
        return countBribe
    }
}