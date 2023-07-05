package exercicio2
fun main() {
    println("Digite um valor:")
    val valor = readln().toInt()
    MostrarValores(valor)
}
fun MostrarValores(valor:Int){
    val vetor = IntArray(10)
    vetor[0] = valor
    var i = 1
    while (i < vetor.size) {
        vetor[i] = vetor[i - 1] * 2
        i++
    }

    println("Vetor resultante:")
    for (num in vetor) {
        println(num)
    }
}
