package week1

fun main() {
    // Immutable list
    val fruits = listOf("apple", "banana", "orange")
    println("Fruits (immutable):")
    for (fruit in fruits) {
        println(fruit)
    }
    println("Second fruit is ${fruits[1]}")


    //  Mutable List
    val nums = mutableListOf<String>("one", "two", "three")
    // Possible here
    nums[0] = "zero"
    nums.add("four")
    println("Mutable List")
    for (i in nums.indices) {
        println(i)
    }
}