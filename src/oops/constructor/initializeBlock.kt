package oops.constructor

fun main(){
    var obj = Employee(1,"Sou");
    var emp = Emp("Roy",18);
    var emp2 = Emp("Sou");
}

class Employee(var empid : Int,var empname : String) {
    var ename: String;
    var eid: Int;

    init {
        ename = empname;
        eid = empid;
        println("name : $ename")
        println("id : $eid")
    }
}
    class Emp{
        constructor(name : String,age : Int){
            if(age < 18){
                println("you can't vote");
            }else{
                println("you can vote.");
            }
        }
        constructor(name : String){
            println("name : $name")
        }
    }
