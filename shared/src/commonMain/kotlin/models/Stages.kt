package models

data class Stages(
    private val numRounds: Int = 5
) {
    private var currentRound: Int = 0

    fun isGameFinished(): Boolean {
        return currentRound >= numRounds
    }

    fun startNextRound() {
        if (!isGameFinished()) {
            currentRound++
            println("Round $currentRound started.")
        } else {
            println("Game is finished.")
        }
    }

    fun getCurrentRound(): Int {
        return currentRound
    }
}
