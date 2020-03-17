package MissingNumber

class MissingNumber {

    fun missingNumber(nums: IntArray): Int {
        nums.sort()

        // Ensure that n is at the last index
        if (nums[nums.size-1] != nums.size) return nums.size

        // Ensure that 0 is at the first index
        else if (nums[0] != 0) return 0

        for ((index, item) in nums.withIndex()) {
            if (index != item) return index
        }
        return -1
    }
}