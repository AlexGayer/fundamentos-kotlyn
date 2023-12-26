package org.fundamentos.fundamentos

class Pessoa(var name: String, var age: Int) {
    override fun toString(): String {
        return "nome : " + name + ", Idade : " + age

    }
}

fun main(){
    var alexandre = Pessoa( "Alexandre", age =  32 );

    println(alexandre)
}