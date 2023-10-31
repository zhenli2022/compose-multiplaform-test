package models

data class Bid(
    val player: Player,
    val amount: Int,
    val box: String
)