package bytebank.testesCurso7

class TestarLambdasEFuncoesAnonimas {

    fun testaLambdas() {
        // tipo mais comum de uso do funcional, sintaxe mais enxuta
//    val minhaFuncaoLambda: () -> Unit = {
        val minhaFuncaoLambda = {// posso deixar o () -> Unit implícito
            println("Executa como lambda")
        }
        println(minhaFuncaoLambda)
        println()
        println(minhaFuncaoLambda())

        val minhaFuncaoAnonima : () -> Unit = fun() {
            println("Executa como anônima")
        }
        println(minhaFuncaoAnonima)
        println()
        println(minhaFuncaoAnonima())

        // Funções anônimas e lambdas são pouco reaproveitáveis

        val minhaFuncaoLambdaSoma: (Int, Int) -> Int = { a, b ->
            a + b // em uma Lambda Function, a última linha define o retorno
        }

        // parâmetros que precisam ser declarados mas não são usados devem ser
        // substituidos por um _. Vamos ver na prática
        val minhaFuncaoLambdaUnderline: (Int, Int) -> Int = { _, b ->
            b + 10
        } // repare que precisei declarar dois inteiros, mas só uso o b.
        // Nesse caso, devo "declarar" o outro Int como "_"
        println(minhaFuncaoLambdaUnderline(10000000,8))

        // outro caso é que podemos deixar o tipo do retorno implícito na declaração
        // e explicitar o tipo de parâmetros recebidos
        val minhaFuncaoLambdaSoma2 = { a: Int, b: Int ->
            a + b
        }
        println(minhaFuncaoLambdaSoma2(12, 9))

        println(minhaFuncaoLambdaSoma(1, 3))

        // (salario: Double) aqui significa que é um FunctionType que recebe Double
        val calculaBonificacaoLambda: (salario: Double) -> Double = lambda@ { salario ->
            if (salario > 1000.0) {
                return@lambda salario + 50
            }
            salario + 100.0
        }
        println(calculaBonificacaoLambda(10000.0))

    }

    fun testaFuncoesAnonimas() {

        // a diferença da função anônima pra lambda é que a função anônima
        // precisa de um return statement, ela é mais parecida com as funções OO
        val minhaFuncaoAnonimaSoma = fun(a: Int, b: Int) : Int {
            return a + b
        }
        println(minhaFuncaoAnonimaSoma(100, 11))

        val calculaBonificacaoAnon: (salario: Double) -> Double = fun(salario): Double {
            if (salario > 1000.0) {
                return salario + 50
            }
            return salario + 100
        }
        println(calculaBonificacaoAnon(100.0))

    }

}