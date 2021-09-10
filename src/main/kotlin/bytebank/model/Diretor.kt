package bytebank.model

class Diretor(nome: String, cpf: String, salario: Double, val senha: Int, val plr: Double) :
    Funcionario(nome = nome, cpf = cpf, salario = salario),
    Autenticavel { // utilizamos o construtor da classe herdada

    override val getBonificacao: Double get() = salario + plr

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

    override fun toString(): String {
        return "bytebank.model.Diretor(senha=$senha, plr=$plr) ${super.toString()}"
    }

}