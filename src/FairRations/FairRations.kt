package FairRations

class FairRations {

    fun fairRations(B: Array<Int>): Int {
        val sum = B.sum()
        val tempArr = B.toMutableList()

        var count = 0
        if (sum.rem(2) == 1) {
            return -1
        } else {
            for ((index, item) in tempArr.withIndex()) {
                if (item.rem(2) != 0) {
                    tempArr[index] = item + 1
                    tempArr[index + 1] = tempArr[index + 1] + 1
                    count += 2
                }
            }
        }
        return count
    }
}