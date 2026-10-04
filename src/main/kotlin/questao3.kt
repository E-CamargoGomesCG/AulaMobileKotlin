fun validarBioInfantil(descricaoPerfil: String?) {
    val qtdCaracteres = descricaoPerfil?.length ?: 0

    if (qtdCaracteres <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

fun main() {
    validarBioInfantil("Gosto de jogar bola, desenhar e assistir desenhos animados toda tarde")
    validarBioInfantil(null)
}