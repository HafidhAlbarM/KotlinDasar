import java.io.FileReader
import java.io.FileWriter

fun main(){
    println("1 for read and 2 for write")
    var op = readLine()!!.toInt()

    when(op){
        1-> {
            readFromFile()
        }
        2->{
            println("Write to file")
            var str=readLine()!!.toString()
            writeToFile(str)
            println("Data is saved")
        }
    }

}

fun writeToFile(str:String){
    try{
        var fo = FileWriter("bikinFile.txt")
        fo.write(str)
        fo.close()
    }catch(ex:Exception){
        println(ex.message)
    }
}

fun readFromFile(){
    try{
        var fin = FileReader("bikinFile.txt")
        var c:Int
        do{
            c=fin.read()
            print(c.toChar())
        }while(c!=-1)
    }catch (ex:Exception){
        ex.message
    }
}