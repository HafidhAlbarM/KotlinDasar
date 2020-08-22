package com.car.maintin

open class CarOptions(){
    var type:String?= null
    var model:Int?= null
    private var price:Double?= null
    protected var kmDrive: Double?= 0.0
    var owner: String?= null

    constructor( type:String,  model:Int,  price:Double,  kmDrive:Double,  owner:String):this(){
        this.type = type
        this.model = model
        this.price = price
        this.kmDrive = kmDrive
        this.owner = owner
    }

//    overloading constructor
    constructor( type:String,  model:Int,  price:Double,  kmDrive:Double):this(){
        this.type = type
        this.model = model
        this.price = price
        this.kmDrive = kmDrive
    }

    //open untuk di override
    open fun getCarPrice():Double{
        return this.price!! - (this.kmDrive!!.toDouble() * 10)
    }

    fun getPrice():Double{
        return this.price!!
    }
}

fun main(){
    val car = CarOptions("BMW", 2020, 80000.0, 1000.0, "Hafidh")
    println(car.type);
    println(car.owner);
    println(car.getCarPrice())

    val car2 = CarOptions("Mercedes",1997, 10000.0, 20000.0)
    car2.type = "Datsun"
    println(car2.type)
    println(car2.owner)
    println(car2.getCarPrice())

}