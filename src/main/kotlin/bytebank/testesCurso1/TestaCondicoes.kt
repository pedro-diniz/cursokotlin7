package bytebank.testesCurso1

class TestaCondicoes {

    fun testaCondicoes(saldo: Double) { // passagens de parâmetro precisam ser tipadas
        if (saldo > 0.0) {
            println("conta é positiva")
        }
        else if (saldo == 0.0) {
            println("conta é neutra")
        }
        else {
            println("conta é negativa")
        }

        when {
            saldo > 0.0 -> println("conta é positiva")
            saldo == 0.0 -> println("conta é neutra")
            else -> println("conta é negativa")
        }
    }

}