package dev.patriciamonteiro.digionebank

fun main(){
    val peoples = People()
    val superBank = Bank(name = "SuperBank", number = 1)

    println(peoples.peopleInfo())
    println(superBank.infoBank())
}