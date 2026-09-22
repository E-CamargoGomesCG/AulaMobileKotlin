package facil

/* Enunciado: Crie uma lista imutável de nomes de produtos:
val carrinho = listOf("Camiseta", "Calça", "Tênis", "Boné"). Utilize o laço for para percorrer
a lista e imprimir cada produto no formato: "Item no carrinho: [nome do produto]".
 */

fun main(){
    val carrinho = listOf("Camiseta", "Calça", "Tênis", "Boné")

    for (i in carrinho){
        println("Item no carrinho: $i")
    }
}