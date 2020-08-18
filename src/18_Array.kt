import java.util.logging.Logger

fun main(){

    //Array
    println("Pets App")
    println("Enter Number of Pets")
    val maxSize = readLine()!!.toInt()
    var listOfPets:Array<String> = Array(maxSize){""}
    for(i in 0 until maxSize){
        println("Enter Pet")
        listOfPets[i] = readLine()!!.toString()
    }

    println("Your pets are using array")
    for(i in 0 until maxSize){
        println("Pet $i: ${listOfPets[i]}")
    }
}