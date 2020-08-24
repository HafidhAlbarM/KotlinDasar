package com.car.maintin

//class yang gak punya method, cuma ada data aja
data class Person(val name:String, val age:Int, val Gender:String)

fun main(){
    val person1 = Person("Hafidh", 22,"male")
    println("nama: ${person1.name}")
    println("umur: ${person1.age}")
}