package com.car.maintin

//interface
//Sebuah struktur
interface CreditCard{
    val cardNumber:String
    fun score(age:Int)
}

class MasterCard(override val cardNumber: String) :CreditCard{
    override fun score(age:Int){
        if(age>50){
            println("Negative")
        }else{
            println("Positive")
        }
    }

    fun cetak(){
        return println("ini fungsi Cetak kelas Master Card")
    }
}

class Visa(override val cardNumber: String) :CreditCard{
    override fun score(age:Int){
        if(age>60){
            println("Negative")
        }else{
            println("Positive")
        }
    }
}

//Delegation
class Paypal(client:CreditCard):CreditCard by client{
    fun cetak():String{
        return this.cardNumber
    }
}

fun main(){
    val visa = Visa("3782942798")
    visa.score(60)

    println("----------------------------------")
    val masterCard = MasterCard("34235959")
    masterCard.score(60)
    masterCard.cetak()

    println("----------------------------------")
    val paypal = Paypal(visa)
    println("visa card number Paypal ${paypal.cardNumber}")

    println("----------------------------------")
    val paypal2 = Paypal(masterCard)
    println("master card number Paypal ${paypal2.cardNumber}")
    println("paypal2.print() ${paypal2.cetak()}")
}

