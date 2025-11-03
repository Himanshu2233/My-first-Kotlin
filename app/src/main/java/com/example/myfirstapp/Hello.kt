package com.example.myfirstapp

fun main() {
//     println("Hello, world!")
    // Hello, world!
    var name : String = "Himanshu" //mutable
    name = "sandhya"
    println("Hello"+" "+ name)


    //immutable
    val age: Int = 21
    println("Hello $name and age is $age")
    println("Hello ${name.uppercase()} and age is $age")

    var age1 = arrayOf(10,20,30)
    age1[2] = 69
    println(age1[2])

    //var age3 = ArrayList<Int>(10,20,30) // yaha error aauxa, yaha initialize garna mildaina
    var age4 = arrayListOf(10,20,30) // yaha milxa

    var a : Boolean = true
    var b : Char = 'H'
    var c : Byte = 12
    var d : Short = -321
    var e : Int = 123
    var f : Long = -3421412
    var g : Float = 5.432432F
    var h : Double = 12.234444
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)

    var i : Double = 123.23
    var j : Int = i.toInt()
    var k : Byte = j.toByte()
    println(i)
    println(j)
    println(k)

    var x : String = "Hello meow meow"
    var y : Int = x.length
    var z : Boolean = a.equals("Hello world")
    var username: String = "Softwarica"
    println(username.trim())
    println(x)
    println(y)
    println(x.isEmpty())
    println(x.lowercase())
    println(x.uppercase())
    println(z)
    print(x.plus("Hello boi!!!"))

    var age1 = arrayOf(10,20,30)
    age1[2] = 69
    println(age1[2])

    //var age3 = ArrayList<Int>(10,20,30) // yaha error aauxa, yaha initialize garna mildaina
//    var age4 = arrayListOf(10,20,30) // yaha milxa


    var rollNumbers = arrayOf(11, 22, 33, 44)
    println(rollNumbers.contentToString())

    println("The first roll number is " + rollNumbers[0])
    println("The second roll number is " + rollNumbers[1])
    println("The third roll number is " + rollNumbers[2])
    println("The fourth roll number is " + rollNumbers[3])

    println("")

    // String array
    var fruits = arrayOf("Apple", "Banana", "Mango")
    fruits[1] = "Orange"  // changing Banana → Orange
    println("The first fruit is " + fruits[0])
    println("The second fruit is " + fruits[1])
    println("The third fruit is " + fruits[2])

    println("Total fruits: " + fruits.size)


    var marks = arrayListOf(75, 80, 90)
    println(marks)

    println("The first mark is " + marks[0])
    println("The second mark is " + marks[1])
    println("The third mark is " + marks[2])

    // Add new element
    marks.add(95)
    println("After adding one mark: $marks")

    println("")

    // String ArrayList
    var cities = arrayListOf("Kathmandu", "Pokhara", "Biratnagar")
    println(cities)

    // Modify element
    cities[2] = "Lalitpur"
    println("Updated cities: $cities")

    // Add new city
    cities.add("Dharan")
    println("Cities after adding one: $cities")

    println("Total cities: " + cities.size)

    //Set
    val fruit = setOf("Apple", "Banana", "Mango", "Apple") // duplicates ignored
    println(fruit)
    println("Total fruits: " + fruit.size)

    //List
    val students = mutableListOf("Aayush", "Bikash", "Sujal")
    println(students)
    students.add("Nikita")
    students[1] = "Bishal"
    println("Updated list: " + students)
    println("The second student is " + students[1])
    println("Total students: " + students.size)

    //Map
    val countryCodes = mapOf("NP" to "Nepal", "IN" to "India", "US" to "United States")
    println(countryCodes)
    println("Country for key 'NP' is " + countryCodes["NP"])
    println("Total countries: " + countryCodes.size)
}