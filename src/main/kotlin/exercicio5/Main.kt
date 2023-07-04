package exercicio5
fun main(){

    println("Quantos produtos deseja adicionar na lista: ")
    val tamanhoVetor = readLine()?.toIntOrNull() ?: 0
    if (tamanhoVetor <= 0) {
        println("Valor inválido. O programa será encerrado.")
        return
    }
    val vetor = arrayOfNulls<String>(tamanhoVetor)

    println("Adicione $tamanhoVetor produtos na lista de compras:")
    var i=0
    while (i<tamanhoVetor){
        print("Produto ${i + 1}: ")
        vetor[i] = readln()
        i++
    }
    println("=====Lista de compras=====")
    for (elemento in vetor) {
        println(elemento)
    }


}