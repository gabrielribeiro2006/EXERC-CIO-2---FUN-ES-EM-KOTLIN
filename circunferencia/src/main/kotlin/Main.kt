import kotlin.math.PI

fun calcularAreaCircunferencia(raio: Double): Double {
    return PI * raio * raio
}

fun main() {
    println("Informe o raio da circunferência:")
    val raio = readLine()?.toDoubleOrNull()

    if (raio != null && raio > 0) {
        val area = calcularAreaCircunferencia(raio)
        println("A área da circunferência com raio $raio é: $area")
    } else {
        println("Por favor, informe um valor válido para o raio.")
    }
}