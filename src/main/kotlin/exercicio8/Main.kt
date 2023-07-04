package exercicio8

fun main() {
    println("Digite um valor: ")
    val valor = readLine()?.toIntOrNull()

    if (valor != null && valor >= 0) {
        val fibonacci = calcularFibonacci(valor)
        println("Fib($valor) = $fibonacci")
    } else {
        println("Valor inválido. Digite um número inteiro não negativo.")
    }
}

fun calcularFibonacci(n: Int): Int {
    if (n == 0) {
        return 0
    } else if (n == 1) {
        return 1
    }

    var anterior = 0
    var atual = 1

    for (i in 2..n) {
        val proximo = anterior + atual
        anterior = atual
        atual = proximo
    }

    return atual
}
