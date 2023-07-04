package exercicio7

fun main() {
    println("Quantos alunos tem na sala? ")
    val numeroAlunos = readln().toInt()

    if (numeroAlunos > 0) {
        var somaNotas = 0.0
        var contador = 0
        while (contador < numeroAlunos) {
            println("Digite a nota do aluno ${contador + 1}: ")
            val nota = readln().toDouble()

            somaNotas += nota
            contador++
        }
        val media = somaNotas / numeroAlunos
        println("A média da turma é: $media")
    }
    else {
        println("Número inválido de alunos. Tente novamente.")
    }
}