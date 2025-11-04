package week1

fun main() {
    val number = 3
    var i = 1
    println("Multiplication table of $number (up to 5):")
    do {
        println("$number × $i = ${number * i}")
        i++
    } while (i <= 5)
}