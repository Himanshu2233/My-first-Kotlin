package com.example.myfirstapp.week1

fun main() {
    val desserts = arrayOf("cookie", "brownie", "cheesecake", "cupcake", "pie")
    println(desserts[2])
    desserts[2] = "tiramisu"
    println(desserts[2])
    println(desserts.toList())

    // ArrayList (MutableList)
    val drinks = ArrayList<String>()
    drinks.add("water")
    drinks.add(1, "juice")
    drinks.add("soda")
    drinks[2] = "tea"
    println(drinks)

    // arrayListOf
    val vehicles = arrayListOf("car", "bike", "scooter", "truck")
    vehicles.add(4, "bus")
    println(vehicles)
}

