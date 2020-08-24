//cara import class
package com.example.cars
import com.car.maintin.CarOptions

//kalau mau import semuanya pake *
//import com.car.maintin.*

class Main {
    fun showInfo(){
        println("BMW adalah mobil baru")
    }
}

fun main(){
    var carOptions = CarOptions("Mercedes",1997, 10000.0, 20000.0)
    println(carOptions.getPrice())
}