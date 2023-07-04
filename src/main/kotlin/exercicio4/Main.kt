package exercicio4
fun main() {
    println("Digite a temperatura em graus Celsius: ")
    val temperatura = readln().toDouble()

    val clima: String=when {
        temperatura <= 18 -> {
            "frio"
        }
        temperatura >18 && temperatura<=23 -> {
            "agradável"
        }
        temperatura >23 && temperatura<=35 -> {
            "quente"
        }
        else -> {
            "muito quente"
        }
    }
    println("O clima é $clima.")
}