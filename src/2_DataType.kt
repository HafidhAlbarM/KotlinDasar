fun main(){
    var name="Hafidh"
    val age=22
    val GPA=3.5

    println("======User info=======")
    println("Nama: $name")
    println("Umur: $age")
    println("IPK: $GPA")

    name="David"
    println("Nama: $name")

    var count = 1
    println("count: $count")
    count=10
    println("count: $count")

//    var department:String
//    department = "Developer"
//    println("Departemen: $department")

    var department:String?
    department = null
    department = "Developer"
//    !! should not be null
    println("Departemen: ${department!!}")

}