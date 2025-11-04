package week1

fun main() {
    var sum = 0
    var n = 2
    println("Adding even numbers until sum >= 20:")
    while (sum < 20) {
        sum += n
        println("Added $n, sum = $sum")
        n += 2
    }
    println("Final sum: $sum")
}