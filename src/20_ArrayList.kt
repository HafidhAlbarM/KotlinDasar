fun main(){

    //ArrayList

//    Cara Java
//    var listOfPets = ArrayList<String>()

//    Cara Kotlin
    var listOfPets = arrayListOf<String>()

    println("Pets App")
    do{
        println("Enter Pet")
        var petName:String = readLine()!!.toString()
        if(petName != "quit"){
            listOfPets.add(petName)
        }
    }while(petName != "quit")

    //pake index
    for(i in 0 until listOfPets.size){
        println("Pet ${listOfPets[i]}")
    }

    //lebih aman, pake objek
    for(pet in listOfPets){
        println("Pet $pet")
    }

    if(listOfPets.contains("cat")){
        println("We have special offer for your cat")
    }



//    var data = arrayListOf<String>("Dono","Kasino","Indro")
//    data.add("Komeng")
//    println(data.toList())
}