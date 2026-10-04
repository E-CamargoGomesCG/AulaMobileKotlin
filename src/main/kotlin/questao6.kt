fun main() {
    val verificarGorjeta: (Double?) -> Double = { if (it == null || it < 0) {
            0.0
        } else {
            it
        }
    }
    println(verificarGorjeta(null))
    println(verificarGorjeta(-2.5))
    println(verificarGorjeta(12.0))
}