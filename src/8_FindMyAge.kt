import java.util.*

fun main(){
    print("Enter year or Birth : ")
    val yearOfBirth = readLine()!!.toInt()
    val yearInDevice = Calendar.getInstance().get(Calendar.YEAR).toInt()
    val age = yearInDevice - yearOfBirth

    println("You are $age Years Old")

}