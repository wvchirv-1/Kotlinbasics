fun main() {
    var text = "Hello world"
    var firstname = "John"
    var lastname = "Njuguna"

    println(text)

    println(text[1])

    //string concatenation
    println(firstname +" "+ lastname)

    //modifying a string
    println(text.uppercase())
    println(firstname.lowercase())


    //string interpolation
    println("My fullname is $firstname $lastname")
}