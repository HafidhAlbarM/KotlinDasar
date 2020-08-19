fun add1(num1:Int, num2:Int):Int{
    return num1+num2
}

fun add1(num1:Int, num2:Int, num3:Int):Int{
    return num1+num2+num3
}

fun add1(num1:Int, num2:Int, num3:Int, num4:Int):Int{
    return num1+num2+num3+num4
}

fun main(){
    println(add1(5, 5))
    println(add1(5, 5, 5))
    println(add1(5, 5, 5, 5))
}