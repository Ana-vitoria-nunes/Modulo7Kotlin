package exercicio4
fun main() {
  println("Digite a quantidade de animais que tem na loja:")
    val quant= readln().toInt()
    MostraQuantAnimais(quant)
}
fun MostraQuantAnimais(quant:Int){

    val tiposAnimais = arrayOfNulls<String>(quant)
    var i=0
    var quantidadeGatos = 0
    var quantidadeCachorros = 0
    while (i<tiposAnimais.size){
        println("Digite o tipo do animal (gato ou cachorro) ${i + 1}:")
        tiposAnimais[i]= readln()

        if (tiposAnimais[i].equals("gato", ignoreCase = true)) {
            quantidadeGatos++
        } else if (tiposAnimais[i].equals("cachorro", ignoreCase = true)) {
            quantidadeCachorros++
        }
        else{
            println("Inválido digite  (gato ou cachorro).")
            return
        }
        i++
    }
    println("Gato: $quantidadeGatos")
    println("Cachorro: $quantidadeCachorros")
}
