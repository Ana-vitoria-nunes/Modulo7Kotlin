package exercicio11

fun main() {
    var soma = 0.0

    for (i in 1..15) {
        println("Digite o número ${i}: ")
        val numero = readln().toDouble()
        soma += numero
    }
    val media = soma / 15
    println("A média dos 15 números é: $media")
}
