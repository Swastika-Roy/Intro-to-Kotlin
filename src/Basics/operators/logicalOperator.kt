package Basics.operators

fun main(){
    var year = 2000;
    if(year.rem(400)==0 && year.rem(4)==0 || year.rem(100) != 0) {
        println("yes $year is leap year.")
    };
    else{
        println("No $year is not a leap year.")
    }
}