package models

data class Player (
    val id: String,
    val name: String,
    val displayedAnimalCard: Char,
    val selectedAnimalCards: List<Char>,
    var personalCondition: String,
    var coins: Int = 30
)




