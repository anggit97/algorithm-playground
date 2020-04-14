package MakeAnagram

class MakeAnagram {

    fun makeAnagram(a: String, b: String): Int {
        val aList = a.map { Pair(it, it) }.toMap().toMutableMap()
        val bList = b.map { Pair(it, it) }.toMap().toMutableMap()

        for (key in a) {
            if (bList.containsKey(key)) {
                bList.remove(key)
            }
        }

        for (key in b) {
            if (aList.containsKey(key)) {
                aList.remove(key)
            }
        }

        return bList.size + aList.size
    }
}