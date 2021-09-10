package bytebank.testesCurso7

class TestarHOF {

    fun testaHOF() {

        soma(1, 5) { valor ->
            println(valor) // it é o resultado. Resultado dá 6. Mandei printar ele.
            println(valor*3) // defino o comportamento do resultado aqui e dentro da soma
        }
        somaReceiver(1, 5, resultado = {
            println(this)
        })

        //    "".let(::testeRecebeString)

        // higher order function: função que recebe ou que devolve outra função
        // o mais comum é ser uma função que recebe outra função
        //fun testeRecebeString(valor: String) {
        //
        //}

    }

    // implementação de uma HOF. O = {} indica um comportamento vazio padrão,
// interpretado caso ninguém passe uma função como parâmetro do método
    private fun soma(a: Int, b: Int, resultado : (Int) -> Unit = {}) { // recebe a, b e uma função
        println("antes da soma")
        resultado(a + b) // resultado é o it ali de cima.
        println("depois da soma")
    }

    fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
        println("antes da soma")
        var total = a + b
        total.resultado()
        println("depois da soma")
    }

}