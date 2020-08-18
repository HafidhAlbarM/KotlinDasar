fun main(){
    print("Masukan Nama: ")
    var name = readLine()!!.toString()
    print("Masukan Umur: ")
    val age = readLine()!!.toInt()
    print("Masukan IPK: ")
    val GPA = readLine()!!.toDouble()

    println("======User info=======")
    println("Nama Anda: $name")
    println("Umur Anda: $age")
    println("IPK Anda: $GPA")
}