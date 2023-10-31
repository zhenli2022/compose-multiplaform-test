package view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.NavigationRail
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import models.GameBoard
import models.GameState
import models.Player
import models.Stages
import models.Tile
import utils.PlayerUtil
import utils.StringUtil

@Composable
fun MainScreen() {
    Scaffold {
        val gameState = remember { mutableStateOf(GameState()) }
        val stages: MutableState<Int> = remember { mutableStateOf(0) }
        if(stages.value==0) {
            StartScreen { stages.value++ }
        }
        if(stages.value==1) {
            ArrangeAnimalCardView()
        }
        /*when(stages.value) {
            0 -> {
            }
            1 -> {
            }
            2 -> {
                GameView(gameState)
            }

        }*/
    }
}

@Composable
fun ArrangeAnimalCardView() {
    Column(Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f).fillMaxSize()) {  }
        Row(modifier = Modifier.weight(1f).fillMaxSize()) {  }
        Row(modifier = Modifier.weight(1f).fillMaxSize()) {  }
    }
}