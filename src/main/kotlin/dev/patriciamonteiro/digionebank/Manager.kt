package dev.patriciamonteiro.digionebank

class Manager (
    name: String,
    cpf: String,
    wage: Double,
    val password: String
): Employee (name = name, cpf = cpf, wage = wage), Login {
    override fun helpCalculation(): Double = wage * 0.4
    override fun singIn(): Boolean = "senha1234" == password

}