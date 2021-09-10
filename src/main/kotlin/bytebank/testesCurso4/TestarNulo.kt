package bytebank.testesCurso4

import bytebank.model.Endereco

class TestarNulo {

    fun testarNulo() {

        // ? significa nullable
        val enderecoNulo : Endereco? = null
//    println(enderecoNulo!!.logradouro) // !! assume que endereco não é nulo. Nesse caso, tomo uma NPE.

//    val enderecoNaoNulo: Endereco = enderecoNulo!! // redundante, pois não declarei Endereco?, apenas Endereco.
//    println(enderecoNaoNulo.logradouro)

        // usar o !! é má prática no Kotlin. Por isso, usamos o safecall ("?")
        // Safe calls precisam ser propagadas em chamadas encadeadas. O código abaixo não funciona.
//    println(enderecoNulo?.logradouro.length)

        // Assim funciona
        println(enderecoNulo?.logradouro?.length)

        // Outra coisa que podemos fazer para utilizar a safe call apenas uma vez é o let
        enderecoNulo?.let { endereco: Endereco ->
            println(endereco.logradouro.length)
            val tamanhoComplemento: Int = endereco.complemento?.length ?: 0 // elvis operator, igual ao if expression
            println(tamanhoComplemento)
        }

        testeSafeCast("")

    }

    fun testeSafeCast(valor: Any) {
        var numero: Int? = 0

        // mistura de safe call com smart cast
        numero = valor as? Int
        println(numero)
    }


}