fun calcularDesconto(precoItem: Double, cupomDigitado: String?): Double {

    return when (cupomDigitado) {
        "PROMO10" -> precoItem - 10
        "PROMO20" -> precoItem - 20
        else -> precoItem
    }
}

fun main() {
    val totalComDesconto = calcularDesconto(189.90, "PROMO10")
    println(totalComDesconto)
}