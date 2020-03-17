package MoveZero

class MoveZero {

    fun moveZeroes(nums: IntArray): IntArray {
        var intPos = 0
        for (num in nums) {
            if (num != 0) nums[intPos++] = num
        }

        while (intPos < nums.size) {
            nums[intPos] = 0
            intPos++
        }
        return nums
    }
}