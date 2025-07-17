
//kotlin program to check leap year
import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)

    print("Enter a year: ")
    var year = scanner.nextInt()

    // Check if it's a leap year
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        println("$year is a leap year.")
    } else {
        println("$year is not a leap year.")
    }
}
