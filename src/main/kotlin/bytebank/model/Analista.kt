package bytebank.model

class Analista(nome: String, cpf: String, salario: Double, val senha: Int)
    : Funcionario(nome = nome, cpf = cpf, salario = salario) { // utilizamos o construtor da classe herdada

    override val getBonificacao : Double get() = salario * 0.1

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

    override fun toString(): String {
        return "bytebank.model.Analista(senha=$senha) ${super.toString()}"
    }

}