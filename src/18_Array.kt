import java.util.logging.Logger

fun main(){

    //Array
    //Bersifat fixed, maka membutuhkan Max Size
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

    //karena array bersifat fixed, maka tidak bisa menambah ke array
    var students = arrayOf("dery", "bwambwang", "dono", 25, 26)
    println(students);
    println(students.toList());
}