//cara lain untuk merepresentasikan data dalam kelas tapi tidak diketahui tipe datanya
class UserAdmin<T>(credit:T){
    init{
        println(credit)
    }
}

fun <T>display(proses:T){
    println(proses)
}

fun main(){
    var user1 = UserAdmin<String>("Hafidh")
    var user2 = UserAdmin<Int>(5)
    display<String>("Albar")
    display<Int>(27)

}