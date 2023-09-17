fun main() {
    println(birthdayGreeting("Ben"))
    println("\n")
    println(birthdayGreeting("Jack"))
}

fun birthdayGreeting(name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}
