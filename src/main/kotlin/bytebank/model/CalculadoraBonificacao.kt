package bytebank.model

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        println(funcionario.toString())
        this.total += funcionario.getBonificacao
    }

    // Cuidado pelo polimorfismo do funcionário, seja gerente ou diretor.
//    fun registra(gerente: bytebank.model.Gerente) {
//        this.total += gerente.getBonificacao
//    }
//    fun registra(diretor: bytebank.model.Diretor) {
//        this.total += diretor.getBonificacao
//    }

}