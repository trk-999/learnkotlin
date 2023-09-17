fun main() {
    println(birthdayGreeting("Ben", 2))
    println("\n")
    println(birthdayGreeting("Jack", 5))
}

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}
