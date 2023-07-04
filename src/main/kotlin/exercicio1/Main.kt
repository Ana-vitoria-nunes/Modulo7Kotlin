package exercicio1
fun main() {
    println("Digite um número:")
    var resposta= readln().toInt()

    println("Número atual: $resposta")
    resposta-=1
    println("Número antecessor: $resposta")
}