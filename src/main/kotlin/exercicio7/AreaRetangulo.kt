package exercicio7
class AreaRetangulo(val base:Double, val altura: Double) {
    fun calcularArea() {
        val area = base * altura
        println("A area do retangulo é $area")
    }
}