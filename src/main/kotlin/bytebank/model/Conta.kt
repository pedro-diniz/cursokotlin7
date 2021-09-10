package bytebank.model

open class Conta() {

    private var titular = ""
    private var numero = 0
    private var saldo = 0.0

    fun deposita(deposito: Double) {
        saldo += deposito
    }

    open fun saca(saque: Double)  {
        if (saldo >= saque) {
            saldo -= saque
        }
    }

    fun transfere(destino: Conta, transferencia: Double): Boolean {
        if (saldo >= transferencia) {
            saldo -= transferencia
            destino.deposita(transferencia)
            return true
        }
        return false
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(saldo: Double) {
        this.saldo = saldo
    }

    fun getTitular(): String {
        return titular
    }

    fun setTitular(titular: String) {
        this.titular = titular
    }

    fun getNumero(): Int {
        return numero
    }

    fun setNumero(numero: Int) {
        this.numero = numero
    }

}