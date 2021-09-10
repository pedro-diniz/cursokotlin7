package bytebank.testesCurso1

class TestaCopias {

    fun testarCopia() {
        println("")
        val numeroX = 10
        var numeroY = numeroX
        numeroY++

        println("numeroX: $numeroX")
        println("numeroY: $numeroY")
        println("nas cópias, alterações na 2a variável estão contidas somente na 2a variável")
    }

}