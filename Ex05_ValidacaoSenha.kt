package facil

/* Contexto: A tela de login de um aplicativo deve tentar autenticar as credenciais do usuário até
atingir o limite máximo de 3 tentativas seguidas.

Enunciado: Crie um programa que execute a validação simulada e imprima "Tentativa 1: Validando credenciais...",
 "Tentativa 2: Validando credenciais..." e assim por diante. O programa deve obrigatoriamente realizar
pelo menos uma verificação antes de testar a condição de parada para encerrar exatamente após a terceira tentativa.

 */

fun main() {
    var tentativa = 1
    do {
        println("Tentativa $tentativa: Validando credenciais...")
        tentativa++
    } while (tentativa <= 3)
}