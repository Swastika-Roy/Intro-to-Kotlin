package Basics.controlFlow

import java.util.Scanner

fun main(){
    val sc = Scanner(System .`in`);
    println("Enter a number : ");
    var num : Int = sc.nextInt();
    val res = if(num >= 0){
        println("Number is positive. ")
        num
    }else{
        println("Number is negative")
        num
    }
    println(res);
}