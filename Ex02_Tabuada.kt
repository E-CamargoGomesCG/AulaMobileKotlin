package facil

/*Enunciado: Declare uma variável inteira numero (por exemplo, numero = 7).
Utilizando o laço for e o intervalo 1..10, imprima a tabuada desse número
 no formato: 7 x 1 = 7, 7 x 2 = 14, e assim por diante.
 */

fun main(){
    val num = 7

    for(i in 1..10){
        println("$num * $i = ${num*i}")

    }

}