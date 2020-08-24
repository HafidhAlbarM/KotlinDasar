//Kelas yang gabisa di instance untuk security reason
abstract class CreditCard(){
    fun CreditId():String{
        return "23422342"
    }

    abstract fun newCredit()
}

//Apabila ingin menggunakan kelas yg di abstrak, harus di inherit
class UserInfo():CreditCard(){
    fun getInfo():String{
       return CreditId()
    }
    override fun newCredit(){
        println("New card created")
    }
}

fun main(){
//    kalo class abstract gabisa bikin objek langsung
//    var credit = CreditCard()
//    println(credit.CreditId())

    var user = UserInfo()
    println(user.getInfo())
}
