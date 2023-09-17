/*
 When you include the parameter name when you call a function, 
 it's called a named argument. 
 Try using a named argument with the birthdayGreeting() function.
 */ 

fun main() {
    println(birthdayGreeting(age = 5))
    println(birthdayGreeting(age = 12))
}

fun birthdayGreeting(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}
