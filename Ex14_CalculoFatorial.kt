package dificil

/* Enunciado: Escreva um programa que calcule o fatorial de um número (ex: para 6, o
cálculo é 6 x 5 x 4 x 3 x 2 x 1 = 720). O programa deve tratar os casos especiais onde o fatorial de
 0 e de 1 é igual a 1, e para números maiores que 1, utilizar uma estrutura iterativa que decremente o
 número até chegar a 1 para obter o produto acumulado.
 */

fun main(){
    val numero = 6
    var fatorial: Long

    if (numero == 0 || numero == 1) {
        fatorial = 1
    }else{
        fatorial = 1
        var n = numero
        while (n >1){
            fatorial *= n
            n--
        }
    }
    println("fatorial: $fatorial")
}