package oops.`interface`
fun main(){
    var obj = Car();
}
interface Vehicle{
    fun start();
    fun stop();
}

interface VehicleType{
    fun IsCar();
}

class Car : Vehicle , VehicleType{
    init {
        start();
        stop();
        IsCar();
    }
    override fun start(){
        println("start the car");
    }
    override fun stop(){
        println("stop the car");
    }
    override fun IsCar(){
        println("True");
    }
}