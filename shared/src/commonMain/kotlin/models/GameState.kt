package models

import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.remember

data class GameState(
    private val currentPlayer: Player? = null,
    val players: List<Player>? = null,
    val gameBoard: GameBoard? = null,
) {
    // Additional properties and methods can be added to store game-specific information.
//    private val stages: Stages = Stages()

    fun getCurrentPlayer(): Player? {
        // Implement logic to determine the current player for the current round.
        // You may use the stages object to get the round number and cycle through players.
        return currentPlayer
    }

    fun updateGameState() {
        // Implement logic to update the game state after each round or auction.
        // You can update the board, players, and other game-related data here.
    }

    fun printGameState() {
        // Implement a method to print the current game state for debugging or display purposes.
        println("Current Player: ${getCurrentPlayer()?.name}")
        // Add more information as needed.
    }
}