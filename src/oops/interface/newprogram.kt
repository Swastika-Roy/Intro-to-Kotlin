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

class Square(override val length : Double, override val breadth: Double ): dimensions, calculation{
    override fun area() : Double{
      return length*length;
    }

    override fun perimeter(): Double {
        return length*4;
    }
}

fun main(){
    var obj = Rectangle(10.00,10.00)
    var obj2 = Square(10.00,10.00)
    obj.area()
    obj.perimeter()
    println("area = "+ obj.area())
    println("perimeter = "+obj.perimeter())
    println("area = "+ obj2.area())
    println("perimeter = "+obj2.perimeter())
}