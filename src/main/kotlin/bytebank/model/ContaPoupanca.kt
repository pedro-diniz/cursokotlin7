package bytebank.model

class ContaPoupanca(titular: Cliente, numero: Int)
    : Conta1(titular = titular, numero = numero) {

    override fun saca(saque: Double) {
        this.saldo -= saque
    }

}