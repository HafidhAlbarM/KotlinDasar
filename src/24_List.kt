//mutable: bisa update, bisa nambah
//im-mutable: gabisa update, gabisa nambah

fun main(){
    //list

    println("=========Im-Mutable ListOf==========")
    val listImmutable = listOf("hafidh","albar",27,1998)
    //gabisa, karena im-mutable
    //listMutable.add("muhammad")
    for(nama in listImmutable){
        println(nama)
    }


    println("==========Mutable listOf==========")
    var listMutable = mutableListOf("hafidh","albar",27,1998)
    listMutable.add("muhammad")
    for(nama in listMutable){
        println(nama)
    }

    println("==========Im-Mutable mapOf==========")
    val listOfUsersImmutable = mapOf(1 to "Hafidh", 2 to "Albar")
//    gabisa, karena im-mutable
//    listOfUsersImmutable[3] = "Muhammad"
    for(i in listOfUsersImmutable.keys){
        println("key ${i}, value ${listOfUsersImmutable[i]}")
    }

    println("==========Mutable mapOf==========")
    var listOfUsersMutable = mutableMapOf(1 to "Hafidh", 2 to "Albar")
    listOfUsersMutable[3] = "Muhammad"
    for(i in listOfUsersMutable.keys){
        println("key ${i}, value ${listOfUsersMutable[i]}")
    }

}