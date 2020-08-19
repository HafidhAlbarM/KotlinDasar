fun addNumbers(x:Double=0.0, y:Double=0.0):Double{
    val temp = x + y
    return temp
}

fun minusNumbers(x:Int=0, y:Int=0):Int{
    val temp = x - y
    return temp
}

fun displayInfo(names:ArrayList<String>){
    for(name in names){
        println(name);
    }
}

fun main(){
    val penjuamlahan = addNumbers(7.0,5.0);
    val penguarangan = minusNumbers(7,5)
    println("penjumlahan $penjuamlahan")
    println("pengurangan $penguarangan")

    val penjuamlahan2 = addNumbers(7.0);
    val penguarangan2 = minusNumbers(7)
    println("penjumlahan kedua $penjuamlahan2")
    println("pengurangan kedua $penguarangan2")

    val penjuamlahan3 = addNumbers(y=7.0);
    val penguarangan3 = minusNumbers(y=7)
    println("penjumlahan ketiga $penjuamlahan3")
    println("pengurangan ketiga $penguarangan3")

    displayInfo(names = arrayListOf("hafidh", "albar", "muhammad"))
}