package facil

/* Enunciado: Escreva um algoritmo que calcule a soma de todos os números inteiros de 1 a 100
e exiba o resultado final dessa soma no console. */

fun main(){
    var soma = 0

    for (i in 1..100){
        soma += i

    }
    println("soma: $soma")
}