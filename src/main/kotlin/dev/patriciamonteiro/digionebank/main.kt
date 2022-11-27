package dev.patriciamonteiro.digionebank

fun main(){

    //Declarando, chamando e imprimindo minha data class Bank
    val superBank = Bank(name = "SuperBank", number = 1)
    println(superBank.infoBank())

    //Declarando, chamando e imprimindo minha Enum class ClientType
    val physicalPerson = ClientType.PF
    val legalPerson = ClientType.PJ
    println("${physicalPerson.name} = ${physicalPerson.description}")
    println("${legalPerson.name} = ${legalPerson.description}")

    //Declarando um funcionario do tipo analista
    val analyst = Analyst(name = "Lysa", cpf = "333.333.333-33", wage = 1000.00)
    PrintEmployees.report(analyst)

    //Declarando um funcionario do tipo supervisor
    val supervisor = Supervisor(name = "Marcos", cpf = "444.444.444-44", wage = 2000.00)
    PrintEmployees.report(supervisor)

    //Declarando um funcionario do tipo gerente
    val manager = Manager(name = "Zeus", cpf = "555.555.555-55", wage = 4000.00, password = "senha123")
    PrintEmployees.report(manager)

    //Validando Login do Gerente
    fun testLogin(login: Login) = println(login.singIn())
    testLogin(manager)

    // Classe Cliente
    val client = Client(name = "Ahsoka", cpf = "666.666.666-66", clientType = ClientType.PF, password = "123456")
    PrintEmployees.report(client)
    testLogin(client)

}
