package sorting

/**
 * Insertion Sort => sorting values by finding the minimum value from list, and put it to begining of loop
 * Time Complexity = O(n2)
 * Space Complexity = O(1)
 *
 * advantages :
 * The good thing about selection sort is it never makes more than O(n) swaps
 * and can be useful when memory write is a costly operation.
 *
 */
fun main() {
    val unsortedArray = mutableListOf(
        21,
        33,
        32,
        57,
        10,
        22
    )

    println("Sorting Array : ")
    println(sortingInsertion(unsortedArray).toString())
}

fun sortingInsertion(unsortedArray: MutableList<Int>): MutableList<Int>? {
    for (index in 0 until unsortedArray.size){
        val idx = index + 1
        var minVal = unsortedArray[index]
        var minValIndex = index
        for (index2 in idx until unsortedArray.size){
          if (unsortedArray[index2] < minVal){
              minVal = unsortedArray[index2]
              minValIndex = index2
          }
        }
        val temp = unsortedArray[index]
        unsortedArray[index] = minVal
        unsortedArray[minValIndex] = temp
    }
    return unsortedArray
}

