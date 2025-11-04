package week1

fun main() {
    var pet = "Buddy"   // mutable
    println(pet)
    pet = "Max"
    println("Updated: $pet")
    println("First char: ${pet[0]}")
    println("Lowercase: ${pet.lowercase()}")

    val owner = "Lily"  // immutable
    println("Owner: $owner")
}