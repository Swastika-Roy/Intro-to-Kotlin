package oops.inheritance

fun main(){
    println("DEPARTMENTS OF OUR COLLEGE.")
    var obj = College("HIT",1234);
    var obj2 = IT("Information Technology",9876,877700);
    var obj3 = ECE("Electorics and communication ",1567,90000);
    var obj4 = CSE("COMPUTER SCIENCE",1022,90000)
}


open class College(var name : String, var id : Int){

    open fun feature(){

    }

}

class IT( name : String, id : Int, var salary : Int): College(name ,id){
    init {
        feature();
    }
    override fun feature(){
        println("IT DEPARTMENT , NAME : $name, ID : $id,SALARY : $salary ")
    }
}

class ECE( name : String, id : Int, var salary : Int): College(name ,id){
    init {
        feature();
    }
    override fun feature(){
        println("ECE DEPARTMENT , NAME : $name, ID : $id , SALARY : $salary")
    }
}

class CSE: College{
    constructor( name : String, id : Int,salary: Int):super(name,id){
        println("name : $name, id : $id, SALARY : $salary")
    }
}

