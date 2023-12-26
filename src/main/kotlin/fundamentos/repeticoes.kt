package org.fundamentos.fundamentos

fun main(){
//    print1a10();
//    printa10a1();
//    printaPar10a1();
//    whileMenor10();
    doWhileMenor10();
}


fun print1a10(){
    for (numero in 1 .. 10){
        println(numero);
    }
}

fun whileMenor10(){
    var x = 0
    while (x < 10){
        println(x)
        x ++;
    }
}

fun doWhileMenor10(){
    var x  = 0;
    do {
        println(x)
        x ++
    }while (x < 10)
}

fun printa10a1(){
    for (numero in 10 downTo 1){
        println(numero)
    }
}

fun printaPar10a1(){
    for (numero in  2 .. 10 step 2){
        println(numero);
    }

}