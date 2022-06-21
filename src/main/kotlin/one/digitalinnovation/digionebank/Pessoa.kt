package one.digitalinnovation.digionebank

class Pessoa {
   var nome: String = "Jocksan"

   var cpf: String = "004.004.004.35"
   private set
}
fun main() {
   val jocksan = Pessoa();

   println(jocksan.nome)
   println(jocksan.cpf)

}