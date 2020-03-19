package ContainsDuplicate

class ContainsDuplucate {

    fun containsDuplicate(nums: IntArray): Boolean {
        val sortedNums = nums.sorted()

        var prevValue = sortedNums[0]
        val idx = 1

        for (index in idx until sortedNums.size) {
            if (prevValue == sortedNums[index]) return true
            prevValue = sortedNums[index]
        }
        return false
    }
}