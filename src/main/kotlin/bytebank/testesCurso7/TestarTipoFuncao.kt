package bytebank.testesCurso7

class TestarTipoFuncao {

    fun testaTipoFuncaoReferencia() {
        // () é o tipo função (Function Type)
        // -> divide a função do retorno
        // Unit é o tipo do retorno
        // ::teste é a assinatura do método, necessária para compilar (???)
        // aqui, o método teste é passado por referência
        val minhaFuncao: () -> Unit = ::teste

        // executa o teste() e printa um Unit
        println(minhaFuncao())

    }

    // a programação funcional preza muito por imutabilidade
    private fun teste() {
        println("executa teste")
    }

    private class Teste : () -> Unit {
        override fun invoke() {
            println("executa invoke do teste")
        }

    }

    // é como se colocássemos uma função dentro de uma variável
    // e a própria variável vira uma função (?)

    fun testaTipoFuncaoClasse() {
        // aqui, a classe teste já tem uma assinatura pelo objeto Teste que
        // implementa uma função pelo invoke
        val minhaFuncaoClasse : () -> Unit = Teste()
        println(minhaFuncaoClasse) // retorna o endereço em memória

        println(minhaFuncaoClasse()) // executa o invoke e retorna Unit
    }

    fun testaTipoReferenciaSoma() {
        val minhaFuncaoSoma : (Int, Int) -> Int = ::soma
        println(minhaFuncaoSoma(5, 10))
    }

    fun testaTipoFuncaoClasseSoma() {
        val minhaFuncaoClasseSoma : (Int, Int) -> Int = TesteSoma()
        println(minhaFuncaoClasseSoma(4, 7))
    }

    private fun soma(a: Int, b: Int) : Int {
        return a + b
    }

    private class TesteSoma : (Int, Int) -> Int {
        override fun invoke(p1: Int, p2: Int): Int {
            return p1 + p2
        }

    }

}