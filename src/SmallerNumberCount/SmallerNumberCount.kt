package SmallerNumberCount

class SmallerNumberCount {

    /**
     * Time Complexity : O(n2)
     * Splace Complexity : O(n)
     */
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val smallerNumberResultArr = IntArray(nums.size)

        for ((index, item) in nums.withIndex()) {
            var count = 0
            for (index2 in 0 until nums.size) {
                if (nums[index2] < item) count++
            }
            smallerNumberResultArr[index] = count
        }

        return smallerNumberResultArr
    }
}