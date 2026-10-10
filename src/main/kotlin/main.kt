
package estacionamento

import model.Veiculo
import model.Ticket
import service.Estacionamento

fun main() {

    val veiculo1 = Veiculo("ABC1234", "Honda CG", 1)
    val veiculo2 = Veiculo("DEF5678", "Fiat Uno", 2)
    val veiculo3 = Veiculo("GHI9012", "Van Ducato", 3)

    val ticket1 = Ticket(veiculo1, 8, 11, null)
    val ticket2 = Ticket(veiculo2, 7, 13, "Lavagem")
    val ticket3 = Ticket(veiculo3, 9, 12, null)

    val estacionamento = Estacionamento()

    val tickets = listOf(ticket1, ticket2, ticket3)

    for (ticket in tickets) {

        val valor = estacionamento.calcularValor(ticket)

        println("TICKET")
        println("Placa: ${ticket.veiculo.placa}")
        println("Modelo: ${ticket.veiculo.modelo}")

        when (ticket.veiculo.tipo) {
            1 -> println("Tipo: Moto")
            2 -> println("Tipo: Carro")
            3 -> println("Tipo: Van")
            else -> println("Tipo: Desconhecido")
        }

        println("Hora de entrada: ${ticket.horaEntrada}h")
        println("Hora de saída: ${ticket.horaSaida}h")
        println("Serviço: ${ticket.servicoLavagem ?: "Nenhum"}")
        println("Valor a pagar: R$ $valor")
        println()
    }
}
