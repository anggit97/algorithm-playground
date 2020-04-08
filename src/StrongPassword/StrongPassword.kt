package StrongPassword

class StrongPassword {

    fun minimumNumber(n: Int, password: String): Int {
        // Return the minimum number of characters to make the password strong
        //Ab1
        val number = 1.rangeTo(9).toMutableList()
        val lowerCaseChar = 'a'.rangeTo('z').toMutableList()
        val upperCaseChar = 'A'.rangeTo('Z').toMutableList()
        val specialChar = "!@#\$%^&*()-+"
        val lengthOfPasswordFullfilled = n >= 6

        var substract = 6 - n

        for (char in number){
//            if (number.contains(char))
        }

        return 0
    }
}