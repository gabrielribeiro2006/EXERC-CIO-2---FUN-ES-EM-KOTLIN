fun calcularAreaRetangulo(largura: Double, altura: Double): Double {
    return largura * altura
}

fun main() {

    val base = 5.0
    val altura = 10.0

    val area = calcularAreaRetangulo(base, altura)

    println("A área do retângulo com largura $base e altura $altura é: $area")
}