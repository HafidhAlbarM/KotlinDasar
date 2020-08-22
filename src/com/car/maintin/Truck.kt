package com.car.maintin

class Truck:CarOptions {
    var load:String?=""

    constructor(type:String,  model:Int,  price:Double,  kmDrive:Double,  owner:String, load:String):
            super(type, model, price, kmDrive, owner){
        this.load = load
    }
    constructor(type:String,  model:Int,  price:Double,  kmDrive:Double, load:String):
            super(type, model, price, kmDrive){
        this.load = load
    }

    override fun getCarPrice():Double{
        return this.getPrice() - (this.kmDrive!!.toDouble() * 11)
    }

    fun getCarPriceWrapper():Double{
        //mengambil fungsi rumus dari parent
        return super.getCarPrice()
    }
}

//Extensions
//Mendifinisikan sesuatu diluar blok kelas
fun Truck.discountPrice():Double{
    return this.getCarPrice() - (this.getCarPrice()*0.10)
}


fun main(){
    println("------Truck 1------")
    var truck1 = Truck("Hino",2015, 4000.00, 100.00, "Hafidh", "Sand")
    println(truck1.type + " " + truck1.model)
    println("for: ${truck1.load}")
    println("Price:  ${truck1.getCarPrice()}")
    println("Pirce in Parent: ${truck1.getCarPriceWrapper()}")
    println("Price after discount: ${truck1.discountPrice()}")

    println("------Truck 2------")
    var truck2 = Truck("Isuzu",2018,5000.00,100.00,"Rock")
    println(truck2.type + " " + truck2.model)
    println("for: ${truck2.load}")
    println("Price:  ${truck2.getCarPrice()}")
    println("Pirce in Parent: ${truck2.getCarPriceWrapper()}")
    println("Price after discount: ${truck2.discountPrice()}")
}