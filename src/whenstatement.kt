import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    println("Enter the first number:")
    val num1 = input.nextDouble()

    println("Enter the second number:")
    val num2 = input.nextDouble()

    println("Choose an operation: +, -, *, /")
    val operator = input.next()[0]

    val result = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> {
            if (num2 != 0.0) num1 / num2
            else {
                println("Cannot divide by zero.")
                return
            }
        }
        else -> {
            println("Incorrect operator.")
            return
        }
    }

    println("Result: $num1 $operator $num2 = $result")
}

