package bytebank.testesCurso7

import bytebank.model.Cliente
import bytebank.model.ContaPoupanca
import bytebank.model.Endereco
import java.util.*

class TestarFuncoesEscopo {

    fun testaFuncoesEscopo() {
        // código OO
        val endereco = Endereco(logradouro = "rua jadm", numero = 1475)
        val enderecoMaiusculoOO = "${endereco.logradouro}, ${endereco.numero}".uppercase(Locale.getDefault())
        println(enderecoMaiusculoOO)

        // código funcional. Aqui, não precisamos usar 2 variáveis
        // aqui, o objeto de contexto padrão é o it, mas nomeamos para endereco
        // para chamar seus membros, precisamos nomear o objeto
        val enderecoMaiusculoLet = Endereco(logradouro = "rua jadm", numero = 3185)
            .let { endereco0 ->
                "${endereco0.logradouro}, ${endereco0.numero}"
                    .uppercase(Locale.getDefault())
            }.let(::println)

        // usando o apply, o objeto da classe Endereco é subentendido como objeto de contexto
        // sendo assim, não precisamos nomeá-lo para acessar seus membros
        // aqui, o retorno é o objeto Endereco
        val enderecoMaiusculoApply = Endereco(logradouro = "rua jadm", numero = 3185)
            .apply {
                "$logradouro, $numero".uppercase(Locale.getDefault())
            }.let(::println)

        // usando o run, o objeto da classe Endereco é subentendido como objeto de contexto
        // sendo assim, não precisamos nomeá-lo para acessar seus membros
        // aqui, o retorno é o resultado da lambda
        val enderecoRun = Endereco(logradouro = "rua jadm", numero = 3185)
            .run {
                "$logradouro, $numero".uppercase(Locale.getDefault())
            }.let { enderecoMaiusculoRun ->
                println("Endereço Run: $enderecoMaiusculoRun")
            }

        val enderecosComComplemento = listOf(
            Endereco(complemento = "casa"),
            Endereco(),
            Endereco(complemento = "apto")
        )
            .filter { endereco1 -> endereco1.complemento?.isNotEmpty() ?: false }
            .let(::println)

        // A real com as scope functions é entender o context object e o return
        // let: it (referenciável), retorna a última linha da lambda
        // also: it (referenciável), retorna o context object
        // "Além disso, faça isso com o objeto." Normalmente faz logs

        // apply: this (implícito), retorna o context object
        // "Aplique essas coisas a esse objeto."

        // run: this (implícito), retorna a última linha da lambda

        // with: this (implícito), retorna a última linha da lambda
        // NÃO É UMA EXTENSÃO DE OBJETO.
        // Recebe um objeto. "Com esse objeto, faça isso"
    }

    fun testaRun() {
        val taxaAnual = 0.05
        val taxaMensal = taxaAnual / 12
        println("taxa mensal $taxaMensal")

        Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1234)
            .let { clienteNovo: Cliente ->
                ContaPoupanca(clienteNovo, 1000)
            }.run {
                deposita(1000.0)
                saldo * taxaMensal
            }.let { rendimentoMensal ->
                println(rendimentoMensal)
            }

        val contaPoupanca = ContaPoupanca(Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1234), 1000)
        contaPoupanca.run {
            deposita(1000.0)
            saldo * taxaMensal
        }.let { rendimentoMensal ->
            println(rendimentoMensal)
        }

        run { // juros compostos
            var saldo = contaPoupanca.saldo
            repeat(12) { indice ->
                saldo += saldo * taxaMensal
            }
            saldo
        }.let { println("Saldo com rendimento atual: $it") }
    }

    fun testaWith() {
        with(Endereco()) {
            logradouro = "rua jadm"
            numero = 1475
            bairro = "ln"
            cidade = "natal"
            estado = "RN"
            cep = "59054-350"
            complemento = "Apartamento"
            completo()
        }.let { println(it) }
    }

}