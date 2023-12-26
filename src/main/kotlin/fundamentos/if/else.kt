package org.fundamentos.fundamentos.`if`

fun main(){
//    parOuImpar(numero = 2);
//    parOuImpar(numero = 3)

//    resultNota(nota = 8)
//    resultNota(nota = 5)
    resultNota(nota = 3)
}

fun parOuImpar( numero: Int){
    if (numero % 2 == 0){
        println("o numero $numero é par!")
    }else{
        println("o numero $numero é ímpar!")
    }
}

/*
se nota >=6 = Aprovado
se nota >= 4 e menor que 6 = recuperacao;
se nota < 4, reprovado!
 */

fun resultNota( nota : Int){
    if (nota >= 6){
        println("Sua nota foi $nota! Parabéns! Aprovado!!")
    }
    else if  (nota in 4..5){
        println("Sua nota foi $nota! Você está em recuperação!")
    }else{
        println("Reprovado!")
    }
}