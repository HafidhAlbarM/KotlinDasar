fun main(){
// ArrayList
// ArrayList (List) bersifat dinamis, dapat menambah itemnya
// Array hanya menyimpan data dengan tipe yang sama,

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



    var data = arrayListOf("Dono","Kasino","Indro",2)
    data.add("Komeng")
    println(data)

    var dataAngka = arrayListOf(2,4,6,8,"Dono")
    dataAngka.add(12)
    println(dataAngka)
}