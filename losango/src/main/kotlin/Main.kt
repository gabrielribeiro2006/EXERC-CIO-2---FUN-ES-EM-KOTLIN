import kotlin.math.abs

fun calcularAreaDoLosango(diagonalMaior: Double, diagonalMenor: Double): Double {
    val area = (diagonalMaior * diagonalMenor) / 2
    return abs(area)
}

fun main() {
    // Exemplo de utilização da função
    val diagonalMaior = 8.0
    val diagonalMenor = 6.0

    val areaDoLosango = calcularAreaDoLosango(diagonalMaior, diagonalMenor)

    println("Área do losango: $areaDoLosango")
}