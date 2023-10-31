package view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import models.GameState

@Composable
fun GameView(gameState: MutableState<GameState>) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(
            modifier = Modifier.weight(1f),
            content = {
                OtherPlayersView(gameState.value, Modifier.weight(1f))
                GridView(gameState.value.gameBoard?.tiles!!, Modifier.weight(2f))
            }
        )

        PlayerView(gameState.value.getCurrentPlayer(), Modifier.weight(1f))
    }
}