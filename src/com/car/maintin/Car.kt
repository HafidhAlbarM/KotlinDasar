package com.car.maintin

class Car(var type:String, val model:Int, val price:Double, val kmDrive:Double, val owner:String){
    init{
        println("Object class is created")
    }

    fun getCarPrice():Double{
        return this.price - (this.kmDrive.toDouble() * 10)
    }
}

fun main(){
    val car = Car("BMW", 2020, 80000.0, 1000.0, "Hafidh")
//    println(car.type);
//    println(car.owner);
//    println(car.getCarPrice())

    val car2 = Car("Mercedes",1997, 10000.0, 20000.0, "Albar")
//    car2.type = "Datsun"
//    println(car2.type)
//    println(car2.owner)
//    println(car2.getCarPrice())

    var listOfCar = arrayListOf<Car>()
    listOfCar.add(car)
    listOfCar.add(car2)

    for(car in listOfCar){
        println("------------")
        println(car.type)
        println(car.getCarPrice())
    }

}