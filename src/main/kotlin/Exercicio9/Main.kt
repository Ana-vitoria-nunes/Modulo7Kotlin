package Exercicio9
fun main() {
    println("Digite o primeiro número: ")
    val numero1 = readLine()?.toDoubleOrNull()

    println("Digite o segundo número: ")
    val numero2 = readLine()?.toDoubleOrNull()

    if (numero1 != null && numero2 != null) {
        println("Menu:")
        println("1) Somar os números")
        println("2) Subtrair os números")
        println("3) Multiplicar os números")
        println("4) Dividir os números")
        println("Escolha uma opção: ")
        val opcao = readln().toInt()

            when (opcao) {
                1 -> {
                    val resultado = numero1 + numero2
                    println("Resultado: $resultado")
                }
                2 -> {
                    val resultado = numero1 - numero2
                    println("Resultado: $resultado")
                }
                3 -> {
                    val resultado = numero1 * numero2
                    println("Resultado: $resultado")
                }
                4 -> {
                    if (numero2 != 0.0) {
                        val resultado = numero1 / numero2
                        println("Resultado: $resultado")
                    } else {
                        println("Divisão por zero não é permitida.")
                    }
                }
                else -> {
                    println("Opção inválida.")
                }
            }
    }
    else {
        println("Valores inválidos. Digite números válidos.")
    }
}
