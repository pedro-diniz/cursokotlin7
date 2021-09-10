package bytebank.model

abstract class Funcionario( // open faz uma classe ser herdável, abstract é automaticamente open
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    // ISSO
//    open fun bonificacao(): Double { // open faz um método ser sobrescritível
//        return salario*0.1
//    }

    // VIRA ISSO
//    open val bonificacao: Double
//        get() { // função convertida como property -> pode ser aplicada para métodos simples que só retornam valores
//            return salario * 0.1
//        }

    // QUE PODE FICAR ASSIM
//     open val getBonificacao : Double get() = salario * 0.1 // é chamado sem ser função, só .getBonificacao

    // Entretanto, vamos abstrair esse membro. Assim, cada classe filha implementa o seu
    abstract val getBonificacao: Double

    override fun toString(): String {
        return "bytebank.model.Funcionario(nome='$nome', cpf='$cpf', salario=$salario)"
    }
}