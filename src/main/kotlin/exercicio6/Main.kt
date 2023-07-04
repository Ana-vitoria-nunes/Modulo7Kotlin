package exercicio6
fun main() {
    println("Digite o nome da banda musical: ")
    val nomeBanda = readLine()

    println("Digite 3 musicas da banda $nomeBanda: ")
    val musica=3
    val vetor = arrayOfNulls<String>(musica)
    var i=0
    while (i<musica){
        print("Musica ${i + 1}: ")
        vetor[i] = readln()
        i++
    }
    println("=====Lista de Musicas=====")
    println("Banda $nomeBanda")
    for (elemento in vetor) {
        println("Musica: $elemento")
    }
}