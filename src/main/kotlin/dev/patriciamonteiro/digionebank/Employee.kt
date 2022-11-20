package dev.patriciamonteiro.digionebank

abstract class Employee (
    name: String,
    cpf: String,
    val wage: Double
    ): People(name,cpf) {

        protected abstract fun helpCalculation():Double

        override fun toString(): String = """
            Nome: $name
            CPF: $cpf
            Salário: $wage
            Auxilio: ${helpCalculation()}
        """.trimIndent()
}