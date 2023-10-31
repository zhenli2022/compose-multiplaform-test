package models

import androidx.compose.runtime.MutableIntState

class Stages(override var intValue: Int = 0) : MutableIntState {
    private val numRounds = 6
    val currentRound: Int
        get() = intValue

    fun isGameFinished(): Boolean {
        return currentRound >= numRounds
    }

    fun startNextRound() {
        if (!isGameFinished()) {
            intValue++
            println("Round $currentRound started.")
        } else {
            println("Game is finished.")
        }
    }

    override fun component1(): Int {
        TODO("Not yet implemented")
    }

    override fun component2(): (Int) -> Unit {
        TODO("Not yet implemented")
    }
}
