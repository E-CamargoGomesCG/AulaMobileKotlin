package service

import model.Ticket

class Estacionamento {

    fun calcularValor(ticket: Ticket): Double {

        val horas = ticket.horaSaida - ticket.horaEntrada

        val tarifa = when (ticket.veiculo.tipo) {
            1 -> 5.0
            2 -> 10.0
            3 -> 15.0
            else -> 0.0
        }

        var valor = horas * tarifa

        if (ticket.servicoLavagem != null) {
            valor += 35.0
        } else {
            valor += 0.0
        }

        if (horas > 4) {
            valor = valor - (valor * 0.15)
        } else {
            valor = valor
        }

        return valor
    }
}
