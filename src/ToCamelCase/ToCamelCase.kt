package ToCamelCase


class ToCamelCase {

    fun toCamelCase(str: String): String {
        var cnt = 0
        val n = str.length
        val ch = str.toCharArray()
        var resInd = 0

        for (index in 0 until n) {
            if (ch[index] == ' ' || ch[index] == '_' || ch[index] == '-') {
                cnt++
                ch[index + 1] = ch[index + 1].toUpperCase()
                continue
            } else {
                ch[resInd++] = ch[index]
            }
        }
        return ch.joinToString("").substring(0, n - cnt)
    }
}