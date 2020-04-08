package StrongPassword

class StrongPassword {

    fun minimumNumber(n: Int, password: String): Int {
        // Return the minimum number of characters to make the password strong
        //Ab1
        val number = '1'.rangeTo('9').toMutableList()
        val lowerCaseChar = 'a'.rangeTo('z').toMutableList()
        val upperCaseChar = 'A'.rangeTo('Z').toMutableList()
        val specialChar = "!@#\$%^&*()-+"

        val mutableMap = mutableMapOf<String, String>().also {
            it["number"] = "number"
            it["lower"] = "lower"
            it["upper"] = "upper"
            it["special"] = "special"
        }

        for (char in password) {
            if (number.contains(char) && mutableMap.containsKey("number")) {
                mutableMap.remove("number")
            }

            if (lowerCaseChar.contains(char) && mutableMap.containsKey("lower")) {
                mutableMap.remove("lower")
            }

            if (upperCaseChar.contains(char) && mutableMap.containsKey("upper")) {
                mutableMap.remove("upper")
            }

            if (specialChar.contains(char) && mutableMap.containsKey("special")) {
                mutableMap.remove("special")
            }
        }

        var countMutableMap = mutableMap.size

        if ((countMutableMap + password.length) < 6){
            countMutableMap += (6 - (countMutableMap + password.length))
        }

        return countMutableMap
    }
}