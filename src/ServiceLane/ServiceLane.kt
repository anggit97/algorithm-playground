package ServiceLane

class ServiceLane {

    fun serviceLane(n: Int, cases: Array<Array<Int>>): Array<Int> {
        val input = cases[0]
        val sizeArr = cases.slice(IntRange(1, cases.size-1)).size
        val result = IntArray(sizeArr)


        for (index in 1 until cases.size) {
            val range = IntRange(cases[index][0], cases[index][1])
            val arrSlice = input.slice(range)
            val min = arrSlice.min()
            result[index - 1] = min!!
        }

        return result.toTypedArray()
    }
}