package exercicio1
fun main() {
    println("Digite um valor para x:")
    val x= readln().toInt()
    println("Digite um valor para y:")
    val y= readln().toInt()
    SomarNumeros(x, y)
}
fun SomarNumeros(x:Int,y:Int){
    var soma=0
    for (i in x .. y){
        if(i%13 !=0){

            soma+=i
        }
    }
    println("A soma total dos números é $soma")
}
