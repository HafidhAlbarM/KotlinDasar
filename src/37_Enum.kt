enum class Direction{
    NORTH,SOUTH,EAST,WEST
}

fun main(){
    var userDirect = Direction.SOUTH

    if(userDirect==Direction.NORTH) {
        println("He went to north")
    } else{
        println("I don't know where he went")
    }

}