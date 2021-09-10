package bytebank.testesCurso1

import bytebank.model.Conta

class TestarReferencias {

    fun testarReferencia() {
        println("")
        val conta1 = Conta()
        conta1.setTitular("Joao")

        val conta2 = conta1
        conta2.setTitular("Maria")

        var conta3 = Conta()
        conta3 = conta1
        println(conta1.getTitular())
        println(conta2.getTitular())
        println(conta3.getTitular())
        println("nas referencias, todos os objetos compartilham o mesmo endereco de memoria")

    }

}