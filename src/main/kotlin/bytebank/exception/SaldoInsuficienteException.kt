package bytebank.exception

// não queremos estender Throwable, pois Throwable é herdado por Error e por Exception
// Errors são problemas diretamente com a JVM, e não com o nosso código
// Por isso, devemos estender de Exception
// Além disso, queremos poder receber uma mensagem como parâmetro.
    // Seria bom, também, ter uma mensagem padrão.
class SaldoInsuficienteException(mensagem: String = "O saldo é insuficiente") : Exception(mensagem)