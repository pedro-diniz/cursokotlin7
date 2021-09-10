package bytebank.model

import bytebank.exception.FalhaAutenticacaoException
import bytebank.exception.SaldoInsuficienteException

// funcionaria como uma "variável global". Pq ela não tá na main?
    // Pq na main geral tem acesso. Faz sentido que o contador de contas
    // esteja na main ou na classe abstrata de Contas? Exatamente.
// Mesmo assim, qualquer outra classe tem acesso a isso aqui. Perigoso.
var totalContas = 0

abstract class Conta1(private val titular: Cliente, numero: Int) : Autenticavel {

    private var numero = 0
    var saldo = 0.0
        protected set // privado, mas acessível pelas classes filhas

    fun deposita(deposito: Double) {
        saldo += deposito
    }

    abstract fun saca(saque: Double)

    fun transfere(destino: Conta1, transferencia: Double, senha: Int) {
        if (saldo < transferencia) {
            throw SaldoInsuficienteException("Saldo insuficiente. Saldo Atual: R$ $saldo. Valor a subtrair: R$ $transferencia")
        }

        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }

        saldo -= transferencia
        destino.deposita(transferencia)

    }

    // Object Declaration
    // Cria um singleton que carrega o valor ao longo do runtime inteiro
    // Ao definir o private set para que o exterior não o acesse,
        // impedimos o acesso pela própria classe Conta
    // Por isso, definimos essa Object Declaration como um Companion Object
    // O Companion Object age como se fosse um atributo da Conta,
        // mas sem ser. Repare que conseguimos acessar o total sem nenhuma
        // outra referência.
    // Posso deixá-lo sem nome, mas por baixo dos panos, o nome é Companion
    companion object {
        var total = 0
            private set
    }

    // executa a cada nova instância acessada da classe
    init {
        totalContas++
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

}