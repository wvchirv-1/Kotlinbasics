
//kotlin program to check whether a number is prime or not
import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)

    print("Enter a number: ")
    var number = scanner.nextInt()

    var isPrime = true

    if (number <= 1) {
        isPrime = false
    } else {
        for (i in 2..number / 2) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }
    }

    if (isPrime) {
        println("$number is a prime number.")
    } else {
        println("$number is not a prime number.")
    }
}
