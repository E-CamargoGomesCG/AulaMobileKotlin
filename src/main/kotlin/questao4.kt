fun main() {
    val pixs = listOf(50.0, null, 120.5, null, 10.0)
    var soma = 0.0

    for (pix in pixs) {
        if (pix != null) {
            soma += pix
        } else {
            println("Transação ignorada")
        }
    }
    println("Total: $soma")
}