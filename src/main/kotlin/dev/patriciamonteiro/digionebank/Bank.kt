package dev.patriciamonteiro.digionebank

data class Bank(
    val name: String,
    val number: Int
    ){
    fun infoBank() = "$name - $number"
}
