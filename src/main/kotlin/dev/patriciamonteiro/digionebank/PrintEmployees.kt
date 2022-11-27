package dev.patriciamonteiro.digionebank

class PrintEmployees {
    companion object{
        //Imprimindo Funcionário
        fun report(employee: Manager) = println(employee.toString())
        fun report(employee: Supervisor) = println(employee.toString())
        fun report(employee: Analyst) = println(employee.toString())
        fun report(employee: Client) = println(employee.toString())

    }
}