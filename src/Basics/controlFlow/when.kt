package Basics.controlFlow

fun main(){
    var option : Int = 7;
    when (option){
        1->println("sunday");
        2->println("monday");
        3->println("tueday");
        4->println("wedday");
        else->println("holiday");
    }
}