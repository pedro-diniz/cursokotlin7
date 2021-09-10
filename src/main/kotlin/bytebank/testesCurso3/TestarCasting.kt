package bytebank.testesCurso3

import bytebank.model.Auxiliar
import bytebank.model.Endereco
import bytebank.model.Funcionario

class TestarCasting {

    fun testarCasting() {
        imprime(1)
        imprime(1.0)
        imprime("fa")
        imprime(Any()) // imprime um java object
        val teste: Any = imprime(Endereco())
        println(teste)
        println(fazCasting(Auxiliar("", "", 1.0)))
        println(fazSmartCasting(Auxiliar("", "", 1.0)))
        println(fazSmartCasting(0))
        println(fazCasting("quebrou"))


    }

    fun imprime(valor: Any) : Any{
        println(valor)
        return valor
    }

    // Faz o casting de Any, super genérico, pra Funcionario
// Altamente quebrável
    fun fazCasting(funcionario: Any) {
        funcionario as Funcionario
        imprime(funcionario)
    }

    // Verifica se o casting e possível e, se for, o faz.
    fun fazSmartCasting(funcionario: Any) {
        if (funcionario is Funcionario) {
            imprime(funcionario)
        }
    }

}