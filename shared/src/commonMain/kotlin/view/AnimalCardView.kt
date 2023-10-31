package view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun AnimalCard(char: Char?) {
    val animal = if(char !in listOf('e','l','m','p','s')) {
        'x'
    } else {
        char
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
        content = {
            // Content of each cell
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource("$animal.xml"),
                contentDescription = null,
                contentScale = ContentScale.Inside
            )
        }
    )
}