package utils

import kotlin.random.Random

object StringUtil {
    private val charPool : List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    fun randomStringByKotlinRandom(len: Int) = (1..len)
        .map { Random.nextInt(0, charPool.size).let { charPool[it] } }
        .joinToString("")

    fun randomize3AnimalCards(): List<Char> {
        val oneSetOfAnimalCards = listOf('e','l','m','p','s')
        val deckOfCards = List(oneSetOfAnimalCards.size * 5) {
            oneSetOfAnimalCards[it % oneSetOfAnimalCards.size]
        }
        // Shuffle the deck to randomize the order
        val shuffledDeck = deckOfCards.shuffled()

        // Select 3 random characters from the shuffled deck
        val randomSelection = shuffledDeck.take(3)

        return randomSelection
    }

    fun randomizeDisplayedAnimalCard(selection: List<Char>): Char {
        return selection.shuffled().take(1).first()
    }
}