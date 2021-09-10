package bytebank.testesCurso1

import bytebank.model.Pessoa

class TestarPessoas {

    fun testarPessoas() {
        val pedro = Pessoa("Pedro", "pedro.diniz@zup.com.br", 28) // usando construtor primário
        println(pedro.nome)
        println(pedro.email)
        println(pedro.idade)

        println()
        pedro.alterarEmail("pgdneto@gmail.com")
        pedro.alterarNome("Pedro Gurgel Diniz Neto")
        println(pedro.email)
        println(pedro.nome)

        println()
        val amanda = Pessoa("Amanda", "amanda_flavia12@hotmail.com") // idade é opcional, possui valor padrão, não declarei
        println(amanda.nome)
        println(amanda.email)
        println(amanda.idade)

        println()
        val icaro = Pessoa(idade = 30, nome = "Ícaro", email = "kinho187@hotmail.com") // usando labels para alterar a ordem
        println(icaro.nome)
        println(icaro.email)
        println(icaro.idade)
    }

}