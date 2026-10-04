fun avaliarMotorista(notas: Int?) {

    val notasValidas = notas ?: 0

    when (notasValidas) {
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida.")
        1, 2, 3 -> println("Precisamos melhorar.")
        0 -> println("Nenhuma avaliação fornecida.")
    }
}

fun main() {
    avaliarMotorista(4)
    avaliarMotorista(null)
}