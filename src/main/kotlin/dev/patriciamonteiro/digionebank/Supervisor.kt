package dev.patriciamonteiro.digionebank

class Supervisor (
    name: String,
    cpf: String,
    wage: Double
): Employee(name, cpf, wage){

    override fun helpCalculation() = wage * 0.1

}