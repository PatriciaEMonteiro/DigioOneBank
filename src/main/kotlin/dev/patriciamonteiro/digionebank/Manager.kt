package dev.patriciamonteiro.digionebank

class Manager (
    name: String,
    cpf: String,
    wage: Double
): Employee (name = name, cpf = cpf, wage = wage){
    override fun helpCalculation(): Double {
        return wage * 0.4
    }

}