package Exercicio10
fun main() {
    var numero = 1
    var soma = 0

    do {
        soma += numero
        numero++
    } while (numero <= 15)

    println("A soma dos números de 1 a 15 é: $soma")
}
