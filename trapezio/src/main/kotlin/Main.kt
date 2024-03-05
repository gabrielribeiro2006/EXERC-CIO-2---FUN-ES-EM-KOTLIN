fun calcularAreaDoTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    return ((baseMaior + baseMenor) * altura) / 2
}

fun main() {
    // Exemplo de uso da função
    val baseMaior = 8.0
    val baseMenor = 5.0
    val altura = 4.0

    val areaTrapezio = calcularAreaDoTrapezio(baseMaior, baseMenor, altura)

    println("A área do trapézio é: $areaTrapezio")
}