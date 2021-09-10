package bytebank.model

class Gerente(nome: String, cpf: String, salario: Double, val senha: Int)
    : Funcionario(nome = nome, cpf = cpf, salario = salario),
    Autenticavel { // utilizamos o construtor da classe herdada

    override val getBonificacao : Double get() = salario

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

    override fun toString(): String {
        return "bytebank.model.Gerente(senha=$senha) ${super.toString()}"
    }

}