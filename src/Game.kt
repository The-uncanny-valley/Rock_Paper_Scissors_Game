fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam : Array<String>) : String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        println("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
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

fun printResult(userChoice : String, gameChoice : String) {
    val result: String

    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")) result = "You win!"
    else result = "You lose!"

    println("You chose $userChoice. I chose $gameChoice. $result")
}