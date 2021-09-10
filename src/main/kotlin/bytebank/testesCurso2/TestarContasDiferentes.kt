package bytebank.testesCurso2

import bytebank.exception.FalhaAutenticacaoException
import bytebank.exception.SaldoInsuficienteException
import bytebank.model.Cliente
import bytebank.model.ContaCorrente
import bytebank.model.ContaPoupanca

class TestarContasDiferentes {

    fun testarContasDiferentes() {

        val pedro = Cliente("Pedro", "074.575.474-01", senha = 1234)

        val contaCorrente = ContaCorrente(pedro, 1000)
        contaCorrente.deposita(1000.0)
        contaCorrente.saca(100.0)

        val amanda = Cliente("Amanda", "017.873.424-17", senha = 4321)

        val contaPoupanca = ContaPoupanca(amanda, 1000)
        contaPoupanca.deposita(1000.0)
        contaPoupanca.saca(100.0)

        println("Saldo CC pós depósito ${contaCorrente.saldo}")
        println("Saldo CP pós depósito ${contaPoupanca.saldo}")

        contaCorrente.transfere(contaPoupanca, 100.0, 1234)
        println("Saldo CC pós transferência ${contaCorrente.saldo}")
        println("Saldo CP pós transferência ${contaPoupanca.saldo}")

        try {
            contaPoupanca.transfere(contaCorrente, 1000.0, 4321)
            println("Saldo CC pós ré-transferência ${contaCorrente.saldo}")
            println("Saldo CP pós ré-transferência ${contaPoupanca.saldo}")
        }
        catch (e: SaldoInsuficienteException) {
            e.printStackTrace()
            println("Captei uma SaldoInsuficienteException")
        }
        catch (e: FalhaAutenticacaoException) {
            e.printStackTrace()
            println("Captei uma FalhaAutenticacaoException")
        } // exception genérica adicionada ao fim, caso tenhamos uma exceção que não se enquadre nas 2 primeiras
        catch (e: Exception) {
            e.printStackTrace()
            println("Exceção inesperada")
        }

    }

}