import kotlin.math.sqrt

fun main() {
    val ladoEquilatero = 5.0
    val baseIsosceles = 4.0
    val ladoIsosceles = 3.0
    val ladoEscalenoA = 6.0
    val ladoEscalenoB = 8.0
    val ladoEscalenoC = 10.0

    val areaEquilatero = calcularAreaTrianguloEquilatero(ladoEquilatero)
    val areaIsosceles = calcularAreaTrianguloIsosceles(baseIsosceles, ladoIsosceles)
    val areaEscaleno = calcularAreaTrianguloEscaleno(ladoEscalenoA, ladoEscalenoB, ladoEscalenoC)

    println("Área do Triângulo Equilátero: $areaEquilatero")
    println("Área do Triângulo Isósceles: $areaIsosceles")
    println("Área do Triângulo Escaleno: $areaEscaleno")
}

fun calcularAreaTrianguloEquilatero(lado: Double): Double {
    val altura = (sqrt(3.0) / 2) * lado
    return (lado * altura) / 2
}

fun calcularAreaTrianguloIsosceles(base: Double, lado: Double): Double {
    val altura = sqrt(lado.pow(2) - (base / 2).pow(2))
    return (base * altura) / 2
}

fun calcularAreaTrianguloEscaleno(a: Double, b: Double, c: Double): Double {
    val s = (a + b + c) / 2
    return sqrt(s * (s - a) * (s - b) * (s - c))
}