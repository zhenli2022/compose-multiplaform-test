package view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import models.GameState

@Composable
fun OtherPlayersView(gameState: GameState, modifier: Modifier) {
    val size = gameState.players?.size
    val numRows = 2
    val numColumns = 4
    val currentPlayer = gameState.getCurrentPlayer()
    val otherPlayers = gameState.players?.filterNot { it.id == currentPlayer?.id }
    Row(
        modifier = modifier.fillMaxSize()
    ) {
        // Current player view
        Box (
            modifier = Modifier.weight(1f).fillMaxSize(),
            content = {
                AnimalCard(currentPlayer?.displayedAnimalCard)
                Text(modifier = Modifier.align(Alignment.BottomCenter),text = currentPlayer?.name.toString())
            }
        )
        // Other players view
        Column (
            modifier = Modifier.weight(5f).fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            content = {
                for(row in 0 until numRows) {
                    Row(
                        modifier = Modifier.weight(1f).fillMaxSize(),
                        content = {
                            for(column in 0 until numColumns) {
                                val player = otherPlayers?.get(row * numColumns + column)
                                Box(modifier = Modifier.weight(1f).fillMaxSize()) {
                                    AnimalCard(player?.displayedAnimalCard)
                                    Text(modifier = Modifier.align(Alignment.BottomCenter),text = player?.name.toString())
                                }
                            } // End for loop for column
                        }
                    )
                } // End for loop for row
            }
        )
    }

}

@Composable
fun GridView(gameBoardValues: List<List<Char?>>, modifier: Modifier) {
    val numRow = 5
    val numColumn = 5
    // Create a 5x5 grid
    Column(
        modifier = modifier,
        content = {
            for(row in 0 until numRow) {
                Row (
                    modifier =  Modifier.weight(1f).fillMaxSize(),
                    content = {
                        for(column in 0 until  numColumn) {
                            Box(
                                modifier = Modifier.weight(1f).fillMaxSize(),
                                content = {
                                    AnimalCard(gameBoardValues[row][column])
                                    Text(text = gameBoardValues[row][column].toString())
                                }
                            )
                        }
                    }
                )
            }
        }
    )
}