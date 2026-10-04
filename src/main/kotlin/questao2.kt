fun main() {
    val enderecos = listOf("avenida djalma batista", null, "rua rio negro", "bairro flores", null)

    for (local in enderecos) {
        val localValido = local ?: "Endereço Desconhecido"

        if (localValido == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $localValido")
        }
    }
}