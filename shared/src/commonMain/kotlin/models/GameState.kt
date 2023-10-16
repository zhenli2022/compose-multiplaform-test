package models

data class GameState(
    val players: List<Player>,
    val gameBoard: GameBoard,
    val stages: Stages
) {
    // Additional properties and methods can be added to store game-specific information.

    fun getCurrentPlayer(): Player {
        // Implement logic to determine the current player for the current round.
        // You may use the stages object to get the round number and cycle through players.
        return players[stages.getCurrentRound() % players.size]
    }

    fun updateGameState() {
        // Implement logic to update the game state after each round or auction.
        // You can update the board, players, and other game-related data here.
    }

    fun printGameState() {
        // Implement a method to print the current game state for debugging or display purposes.
        println("Current Round: ${stages.getCurrentRound()}")
        println("Current Player: ${getCurrentPlayer().name}")
        // Add more information as needed.
    }
}