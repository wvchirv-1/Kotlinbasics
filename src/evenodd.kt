import java.util.Scanner

fun main() {

    var read = Scanner(System.`in`)

    println("Enter a number")
    var number = read.nextInt()
    if (number %2== 0){
        println("$number is even")
    }
    else{
        println("$number is odd")
    }
}