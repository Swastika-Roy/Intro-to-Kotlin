package oops.`interface`

interface dimensions{
    val length : Double
    val breadth : Double
}

interface calculation : dimensions{
    fun area() : Double;
    fun perimeter() : Double;
}

class Rectangle(override val length: Double, override val breadth: Double) : dimensions, calculation{
    override fun area() : Double {
        return length*breadth;
    }

    override fun perimeter() : Double {
        return 2*(length+breadth);
    }

}

fun main(){
    var obj = Rectangle(10.00,10.00)
    obj.area()
    obj.perimeter()
    println("area = "+ obj.area())
    println("perimeter = "+obj.perimeter())
}