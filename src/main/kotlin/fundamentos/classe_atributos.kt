package org.fundamentos.fundamentos

class Carro(val cor: String, val anoFabricacao: Int, var dono: Dono){

}

data class Dono(var name: String, var idade: Int) {

};

fun main(){
 var  carro = Carro( cor = "Azul", anoFabricacao = 2023, Dono("Alexandre", idade = 32))
    println(carro.dono)
}