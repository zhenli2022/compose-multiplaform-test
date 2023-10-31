package utils

import models.Player

object PlayerUtil {

    private fun generateRandomPlayer(): Player {
        val animalCards = StringUtil.randomize3AnimalCards()
        return Player(
            id = StringUtil.randomStringByKotlinRandom(5),
            name = StringUtil.randomStringByKotlinRandom(3),
            selectedAnimalCards = animalCards,
            displayedAnimalCard = StringUtil.randomizeDisplayedAnimalCard(animalCards),
            personalCondition = ""
        )
    }
    fun generateListOfPlayers(player: Player) : List<Player> {
        val players = mutableListOf<Player>()
        players.add(player)
        for(i in 0 until 9){
            players.add(generateRandomPlayer())
        }
        return players.shuffled()
    }
}