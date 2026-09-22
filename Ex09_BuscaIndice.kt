package medio

/*Enunciado: Dada uma lista com 4 tarefas (ex: "Estudar Kotlin", "Fazer exercícios", "Comprar pão", "Limpar casa"),
 percorra essa lista e imprima cada item acompanhado do seu número de ordem (iniciando em 1),
 no seguinte formato: "Tarefa 1: Estudar Kotlin", "Tarefa 2: Fazer exercícios", etc.
 */

fun main(){
    val tarefas = listOf("Estudar Kotlin", "Fazer exercícios", "Comprar pão", "Limpar casa")

    for ((indice, itens) in tarefas.withIndex()){
        println("Tarefa ${indice +1}: $itens")
    }
}