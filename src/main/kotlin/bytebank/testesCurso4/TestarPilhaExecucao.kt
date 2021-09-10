package bytebank.testesCurso4

import bytebank.exception.SaldoInsuficienteException

class TestarPilhaExecucao {

    fun testarPilhaExecucao() {

        println("início main")
        funcao1()
        println("fim main")

    }

    fun funcao1() {
        println("inicio funcao1")
        try {
            funcao2()
        }
        catch (e: SaldoInsuficienteException) {
            println(e.message)
            println(e.stackTrace)
            println(e.cause)
            e.printStackTrace()
            println("SaldoInsuficienteException foi pega")
            // só permite a execução da primeira iteração do for
        }
        println("fim funcao1")
    }

    fun funcao2() {
        println("inicio funcao2")
        for (i in 1..5) {
            println(i)
            val endereco = Any()
//        endereco as Endereco
            throw SaldoInsuficienteException()
        }
        println("fim funcao2")
    }

}