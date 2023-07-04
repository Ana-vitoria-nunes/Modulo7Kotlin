package exercicio3
fun main(){
    println("Digite um número")
    val resposta= readln().toDouble()

    if (resposta%5==0.0){
        println("O número $resposta é divisivel por 5.")
    }
    else{
        println("O número $resposta não é divisivel por 5.")
    }
}