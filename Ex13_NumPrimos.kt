package dificil

/* Enunciado: Declare uma variável inteira numero = 29. Crie uma lógica utilizando o laço for
(testando divisores de 2 até numero - 1) e uma variável booleana ehPrimo = true para determinar se
o número é primo. Caso encontre qualquer divisor exato (resto % == 0), altere a variável para false e
interrompa o laço com break. No final, informe no console se o número é primo ou não.
 */

fun main(){
    val numero = 29
    var ehPrimo = true

    for (i in 2 until numero) {
        if(numero % i == 0){
            ehPrimo = false
            break
        }
    }
    if (ehPrimo) {
        println("$numero é primo")
    } else {
        println("$numero não é primo")
    }
}