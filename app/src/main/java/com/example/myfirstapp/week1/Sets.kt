package week1

fun main() {
    // 1. Immutable set
   val colors = setOf("red", "blue", "green", "blue")
    println("Colors set: $colors")
    println("Contains blue: ${"blue" in colors}")

    // 2. Mutable set
    val oddNumbers = mutableSetOf<Int>(1, 3, 5, 7)
    oddNumbers.add(9)
    println(oddNumbers)

    println(setOf(1, 2, 3, 4) == setOf(4, 3, 2, 1))
}