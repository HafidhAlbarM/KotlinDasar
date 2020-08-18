fun main(){
    val sapaan = "halo selamat datang"
    val nama = " Hafidh."
    val pesan = " semoga sehat selalu."
    val semuaPesan = "${sapaan} ${nama} ${pesan}"

    println(semuaPesan)
    println(semuaPesan[0])

    println(semuaPesan.toLowerCase())
    println(semuaPesan.toUpperCase())
    println(semuaPesan.capitalize())
    println(nama)
    println(nama.trim())

    val listOfTtokens = sapaan.trim().split(" ")
    println(listOfTtokens)
    for(token in listOfTtokens){
        if(!token.contains("selamat")){
            println(token)
        }
    }
}