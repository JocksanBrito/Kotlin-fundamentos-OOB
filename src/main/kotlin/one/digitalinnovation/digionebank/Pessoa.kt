package one.digitalinnovation.digionebank

class Pessoa {
   var nome: String = "Jocksan"

   var cpf: String = "004.004.004.35"
   private set
   constructor()

   fun pessoaInfo() = "$nome e $cpf"

}
fun main() {
   val jocksan = Pessoa();

   println(jocksan.pessoaInfo())

}