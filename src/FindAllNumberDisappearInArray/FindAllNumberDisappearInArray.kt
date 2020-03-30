package FindAllNumberDisappearInArray

class FindAllNumberDisappearInArray {

    fun findDisappearedNumbers(nums: IntArray): List<Int> {
//        nums.sort()
//        val mutableMap = mutableMapOf<Int, Int>()
//        val result = mutableListOf<Int>()
//
//        for (item in nums){
//            if (mutableMap.containsKey(item)){
//                mutableMap[item] = mutableMap[item]!! + 1
//            }else{
//                mutableMap[item] = 1
//            }
//        }
//
//        var index = 1
//        for (item in mutableMap){
//            if (item.key != index) result.add(index)
//            index++
//        }
//
//        return result

        nums.sort()
        val result = mutableListOf<Int>()


        // 4, 3, 2, 7, 8, 2, 3, 1
        // 1, 2, 2, 3, 3, 4, 7, 8
        var index = 1
        for (item in nums){
            if (item != index) {
                if (item == nums[index-1]){
                    index--
                    continue
                }

                result.add(index)
            }
            index++
        }

        return result
    }
}