package exercicio3
fun main() {
    println("Quantos produtos foram comprados: ")
    val produto= readln().toInt()
    Total(produto)

}
fun Total(produto:Int){
    var contador=1
    var valorTotal=0.0
    while (contador<=produto){
        println("Digite o preço do produto $contador:")
        val preco= readln().toDouble()
        valorTotal+=preco
        contador++
    }
    println("O cliente deve pagar: R$ $valorTotal")
}
