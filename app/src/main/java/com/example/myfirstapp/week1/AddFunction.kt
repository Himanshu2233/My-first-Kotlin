package week1

fun main() {
    val x = 5
    val y = 7
    println("Sum of $x and $y is ${add(x, y)}")
}

fun add(a: Int, b: Int): Int {
    return a + b
}