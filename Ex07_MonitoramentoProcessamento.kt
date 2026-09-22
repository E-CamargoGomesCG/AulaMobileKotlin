package medio

/*Enunciado: Crie um programa que simule o progresso do download de 0% a 100%, avançando de 10 em 10%.
Se o progresso atingir exatamente 50%, imprima a mensagem "Erro no download! Operação cancelada."
e interrompa a repetição imediatamente. Para as demais porcentagens normais, exiba "Download em X%".
 */

fun main(){
    for (i in 0..100 step 10) {
      if (i == 50){
          println("Erro no download! Operação cancelada.")
          break
      }
        println("Download em $i%.")
    }
}