package model

class Ticket(
    val veiculo: Veiculo,
    val horaEntrada: Int,
    val horaSaida: Int,
    val servicoLavagem: String?
)
