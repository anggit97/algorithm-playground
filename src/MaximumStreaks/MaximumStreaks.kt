package MaximumStreaks

import kotlin.math.max

class MaximumStreaks {

    fun getMaxStreaks(toss: Array<String>): Array<Int> {
        var head = 0
        var maxhead = 0
        var tail = 0
        var maxtail = 0

        for (tos in toss) {
            if (tos == "Heads") {
                head += 1
                maxhead = max(maxhead, head)
            } else {
                head = 0
            }

            if (tos == "Tails") {
                tail += 1
                maxtail = max(maxtail, tail)
            } else {
                tail = 0
            }
        }

        return arrayOf(maxhead, maxtail)
    }
}