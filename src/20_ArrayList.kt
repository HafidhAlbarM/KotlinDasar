fun main(){

    //Array
    println("Pets App")
    var listOfPets = ArrayList<String>()

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

    if(listOfPets.contains("kucing")){
        println("Kucing Anda mendapatkan penawaran khusus")
    }
}