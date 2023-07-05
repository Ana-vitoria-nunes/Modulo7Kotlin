package exercicio9
fun main() {
  println("Qual a quantidade de funcionario: ")
  val quantidade= readln().toInt()
  MostrarSeTemFeriaOuNao(quantidade)

}
fun MostrarSeTemFeriaOuNao(quantidade:Int){
  var contadorFerias = 0
  var contadorSemFerias = 0
  for (turma in 0 until  quantidade){
    println("Funcionario ${turma + 1}")
    println("Digite o nome:")
    val nome = readln()
    println("Digite o tempo de serviço (em meses):")
    val tempo = readln().toInt()

    if (tempo>12){
      println("$nome tem direito a férias")
      contadorFerias++
    }
    else {
      println("$nome não tem direito a férias")
      contadorSemFerias++
    }
  }
  println("Quantidade de funcionários com direito a férias: $contadorFerias")
  println("Quantidade de funcionários sem direito a férias: $contadorSemFerias")
}

