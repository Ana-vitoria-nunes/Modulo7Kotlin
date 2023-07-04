package exercicio7

fun main(){
    println("Digite o valor da base do retangulo: ")
    val base= readln().toDouble()

    println("Digite o valor da altura do retangulo: ")
    val altura= readln().toDouble()

    AreaRetangulo(base,altura).calcularArea()
}