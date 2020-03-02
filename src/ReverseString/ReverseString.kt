package ReverseString

fun main(){
    val inputs = CharArray(5)
    inputs[0] = 'h'
    inputs[1] = 'e'
    inputs[2] = 'l'
    inputs[3] = 'l'
    inputs[4] = 'o'

    reverseString(inputs)

    reverseRecursionString(inputs)
}

/**
 * Looping
 * Time Complexity = O(n)
 */
fun reverseString(s: CharArray){
    print("[")
    var i = s.size-1
    while(i >= 0){
        print("\"${s[i]}\"")
        if(i != 0) print(",")
        i--
    }
    print("]")
}

/**
 * Recursion
 * Time Complexity = O(n)
 */
fun reverseRecursionString(s: CharArray){
    print("[")
    helperRecursion(s, 0, s.size - 1)
}

fun helperRecursion(s: CharArray, left: Int, right: Int){
    var tempLeft = left
    var tempRight = right

    if (left >= right) {
        print("]")
        return
    }

    val temp = s[left]
    s[tempLeft++] = s[right]
    s[tempRight--] = temp

    helperRecursion(s, tempLeft, tempRight)
}


/**
 * Two Pointer
 * Time Complexity = O(n),
 * Space Complexity = O(1)
 */
fun reverseTwoPointer(s: CharArray){
    var left = 0
    var right = s.size-1
    while (left < right){
        val temp = s[left]
        s[left++] = s[right]
        s[right--] = temp
    }
}



