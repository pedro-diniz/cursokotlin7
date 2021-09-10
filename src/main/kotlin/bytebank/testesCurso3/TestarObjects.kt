package bytebank.testesCurso3

import bytebank.model.Autenticavel
import bytebank.model.Conta1
import bytebank.model.totalContas

class TestarObjects {

    fun testarObjects() {
        // objeto anônimo, simula um Cliente sem ser um, Object Expression
        val fran = object : Autenticavel {
            val nome: String = "Fran"
            val cpf: String = "111.111.111-11"
            val senha: Int = 10
            override fun autentica(senha: Int): Boolean {
                if (this.senha == senha) {
                    return true
                }
                return false
            }
        }

        println("Total de contas pela variável global na Conta: $totalContas")
        println("Total de contas pela Object Declaration: ${Conta1.total}")
    }

}