fun main(){
    println("Increment")
    for(i in 1..10 step 1){
        println(i)
    }

    println("Decrement")
    for(i in 10 downTo 0 step 2){
        println(i)
    }

    println("Odd")
    for(i in 1..10 step 2){
        println(i)
    }

    println("Even")
    for(i in 0..10 step 2){
        println(i)
    }
}