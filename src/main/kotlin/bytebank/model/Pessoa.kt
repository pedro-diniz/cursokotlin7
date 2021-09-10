package bytebank.model

class Pessoa(nome: String, email: String, idade: Int = 0) {

    var nome = nome
        private set

    var email = email
        private set

    var idade = idade
        private set

    fun alterarEmail(novoEmail: String) {
        email = novoEmail
    }

    fun alterarNome(novoNome: String) {
        nome = novoNome
    }

}