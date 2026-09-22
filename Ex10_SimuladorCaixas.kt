package medio

/*Enunciado: Considere uma meta de R$ 500.00 e uma lista de depósitos
simulados: 100.0, 150.0, 200.0, 100.0, 50.0. Programe uma estrutura de repetição que processe depósito
por depósito até que o saldo acumulado atinja ou ultrapasse o valor da meta. Nesse instante,
imprima "Meta atingida! Saldo atual: R$ [saldo]" e encerre o programa.
 */

fun main(){
    val meta = 500.0
    val depositos = listOf(100.0, 150.0, 200.0, 100.0, 50.0)
    var saldo = 0.0

    for (deposito in depositos) {
        saldo += deposito
        if (saldo >= meta) {
            println("Meta atingida! Saldo atual: R$ $saldo")
            break
        }
    }
}

