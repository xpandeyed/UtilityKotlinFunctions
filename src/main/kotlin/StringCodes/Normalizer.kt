package StringCodes

import java.util.*


fun normalize(string: String): String{
    //remove leading and trailing spaces
    var result = string.trim()

    //Keep first word only
    //result = result.substringBefore(' ')

    //turn the first character capital
    result = result.replaceFirst(result[0], result[0].uppercaseChar())

    //convert whole string to uppercase
    result = result.uppercase(Locale.getDefault())

    //split
    println("Lal Bihari Pandey".split(' '))
    println("".split(' '))

    return result
}
fun checkString(){
    println("".isBlank())
}