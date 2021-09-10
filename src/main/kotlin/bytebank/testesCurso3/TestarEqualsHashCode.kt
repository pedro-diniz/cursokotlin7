package bytebank.testesCurso3

import bytebank.model.Endereco

class TestarEqualsHashCode {

    fun testarEqualsHashCode() {
        val endereco = Endereco()
        val enderecoNovo = Endereco()

        println(endereco.equals(endereco))
        println(endereco.equals(enderecoNovo))

        println(endereco.hashCode())
        println(enderecoNovo.hashCode())

        println(endereco.toString())
        println(enderecoNovo.toString())

        // Supondo que uma nova regra de negócio surgiu, e que endereços com
        // o mesmo CEP são considerados iguais. Podemos sobrescrever o
        // equals para averiguar isso.
        val enderecoNovo2 = Endereco(cep = "00000-00")
        val enderecoNovo3 = Endereco(cep = "00000-00")

        println(enderecoNovo2.equals(enderecoNovo3))
        println(enderecoNovo2.hashCode())
        println(enderecoNovo3.hashCode())

        fun imprime(valor: Any) : Any{
            println(valor)
            return valor
        }

    }

}




