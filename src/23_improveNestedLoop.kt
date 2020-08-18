import java.util.*
import kotlin.collections.HashMap

fun main() {
    var listOfUsers = HashMap<String, LinkedList<String>>()

    while (true) {
        println("Enter your name or quit: ")
        val name = readLine()!!.toString()
        if(name == "quit"){
            break
        }

        println("Your addreess: ")
        val address = readLine()!!.toString()

        var listOfUserPets = LinkedList<String>()
        do {
            println("Enter Pet name or type next:")
            val petName = readLine()!!.toString()
            if (petName != "next") {
                listOfUserPets.add(petName)
            }
        } while (petName != "next")

        listOfUsers["$name:$address"] = listOfUserPets
    }

    for(key in listOfUsers.keys){
        println("=====User Info=====")
        println("name and address : $key")
        var listOfPets = listOfUsers[key]!!
        for(petName in listOfPets){
            println("pet Name: $petName")
        }

        if(listOfPets.contains("cat")){
            println("We have special offer for your cat")
        }
    }
}


