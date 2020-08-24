package com.example.cars

class Outer{
    private val name:String?=null

    inner class Nested{
        fun Show(){
            println("nested")
        }
    }
}

//fun main(){
//    var outer = Outer()
//    var nested = Outer.Nested()
//    nested.Show()
//}