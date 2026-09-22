package dificil

/*Enunciado: Dadas as listas nomes = listOf("Ana", "Bruno", "Carlos", "Diana") e idades = listOf(17, 21, 15, 30),
crie uma lógica que percorra os registros por posição e classifique cada usuário com base nas regras:
Menor de 18 anos -> "Acesso Negado (Menor de idade)"
Entre 18 e 25 anos -> "Acesso Permitido (Perfil Jovem)"
Acima de 25 anos -> "Acesso Permitido (Perfil Sênior)"
Exiba o nome do usuário acompanhado da sua classificação. */

fun main() {
    val nomes = listOf("Ana", "Bruno", "Carlos", "Diana")
    val idades = listOf(17, 21, 15, 30)

    for(i in nomes.indices){
        val nome = nomes[i]
        val idade = idades[i]

        val classificacao = when {
            idade < 18 -> "Acesso Negado (Menor de idade)"
            idade in 18..25 -> "Acesso Permitido (Perfil Jovem)"
            else -> "Acesso Permitido (Perfil Sênior)"
        }

        println("$nome: $classificacao")
    }
}