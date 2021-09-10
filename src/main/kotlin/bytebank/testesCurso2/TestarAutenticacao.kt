package bytebank.testesCurso2

import bytebank.model.Cliente
import bytebank.model.Diretor
import bytebank.model.Gerente

class TestarAutenticacao {

    fun testarAutenticacao() {

        val pedro = Gerente("Pedro",
            "074.575.474-01",
            1000.0,
            123)

        val amanda = Diretor("Amanda",
            "018.873.424.17",
            10000.0,
            1234,
            15000.0
        )

        val juanilson = Cliente("Juanilson",
            "111.111.111-11",
            senha = 12345
        )

        println(pedro.autentica(123))
        println(amanda.autentica(1234))
        println(juanilson.autentica(12345))

    }

}