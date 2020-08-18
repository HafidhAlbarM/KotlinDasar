fun main(){
    
    println("Enter your age")
    val age = readLine()!!.toInt()

    if(age>=18){
        println("You can apply the job")
    }else{
        println("You can not apply the job!")
    }

}