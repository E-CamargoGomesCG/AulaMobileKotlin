package facil

/* Contexto: Um aplicativo de cronômetro de corrida precisa exibir uma contagem regressiva antes de autorizar
a largada dos atletas.
Enunciado: Escreva um programa que exiba na tela a contagem regressiva de 10 até 1.
Logo após a contagem, mostre a mensagem final: "Contagem finalizada! VAI!".
*/

fun main(){
    for(i in 10 downTo 1){
        println(i)
    }
    println("Contagem finalizada! VAI!")
}