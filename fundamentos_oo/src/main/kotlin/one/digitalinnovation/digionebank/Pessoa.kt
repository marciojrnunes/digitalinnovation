package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.123.123-12"
}

fun main(){
    val jether = Pessoa()  //Variavel (objeto) jether recebe a instancia do classe Pessoa

    println(jether.nome)
    println(jether.cpf)
}