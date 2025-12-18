package Basics.operators

fun main(){
    var a = 95;
    var b = 65;
   if(a.compareTo(b)>0){
       println("$a>$b");
   }else if(a.compareTo(b)<0){
       println("$b>$a");
   }
    val c: String = "kanu";
    var d: String = "kanu";
    println(c.equals(d));
    println(c==d)
}