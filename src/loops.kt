fun main() {

    //while loop

    var count  = 45
    while (count <=50){
        println("Number is $count")
        count++
    }
    //program2
    var number = 10
    while (number >=5){
        println(number)
        number--
    }

    //Do while loop
    var x = 1
    do {
        println("Number is $x")
        x++
    }
        while (x <= 5)


    //For loop
    for (num in 30..40){
        println("Number is $num")
    }

    for (let in 'a'..'d'){
        println("Letter is $let")
    }

    //brake and continue loops


   for (num in 0..10){
       if (num==5)
       break
       println(num)
   }

    for (number in 0..10)
    if (number==2){
        continue
        println(number)
    }




}