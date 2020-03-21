package MinimumSwap

class MinimumSwap {

    fun minimumSwaps(arr: Array<Int>): Int {
        var counting = 0
        for (i in 0 until arr.size) {
            while (arr[i] != (i + 1)) {
                val temp = arr[i]
                arr[i] = arr[temp-1]
                arr[temp-1] = temp
                counting++
            }
        }
        return counting
    }
}