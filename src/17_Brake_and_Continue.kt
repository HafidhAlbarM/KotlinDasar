fun main(){
//    for(i in 1..6){
//        if(i == 4){
//            continue
//        }
//        println(i)
//    }

//    for(i in 1..6){
//        if(i == 4){
//            break
//        }
//        println(i)
//    }
//    println("lanjut bang")

    loopSatu@ for(number in 1..10){
        println("number $number")
        for(innerLoop in 1..5){
            if(innerLoop == 4){
                break@loopSatu
            }
            println("innnerLoop $innerLoop")
        }
    }
}