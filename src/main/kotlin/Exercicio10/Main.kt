package Exercicio10
fun main(){

    println("Digite um número:")
    val resposta= readln().toInt()

    println("Número atual: $resposta")
    NumeroSucessor(resposta).exibirNumeroSucessor()
}