package week1

fun main() {
    val number = 8

    if (number > 0) {
        println("The number $number is Positive")
    } else if (number < 0) {
        println("The number $number is Negative")
    } else {
        println("The number $number is Zero")
    }

    if (number % 2 == 0) {
        println("The number $number is Even")
    } else {
        println("The number $number is Odd")
    }
}