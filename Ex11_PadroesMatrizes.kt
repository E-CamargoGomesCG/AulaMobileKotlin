package dificil

/* Enunciado: Escreva dois laços for aninhados (um para linhas e outro para colunas) para
imprimir um quadrado de tamanho N x N (ex: N = 5) formado pelo caractere *. No entanto,
se a linha for igual à coluna (diagonal principal), imprima o caractere X em vez de *.
 */


fun main() {
    val n = 5

    for (linha in 0 until n) {
        for (coluna in 0 until n) {
            if (linha == coluna) {
                print("X ")
            } else {
                print("* ")
            }
        }
        println()
    }
}