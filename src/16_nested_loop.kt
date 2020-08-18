fun main(){
    for(userId in 1..5){
        println("userId ($userId) ~ Enter your name: ")
        val name = readLine()!!.toString()
        println("Your addreess: ")
        val address = readLine()!!.toString()

        var petName:String? = ""
        println("How many pets do You have?")
        val petCount = readLine()!!.toInt()
        for(petId in 1..petCount){
            println("Enter Pet $petId")
            petName += readLine()!!.toString()
        }

        println("=====User Info=====")
        println("user ID $userId")
        println("name      : $name")
        println("address   : $address")
        println("pet count : $petCount")
        println("pet       : $petName")

        if(petName!!.contains("cat")){
            println("we have program for your cat")
        }
    }
}