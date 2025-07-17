
//kotlin program to generate a multiplication table
import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)

    print("Enter a number to generate its multiplication table: ")
    var number = scanner.nextInt()

    println("Multiplication Table of $number:")
    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }
}
