package exercicio10
fun main() {

  println("Digite o valor de x: ")
  val x= readln().toDouble()
  println("Digite o valor de y: ")
  val y= readln().toDouble()
  VerificarSeValoreSaoIguais(x,y)
}
fun VerificarSeValoreSaoIguais(x:Double,y:Double){
  if (x==y){
    println("Os valores são iguais.")
  }
  else{
    println("Os valores são diferentes")
  }
}

