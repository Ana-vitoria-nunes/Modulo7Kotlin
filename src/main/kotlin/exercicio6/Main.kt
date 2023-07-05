package exercicio6
fun main() {
  var i = 1
  while (i <= 9) {
    println("Tabuada do $i:")
    var j = 1
    while (j <= 10) {
      val resultado = i * j
      println("$i x $j = $resultado")
      j++
    }
    println()
    i++
  }

}
