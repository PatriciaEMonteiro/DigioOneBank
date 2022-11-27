package dev.patriciamonteiro.digionebank

class Client(
    name: String,
    cpf: String,
    val clientType: ClientType,
    val password: String
) : People(name, cpf), Login {
    override fun singIn(): Boolean = "123456" == password

    override fun toString(): String = """
        Nome: $name
        CPF: $cpf
        Tipo: ${clientType.description}
    """.trimIndent()

}