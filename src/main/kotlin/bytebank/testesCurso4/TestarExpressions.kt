package bytebank.testesCurso4

import java.lang.NumberFormatException

class TestarExpressions {

    fun testarExpressions() {
        val entrada: String = "1.9"

        // try expression
        val valor: Double? = try {
            entrada.toDouble() // valor atribuido em caso de sucesso
        }
        catch (e: NumberFormatException) {
            println("Problema na conversão")
            e.printStackTrace()
            null // valor atribuido caso seja captada uma exceção
        }

        // mas o if também é uma expression...
        val valorComTaxa: Double? = if (valor != null) {
            valor + 0.1
        }
        else {
            null
        }

        if (valorComTaxa != null) {
            println("valor recebido: $valorComTaxa")
        }
        else {
            println("valor inválido")
        }
    }

}