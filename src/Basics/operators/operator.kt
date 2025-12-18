package Basics.operators

fun main(){
    var n1 : Int = 20;
    var n2 :Int = 30;
    var name : String = "Roy";
    println("addition of two no $n1 and $n2 is : ${n1.plus(n2)}");
    println("subtraction of two no $n1 and $n2 is : ${n1.minus(n2)}");
    println("product of two no $n1 and $n2 is : ${n1.times(n2)}");
    println("division of two no $n1 and $n2 is : ${n1.div(n2)}");
    println("remainder of two no $n1 and $n2 is : ${n1.rem(n2)}");
}