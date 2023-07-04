package exercicioGeral1

fun main(){
    println("Digite o primeiro número:")
    val numero1 = readln().toDouble()
    println("Digite o segundo número:")
    val numero2 = readln().toDouble()

    MostrarCalculos(numero1,numero2)

}
fun MostrarCalculos(numero1: Double,numero2: Double){
    val soma = numero1 + numero2
    val subtracao = numero1 - numero2
    val multiplicacao = numero1 * numero2
    val divisao = numero1 / numero2

    println("Soma: $soma")
    println("Subtração: $subtracao")
    println("Multiplicação: $multiplicacao")

    if (numero1==0.0 || numero2==0.0){
        println("Não é possivel fazer divisão com 0")
    }
    else{
        println("Divisão: $divisao")
    }

}
