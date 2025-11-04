package week1

fun main() {
    // Immutable map: fruit -> color
    val fruitColors = mapOf(
        "apple" to "red",
        "banana" to "yellow",
        "grape" to "purple"
    )

    println("Number of fruits: ${fruitColors.size}")
    println("All colors: ${fruitColors.values}")
    println("Color of banana: ${fruitColors["banana"]}")


    // 2. Mutable Map
    val studentMarks = mutableMapOf<String, Int>(
        "Ram" to 50,
        "John" to 65
    )
    studentMarks["Carl"] = 60 // studentMarks.put("Carl", 60)
    println("Keys : ${studentMarks.size}")
    println("Values : ${studentMarks.values}")
    println(studentMarks["Carl"])
}