class Singleton{
    var name:String?=null
    //dibuat private untuk menghindari direct instance
    private constructor(){
        println("intance created")
    }

    //define Singleton
    companion object{
        val instance:Singleton by lazy { Singleton() }
    }
}

//Single ton membuat  single objek pada kelas
fun main(){
    var s1 = Singleton.instance
    s1.name = "Hafidh"
    println(s1.name)

    var s2 = Singleton.instance
    println(s2.name)

    var s3 = Singleton.instance
    println(s3.name)
}