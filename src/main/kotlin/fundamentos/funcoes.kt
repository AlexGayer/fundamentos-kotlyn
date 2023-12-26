package org.fundamentos.fundamentos

fun main(){
    dizOi(retornaNome(), idade = 32)
}

fun retornaNome(): String {
    return "ALexandre";
}

fun dizOi(nome: String, idade: Int = 32){
    println("Olá $nome, parabéns pelos seus $idade anos")
}