package CutTheStick

class CutTheStick {

    fun cutTheSticks(arr: Array<Int>): Array<Int> {
        val result = mutableListOf<Int>()
        var arrTemp = arr.toMutableList()

        result.add(arrTemp.count())

        while (arrTemp.isNotEmpty()) {

            val minVal = arrTemp.min()

            for ((index, item) in arrTemp.withIndex()) {
                arrTemp[index] = item - minVal!!
            }

            val x = arrTemp.filter { it > 0 }

            arrTemp = x.toMutableList()

            result.add(arrTemp.count())
        }

        return result.filter { it > 0 }.toTypedArray()
    }
}