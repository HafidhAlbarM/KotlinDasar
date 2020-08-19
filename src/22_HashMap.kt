fun main(){
//    hasMap itu array Key Value


//    Cara Java
//    var listOfUsers = HashMap<Int, String>()
//    Cara Kotlin
    var listOfUsers = hashMapOf<Int, String>()
    listOfUsers[123]= "Hafidh"
    listOfUsers[124]= "Albar"
    listOfUsers[125]= "Muhammad"

    println("Cetak user dengan Id 123: ${listOfUsers[123]}")

    println(listOfUsers)//{123=Hafidh, 124=Albar, 125=Muhammad}
    println(listOfUsers.keys)//[123, 124, 125]
    println(listOfUsers.values)//[Hafidh, Albar, Muhammad]

    for(key in listOfUsers.keys){
       println("$key: ${listOfUsers[key]}")
    }

    var data = hashMapOf<String, String>("BR001" to "Meja", "BR002" to "Kursi", "BR003" to "Lemari")
    println(data)
    println(data["BR002"])
}