package sorting

fun main(){
    val unsortedArray = mutableListOf(
        21,
        33,
        32,
        57,
        10,
        22
    )

    println("Sorting Array : ")
    println(bubbleSorting(unsortedArray))
}

fun bubbleSorting(unsortedArray: MutableList<Int>) : MutableList<Int> {
    for (index in 0 until unsortedArray.size){
        for (index2 in 0 until unsortedArray.size-index-1){
            if (unsortedArray[index2] > unsortedArray[index2+1]){
                val temp = unsortedArray[index2]
                unsortedArray[index2] = unsortedArray[index2+1]
                unsortedArray[index2+1] = temp
            }
        }
    }
    return unsortedArray
}

