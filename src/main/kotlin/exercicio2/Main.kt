package exercicio2

import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun main(){
    println("Qual sua idade: ")
    val resposta= readln().toInt()
    if(resposta>=0){
        val dataAtual = LocalDate.now()
        val dataNascimento = dataAtual.minusYears(resposta.toLong())
        val diasVividos = ChronoUnit.DAYS.between(dataNascimento, dataAtual)

        println("Dias vividos: $diasVividos")
    }
    else {
        println("Idade inválida.")
    }

}