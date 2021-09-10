package bytebank.testesCurso1

class TestaLacos {

    fun testaLacos() {
        println("")
        for (i in 1..5) { // range de 1 a 5, inclusivo
            println("Usando for com range de 1 a 5: $i")
        }

        println("")
        for (i in 10 downTo 6 step 2) { // range de 10 a 6, indo de 2 em 2, inclusivo
            println("Usando for com range de 10 a 6 com o downTo e passo 2: $i")
        }

        println("")
        for (i in 10 downTo 0 step 2) { // range de 10 a 6, indo de 2 em 2, inclusivo
            println("Usando for com range de 10 a 0, downTo, passo 2, mas parando no 6 com break: $i")
            if (i == 6) {
                break
            }
        }

        println("")
        for (i in 1 until 5) { // range de 1 a 5, exclusivo.
            println("Usando for de 1 until 5: $i")
        }

        // while funciona igual às outras linguagens
        // temos também o do while
    }

}