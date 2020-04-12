package HackerrankInString

class HackrankInString {

    //hereiamstackerrank
    fun hackerrankInString(s: String): String {
        val constraint = "hackerrank"
        val inputDic = constraint.toMutableList()

        for (char in s) {
            if (inputDic.isNullOrEmpty()) break

            if (char == inputDic[0]) {
                inputDic.removeAt(0)
            }
        }

        return if (inputDic.isNullOrEmpty()) "YES" else "NO"
    }
}