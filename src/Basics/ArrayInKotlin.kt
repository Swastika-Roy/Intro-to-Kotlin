package Basics

fun main(){
    var arr1 = arrayOf("kanu","titu","messi",1,2.2);
    for (i in arr1){
        print("$i ");
    }
    println()

    var arrnum = arrayOf<Int>(1,2,3,4,5);
    for (i in arrnum){
        print("$i ");
    }
    println()

    var arrstr = arrayOf<String>("sou","swasti","messi");
    for (i in arrstr){
        print("$i ");
    }
    println()

    var arr = arrayOf<Int>(1,2,3,4,5,6,7,8,9,0);
    for (i in 0..arr.size-1){
        print(" "+arr[i]);
    }
    println()

    arr.set(0,100);
    println(arr.get(0));
}