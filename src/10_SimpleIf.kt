fun main(){
    println("Enter Your Grade: ")
    val grade = readLine()!!.toInt()

    if(grade > 90){
        if(grade>93){
            println("A+")
        }else{
            println("A")
        }
    }else if(grade in 80..90){
        if(grade>83){
            println("B+")
        }else{
            println("B")
        }
        println("B")
    }else if(grade in 70..79){
        if(grade>73){
            println("C+")
        }else{
            println("C")
        }
    }else{
        println("Fail")
    }

}