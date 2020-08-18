fun main(){
    println("Masukan kode makanan")
    val foodId = readLine()!!.toInt()

    when(foodId){
        1 -> {
            println("Rendang")
            println("Teh tawar")
        }
        2 -> {
            println("Cincang")
            println("Teh tawar")
        }
        3 -> {
            println("Ayam bakar")
            println("Teh tawar")
        }
        else -> {
            println("Teh tawar")
        }
    }
}