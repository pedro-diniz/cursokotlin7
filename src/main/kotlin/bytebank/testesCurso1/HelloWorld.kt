package bytebank.testesCurso1

class HelloWorld {

    fun helloWorld(): Double {
        // var: pode ter seu valor alterado
        // val: não pode ter seu valor alterado

        // O Kotlin interfere que o valor aqui é uma String
        // O Kotlin não nos deixa inicializar variáveis vazias
        // O Kotlin sinaliza quando uma variável com um valor "x" é inicializada e não manuseamos o "x" antes de alterá-lo
        var titular = "Alex"
        titular = "Alex Felipe"

        val numeroConta = 1000
        var saldo = 0.0
        saldo += 200

        println(titular) // println normal
        println("titular $titular") // println concatenado usando string template
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")

        return saldo
    }

}