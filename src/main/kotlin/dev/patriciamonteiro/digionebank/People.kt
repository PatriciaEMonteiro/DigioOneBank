package dev.patriciamonteiro.digionebank

class People {
    var name: String = "Patrícia"
    var cpf: String = "123.456.789-00"
    private set

    constructor()

    fun peopleInfo() = "$name e $cpf"
}
