package models

data class GameBoard(
    val tiles: List<List<Char?>>? = listOf(
        listOf('a','x','x','x','x'),
        listOf('x','x','x','x','x'),
        listOf('x','x','x','x','x'),
        listOf('x','x','x','x','x'),
        listOf('a','x','x','x','x')
    )
)