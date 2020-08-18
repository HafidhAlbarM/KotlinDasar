fun main(){
    println("For")
    for(i in 1..10 step 1){
        println("Counter $i");
    }

    println("While")
    var i = 1
    while(i <= 10){
        println("Counter $i");
        i++
    }

    println("Do While Loop")
    i=11
    do{
        println("Counter $i");
        i++
    }while(i==10)
}