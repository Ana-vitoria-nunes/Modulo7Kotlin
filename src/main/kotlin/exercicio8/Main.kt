package exercicio8
fun main() {
  println("Digite seu nome completo: ")
  val nome= readln()

  val NomeAtual=nome.split(" ")

  for (palavra in NomeAtual){
    println(palavra)
  }
}
