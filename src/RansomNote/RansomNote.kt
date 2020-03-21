package RansomNote

class RansomNote {

    fun checkMagazine(magazine: Array<String>, note: Array<String>): String {
        val magazieDicMap = mutableMapOf<String, Int>()

        var i = 0
        magazine.forEach {
            if (magazieDicMap.containsKey(it)) {
                magazieDicMap[it] = magazieDicMap[it]!! + 1
            } else {
                magazieDicMap[it] = 1
            }
            i++
        }

        for (item in note) {
            if (magazieDicMap.containsKey(item)) {
                magazieDicMap[item] = magazieDicMap[item]!! - 1
                if (magazieDicMap[item] == 0) magazieDicMap.remove(item)
            } else {
                return "No"
            }
        }

        return "Yes"
    }
}