/*
 When you include the parameter name when you call a function, 
 it's called a named argument. 
 Try using a named argument with the birthdayGreeting() function.
 */ 

fun main() {
    println(birthdayGreeting(name = "Ren", age = 12))
    println("\n")
    println(birthdayGreeting(name = "Rex", age = 5))
    println("\n")
    //Using age as a parameter first before name.
    println(birthdayGreeting(age = 7, name = "Fin"))
}

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}
