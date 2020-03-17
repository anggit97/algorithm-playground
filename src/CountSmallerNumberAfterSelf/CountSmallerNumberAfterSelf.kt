package CountSmallerNumberAfterSelf

class CountSmallerNumberAfterSelf {

    fun countSmaller(nums: IntArray): List<Int> {
        val result = mutableListOf<Int>()

        for ((index, item) in nums.withIndex()){
            val idx = index+1
            var countSmallerItem = 0
            for (index2 in idx until nums.size){
                if (nums[index2] < item) countSmallerItem++
            }
            result.add(countSmallerItem)
        }

        return result
    }
}