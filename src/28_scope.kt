var name:String?=null

fun showUserInfo(){
    println("welcome $name")
}

fun main(){
    println(name)
    name = "Hafidh"
    println(name)
    showUserInfo()
}