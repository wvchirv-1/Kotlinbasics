fun main() {
    //Standard library functions/Built-in functions
    var result = Math.sqrt(81.0)
    println("The result is $result")

    var number = Math.round(67.8)
    println(number)
    school()
    divide()
    student("Joe",56,"male")
    student("Jane",27,"female")
    student("Ann",30,"female")

}
//user-defined functions
fun school(){
    println("eMobilis")

}

fun divide(){
    var num1 = 56
    var num2 = 7
    println(num1/num2)

}

//parameter and argument
fun student(name:String, age:Int, gender:String){
    println("$name $age $gender")
}