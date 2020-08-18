fun main(){
    println("Kalkulator Sederhana")
    println("Masukan bilangan 1 : ")
    val number1 = readLine()!!.toDouble()
    println("Masukan bilangan 2 : ")
    val number2 = readLine()!!.toDouble()

    val sum = number1 + number2
    println("penjumlahan $sum")

    val sub = number1 - number2
    println("pengurangan $sub")

    val mul = number1 * number2
    println("perkalian $mul")

    val div = number1 / number2
    println("pembagian $div")
}