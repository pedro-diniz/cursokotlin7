package bytebank.model

class ContaCorrente(titular: Cliente, numero: Int) : Conta1(titular = titular, numero = numero) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        this.saldo -= valorComTaxa
    }
}