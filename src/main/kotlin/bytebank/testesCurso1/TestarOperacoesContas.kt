package bytebank.testesCurso1

import bytebank.model.Conta

class TestarOperacoesContas {

    fun testarOperacoes() {
        val contaAlex = Conta()
        println("Saldo inicial: ${contaAlex.getSaldo()}")
        println("Depositando")
        contaAlex.deposita(50.0)
        println("Saldo pós-depósito: ${contaAlex.getSaldo()}")

        println("\nSacando")
        contaAlex.saca(40.0)
        println("Saldo pós-saque: ${contaAlex.getSaldo()}")

        val contaFran = Conta()
        contaFran.deposita(500.0)
        println("Saldo de Alex antes da transferência: ${contaAlex.getSaldo()}")
        println("Saldo de Fran antes da transferência: ${contaFran.getSaldo()}")
        if (contaFran.transfere(contaAlex, 200.0)) {
            println("Transferência bem sucedida")
            println("Saldo de Alex depois da transferência: ${contaAlex.getSaldo()}")
            println("Saldo de Fran depois da transferência: ${contaFran.getSaldo()}")
        }
        else {
            println("Saldo insuficiente")
        }
    }

}