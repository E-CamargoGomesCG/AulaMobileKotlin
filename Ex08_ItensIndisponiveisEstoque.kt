package medio

/*Enunciado: Crie uma lista com nomes de pratos e declare uma
variável itemEsgotado = "Pizza". Percorra a lista com o laço for. Se o item da iteração for igual
ao itemEsgotado, utilize a instrução continue para pular esse item. Para os demais itens,
 imprima "Item disponível: [nome do item]".
 */


fun main(){
    val pratos = listOf("macarrao", "estrogonofe","Pizza", "macarronada", "lasanha")
    val itemEsgotado = "Pizza"

    for (item in pratos){
        if(item == itemEsgotado){
            continue
        }
        println("Item disponivel $item")
    }
}