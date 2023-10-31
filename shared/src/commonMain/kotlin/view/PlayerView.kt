package view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import models.Player

@Composable
fun PlayerView(player: Player?, modifier: Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        content = {
            PlayerCardsView(player = player, modifier = Modifier.weight(1f).fillMaxSize())
            AuctionControlsView(modifier = Modifier.weight(5f).fillMaxSize())
        }
    )
}

@Composable
fun PlayerCardsView(player: Player?, modifier: Modifier) {
    Row(
        modifier = modifier,
        content = {
            Row(
                modifier = Modifier.weight(3f).fillMaxSize(),
                content = {
                    Column(modifier = Modifier.weight(2f).fillMaxSize(), content = {

                    })
                    Column(modifier = Modifier.weight(1f).fillMaxSize(), content = { AnimalCard('x') })
                    Column(modifier = Modifier.weight(1f).fillMaxSize(), content = { AnimalCard('x') })
                    Column(modifier = Modifier.weight(1f).fillMaxSize(), content = { AnimalCard('x') })
                }
            )
            Box(
                modifier = Modifier.weight(2f).fillMaxSize(),
                content = {

                }
            )
        }
    )
}

@Composable
fun AuctionControlsView(modifier: Modifier) {
    Box(
        modifier = modifier,
        content = {

        }
    )
}