package TwoString

class TwoString {

    fun twoStrings(s1: String, s2: String): String {
        val comparatorDic = mutableMapOf<Char, Char>()

        val iterator = if (s1.length > s2.length) s2 else s1
        val comparator = if (s1.length > s2.length) s1 else s2

        comparator.forEach {
            comparatorDic[it] = it
        }

        iterator.forEach {
            if (comparatorDic.containsKey(it)) return "YES"
        }

        return "NO"
    }
}