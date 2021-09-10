package bytebank.model

class Auxiliar(nome: String, cpf: String, salario: Double)
    : Funcionario(nome, cpf, salario) {

    override val getBonificacao: Double = salario * 0.15

}