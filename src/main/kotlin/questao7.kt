fun main() {
    val cadastrosEmail = listOf("silva@gmail.com", null, "", "ana@gmail.com", "")
    var totalParaApagar = 0

    for (cadastro in cadastrosEmail) {
        val tamanho = cadastro?.length ?: 0

        if (tamanho == 0) {
            totalParaApagar++
            println("Conta inválida.")
        } else {
            println("Conta valida: $cadastro")
        }
    }
    println("Contas que precisam ser apagadas: $totalParaApagar")
}