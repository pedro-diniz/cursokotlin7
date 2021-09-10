package bytebank.model// Usamos interfaces quando queremos estender comportamentos genéricos
// e que não fazem sentido em serem herdados, pois é um comportamento
// dividido por mais de um tipo de classe (ex: bytebank.model.Funcionario e bytebank.model.Cliente)

// Interfaces não têm construtor
interface Autenticavel {

    // Uma propriedade abstrata garante que a propriedade sempre existirá
        // nas classes que implementarem a interface. Entretanto...
        // ... a propriedade sempre será pública. Por isso, não é uma
        // boa prática ter propriedades abstratas nas interfaces...
        // ... a menos que seja um dado que deve ser compartilhado
//    val senha: Int

    // Métodos não implementados são automaticamente abstratos em uma interface
    fun autentica(senha: Int) : Boolean

    // Métodos podem, entretanto, ter um comportamento padrão
    fun burlaAutenticacao() : Boolean {
        return true
    }

}