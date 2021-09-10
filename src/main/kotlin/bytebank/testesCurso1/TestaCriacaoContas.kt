package bytebank.testesCurso1

import bytebank.model.Conta

class TestaCriacaoContas {

    fun testarCriacaoContas() {
        val conta = Conta()
        println(conta.getTitular())
        conta.setTitular("Alex")
        conta.setNumero(0)
        conta.setSaldo(10.0)
        println(conta.getTitular())

        val conta2 = Conta()
        println(conta2.getTitular())
        conta2.setTitular("Jane")
        conta2.setNumero(1)
        conta2.setSaldo(350.0)
        println(conta2.getTitular())
    }

}