package com.car.maintin

//Extension
fun ArrayList<Int>.cariAngka3():Boolean{
    var ada:Boolean=false
    for(item in this){
        if(item==3){
            ada=true
        }
    }
    return ada
}

fun main(){
    val listOfElement = ArrayList<Int>()
    listOfElement.add(1)
    listOfElement.add(2)
    listOfElement.add(5)
    listOfElement.add(4)

    for(item in listOfElement){
        println(item)
    }

    print(listOfElement.cariAngka3());
}