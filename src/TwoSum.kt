fun main(){
    val input = intArrayOf(31, 2, 5, 7)
    val number = twoSum(input, 38)

    var i = 0
    while (i < number.size){
        println(number[i])
        i++
    }
}

//Time Complexity : O(n2), Hmm let find better solution from this barbaric
//Space Complexity : O(1)
//Runtime: 292 ms, faster than 18.84% of
// Kotlin online submissions for Two Sum.
fun twoSum(nums: IntArray, target: Int) : IntArray{
    val results = intArrayOf().toMutableList()
    var i = 0
    var x = nums.toMutableList()
    for (i in x){
        println(i)
    }
    while (i < nums.size){
        var j = i + 1
        var temp: Int
        while (j < nums.size){
            temp = nums[i] + nums[j]
            if (temp == target){
                results.add(i)
                results.add(j)
                break
            }
            j++
        }
        i++
    }
    return results.toIntArray()
}

//Time Complexity : O(n)
//Runtime: 160 ms, faster than 89.21% of
// Kotlin online submissions for Two Sum.
//fun twoSumHashTable(nums: IntArray, target: Int): IntArray {
//    var map = hashMapOf<Int, Int>()
//
//    var i = 0
//    while(i < nums.size){
//        map.put(nums[i], i)
//        i++
//    }
//
//    i = 0
//    while(i < nums.size){
//        val complement = target - nums[i]
//        if(map.containsKey(complement) && map.get(complement) != i){
//            return intArrayOf(i, map.get(complement)!!)
//        }
//        i++
//    }
//
//    throw IllegalArgumentException("No two sum values")
//}