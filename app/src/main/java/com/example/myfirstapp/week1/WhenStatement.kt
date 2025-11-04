package week1

fun main() {
    val day = 2
    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        else -> "Unknown day"
    }
    println("Day $day -> $dayName")
}