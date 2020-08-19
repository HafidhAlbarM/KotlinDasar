//array hanya menyimpan data dengan tipe yang sama,
//sedangkan list dapat menyimpan banyak data dengan tipe yang berbeda-beda.

//mutable: bisa update, bisa nambah
//im-mutable: gabisa update, gabisa nambah

fun main(){
    //list

    //im-mutable
    val listImmutable = listOf("hafidh","albar",27,1998)
    //gabisa, karena im-mutable
    //listMutable.add("muhammad")
    for(nama in listImmutable){
        println(nama)
    }

    //mutable
    var listMutable = mutableListOf("hafidh","albar",27,1998)
    listMutable.add("muhammad")
    for(nama in listMutable){
        println(nama)
    }

    //im-mutable map
    val listOfUsersImmutable = mapOf(1 to "Hafidh", 2 to "Albar")
    var listOfUsersMutable = mutableMapOf(1 to "Hafidh", 2 to "Albar")

}