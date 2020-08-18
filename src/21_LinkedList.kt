import java.util.*

fun main(){

    //LinkedList

    //LinkedList tidak menambah elemen banyak seperti arrayList,
    //tetapi dalam pencarian data, LinkedList tidak bagus, karena dia mencari satu persatu

    var listOfPets = LinkedList<String>()

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
}