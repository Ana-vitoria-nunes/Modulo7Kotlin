package exercicio1
fun main(){
    val tamanhoVetor = 5
    val vetor = IntArray(tamanhoVetor)

    println("Digite $tamanhoVetor valores inteiros:")

    var i=0
    while (i<tamanhoVetor){
        print("Valor ${i + 1} :")
        vetor[i] = readln().toInt()
        i++
    }
    val soma=vetor.sum()
    println("A soma dos valores é: $soma")
}