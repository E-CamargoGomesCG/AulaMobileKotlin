package dificil

/*Enunciado: Crie a estrutura de dados:
n
val lotes = listOf(
listOf(100.0, 50.0, 200.0),
listOf(80.0, -20.0, 150.0), // Possui valor inválido
listOf(30.0, 40.0)
)
Utilize laços for aninhados e um rótulo (label) no laço externo (ex: loopLotes@ for (...)).
Percorra os lotes e as transações de cada lote. Ao identificar qualquer valor menor que `0.0`, exiba
Transação inválida encontrada (R$ $valor). Interrompendo toddoo o processamento e use
`break@loopLotes` para cancelar a execução de todas as repetições de uma só vez.
 */

fun main(){
    val lotes = listOf(
        listOf(100.0, 50.0, 200.0),
        listOf(80.0, -20.0, 150.0), // Possui valor inválido
        listOf(30.0, 40.0)
    )

    loopLotes@ for (lote in lotes) {
        for (valor in lote) {
            if (valor < 0.0) {
                println("Transação inválida encontrada (R$ $valor). Interrompendo todo o processamento!")
                break@loopLotes
            }
            println("Processando transação: R$ $valor")
        }
    }

}