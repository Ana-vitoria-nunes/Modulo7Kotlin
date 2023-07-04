package exercicio4
fun main(){

    val tamanhoVetor = 10
    val vetor = IntArray(tamanhoVetor)

    println("Digite $tamanhoVetor valores inteiros:")

    var i=0
    while (i<tamanhoVetor){
        print("Número $i: ")
        vetor[i] = readln().toInt()
        i++
    }
    val numerosPares = vetor.filter { i % 2 == 0 }

    println("Números pares digitados: $numerosPares")}