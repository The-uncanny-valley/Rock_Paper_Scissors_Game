fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
}

fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam : Array<String>) : String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        println("Please enter one of the following:")
        for (item in optionsParam) println(" $item")
        println(".")

        val userInput = readln()
        if (userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }

        if (!isValidChoice) println("You must enter a valid choice")
    }
    return userChoice
}