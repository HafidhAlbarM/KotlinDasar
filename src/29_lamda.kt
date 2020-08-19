val sum = {number1:Int, number2:Int ->
    number1+number2
}

fun main(){
    val addNumber = sum(3,4)
    println("addNumber: $addNumber")

    println("List of Number")
    val listOfNumber = listOf(10,15,11,12,13)

    //for way
    for(number in listOfNumber){
        println("number $number")
    }

    //lamda way
    println("List of Number using lamda")
    listOfNumber.forEach{number->
        println("number $number")
    }


}