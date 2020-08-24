fun main(){
    var t1 = thread("thread 1")
    t1.start()

    var t2 = thread("thread 2")
    t2.start()

    var t3 = thread("thread 3")
    t3.start()

    //join untuk nunggu proses sebelumnya selesai
    t3.join()
    println("Thread is run")
}

class thread():Thread(){
    var ThreadName:String = ""

    constructor(ThreadName:String):this(){
        this.ThreadName = ThreadName
        println(this.ThreadName + "  is started")
    }

    override fun run(){
        //write thread
        var count=0
        while(count<10){
            println(this.ThreadName + " Count $count")
            count++

            try {
                Thread.sleep(1000)
            }catch (ex: Exception){
                println(ex.message)
            }

        }
    }
}