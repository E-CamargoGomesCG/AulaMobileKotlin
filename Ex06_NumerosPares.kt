package medio

/*faixa específica de valores.
Enunciado: Crie um laço for que percorra os números inteiros de 2 a 50 utilizando o parâmetro step 2
para iterar apenas sobre os números pares. Durante a iteração, acumule a soma desses números em uma
variável e, após o término do laço, imprima o valor total acumulado.
 */

fun main(){
    var soma =0
    for (i in 2..50 step 2){
        soma +=i
    }
    println("soma dos num pares $soma")
}