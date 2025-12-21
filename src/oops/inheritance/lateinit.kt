package oops.inheritance

fun main(){
     var obj = Employee("Swastika",1234);
     obj.location = "Delhi";
     println(obj.location);
}

class Employee(var name : String,var id : Int){
    lateinit var location : String;
    init{
        println("name : $name, id = $id");
    }
}