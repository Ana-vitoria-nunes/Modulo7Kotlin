package exercicio12

import java.time.Year

fun main() {
    println("Digite o ano de nascimento: ")
    val anoNascimento = readln().toInt()

    if (anoNascimento>0) {
        val anoAtual = Year.now().value
        //val idadeAtual = anoAtual - anoNascimento

        println("Linha do tempo:")

        for (ano in anoNascimento..anoAtual) {
            val idade = ano - anoNascimento
            println("Ano: $ano - Idade: $idade anos")
        }
    } else {
        println("Ano de nascimento inválido. Digite um número válido.")
    }
}
