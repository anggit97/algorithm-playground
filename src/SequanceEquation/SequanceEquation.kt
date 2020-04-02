package SequanceEquation

class SequanceEquation {

    fun permutationEquation(p: Array<Int>): Array<Int> {
        val tempP = p

        val sortedP = p.sortedArray()

        val result = IntArray(p.size)

        for (x in 1..sortedP.size){
            val index = tempP.indexOf(x)
            val y = tempP.indexOf(index + 1) + 1
            result[x-1] = y
        }

        return result.toTypedArray()
    }
}