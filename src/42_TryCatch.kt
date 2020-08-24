fun main(){

    try{
        println("Enter n2")
        var n2:Int = readLine()!!.toInt()
        var div = 100/n2

        println("Div: $div")
    }catch (ex:Exception){
        println(ex.message)
    }

    println("done")
}