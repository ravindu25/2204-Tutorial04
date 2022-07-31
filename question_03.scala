object Q3 extends App{
    case class Car(name: String, price: Double)
    implicit def uuid(car: Car): String = {
        val name = car.name
        val price = car.price
        val nameHash = name.hashCode
        val uuid = nameHash
        s"car uuid = $name - $uuid"
    }
    val bmw3 = Car("bmw 3 series", 20000)
    val bmw5 = Car("bmw 5 series", 50000)
    val vwPassat = Car("vw passat", 10000)
    val vwGolf = Car("vw golf", 12000)
    val mazda3 = Car("mazda 3", 15000)
    val cars = List(bmw3, bmw5, vwPassat, vwGolf, mazda3)
    for(car<-cars){
        println(uuid(car))
    }
}