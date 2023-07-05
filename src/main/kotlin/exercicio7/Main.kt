package exercicio7
fun main() {
  println("Qual a quantidade de turmas: ")
  val quantidadeTurma= readln().toInt()

  val mediaTurma=DoubleArray(quantidadeTurma)

  for (turma in 0 until  mediaTurma.size){
    println("Turma ${turma + 1}")
    println("Digite a quantidade de alunos:")
    val quantidadeAlunos = readln().toInt()
    val mediasAlunos = DoubleArray(quantidadeAlunos)

    for (alunos in 0 until  quantidadeAlunos){
      println("Digite a média do aluno ${alunos + 1}:")
      mediasAlunos[alunos]= readln().toDouble()
    }
    val media=mediasAlunos.average()
    mediaTurma[turma]=media
  }
  for (i in 0 until mediaTurma.size) {
    println("Média da turma ${i + 1}: ${mediaTurma[i]}")
  }
}
