package bytebank.testesCurso2

import bytebank.model.Analista
import bytebank.model.Auxiliar
import bytebank.model.CalculadoraBonificacao
import bytebank.model.Diretor
import bytebank.model.Gerente

class TestarFuncionarios {

    fun testarFuncionarios() {

        // val alex = bytebank.model.Funcionario( // não pode mais ser implementado, pois, bytebank.model.Funcionario é abstrato
        var alex = Analista(
            nome = "Alex",
            cpf = "111.111.111-11",
            salario = 1000.0,
            senha = 123
        )

        println(alex.toString())
        println(alex.getBonificacao)

        val maria = Analista(
            nome = "Maria",
            cpf = "444.444.444-44",
            salario = 2000.0,
            senha = 1234
        )

        println(maria.toString())
        println(maria.getBonificacao)
        println(maria.autentica(1234))
        println(maria.autentica(123))

        val fran = Gerente(
            nome = "Fran",
            cpf = "222.222.222-22",
            salario = 2000.0,
            senha = 1234
        )

        println(fran.toString())
        println(fran.getBonificacao)
        println(fran.autentica(1234))
        println(fran.autentica(123))

        val igor = Diretor(
            nome = "Igor",
            cpf = "333.333.333-33",
            salario = 15000.0,
            senha = 12345678,
            plr = 20000.0
        )

        println(igor.toString())
        println(igor.getBonificacao)
        println(igor.autentica(1234))
        println(igor.autentica(12345678))

        val julia = Auxiliar(
            "Júlia",
            "555.555.555-55",
            1200.0
        )

        println(julia.toString())
        println(julia.getBonificacao)

        val calculadoraBonificacao = CalculadoraBonificacao()
        calculadoraBonificacao.registra(alex)
        calculadoraBonificacao.registra(fran)
        calculadoraBonificacao.registra(igor)
        calculadoraBonificacao.registra(maria)
        calculadoraBonificacao.registra(julia)

        println(calculadoraBonificacao.total)

    }

}