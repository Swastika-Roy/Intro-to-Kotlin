package Basics.StandardInput

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`);
    println("Enter a number : ");
    var age : Int = sc.nextInt();
    sc.nextLine();
    println("Enter a name : ");
    var name : String = sc.nextLine();
    println("name : $name and age : $age");
}