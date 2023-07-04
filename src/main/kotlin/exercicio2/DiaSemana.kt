package exercicio2
class DiaSemana (val dia: Int) {
    fun mostraDiaSemana() {
        val nomeDia = when (dia) {
            1 -> "Domingo"
            2 -> "Segunda-feira"
            3 -> "Terça-feira"
            4 -> "Quarta-feira"
            5 -> "Quinta-feira"
            6 -> "Sexta-feira"
            7 -> "Sábado"
            else -> "Número inválido. Digite um número de 1 a 7."
        }
        println("O dia correspondente é: $nomeDia")
    }
}
