package Basics.function

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`);
    println("Enter 1st val : ");
    var a = sc.nextInt();
    println("Enter 2nd val : ");
    var b = sc.nextInt();
    println("Enter 3rd val : ");
    var c = sc.nextInt();

    println("addition of $a and $b is : "+addition(a,b));

    println("addition of $a , $b and $c is : "+addition(a,b,c));

    println("multiplication of $a and $b is : "+multi(a,b));

    println("subtraction of $a and $b is : "+subtraction(a,b));
}

fun addition(a : Int,b:Int):Int{
    return a+b;
}

fun addition(a : Int,b: Int,c : Int):Int{
  return a+b+c;
}

fun multi(a : Int,b : Int) = a*b  //single line function

fun subtraction(a : Int, b : Int):Unit{   //unit mean nothing it returns
println("Subtraction of $a and $b is ${a.minus(b)}");
}



