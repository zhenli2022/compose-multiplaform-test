package models

data class Player (
    val id: String,
    val name: String,
    val selectedAnimalCards: List<AnimalCard>,
    var personalCondition: String = "",
    var coins: Int = 30
)





