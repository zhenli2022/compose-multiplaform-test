package models

data class Auction(
    private val players: List<Player>
) {
    private val bids: MutableList<Bid> = mutableListOf()
    private val boxA = mutableListOf<Tile>()
    private val boxB = mutableListOf<Tile>()
    private var currentPlayerIndex = 0 // Index of the current player

    fun getCurrentPlayer(): Player {
        return players[currentPlayerIndex]
    }
    fun placeBid(player: Player, amount: Int, bet: String) {
        if (amount <= player.coins) {
            val bid = Bid(player, amount, bet)
            bids.add(bid)
            player.coins -= amount

            // Increment the current player's index to move to the next player's turn.
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size
        } else {
            // Handle insufficient coins for the bid.
        }
    }

    fun determineWinningBids(box: String): List<Bid> {
        // Filter bids for the specified box.
        val bidsForBox = bids.filter { it.box == box }

        // Find the maximum bid amount for the specified box.
        val maxBidAmount = bidsForBox.maxByOrNull { it.amount }?.amount

        // Filter the bids with the maximum bid amount.
        return bidsForBox.filter { it.amount == maxBidAmount }
    }

    private fun determinePlayerWithHighestBidAmount(winningBox: List<Bid>): String {
        if (bids.isEmpty()) {
            return "" // No winning player if there are no bids.
        }

        // Find the maximum bid amount.
        val maxBidAmount = bids.maxOf { it.amount }

        // Find the player(s) with the maximum bid amount.
        val winningPlayers = bids.filter { it.amount == maxBidAmount }

        // If there's only one winning player, return that player; otherwise, return null (tie).
        return if (winningPlayers.size == 1) {
            winningPlayers[0].player.id
        } else {
            "" // Handle tie or return all tied players as a list if needed.
        }
    }

    fun determineAuctionWinner(): String {
        // Determine the winning box.
        val bidsForBoxA = determineWinningBids("A")
        val bidsForBoxB = determineWinningBids("B")

        val winningBox = if (bidsForBoxA.size < bidsForBoxB.size) bidsForBoxA else bidsForBoxB

        // Distribute tiles to the winning players.
        val playerId = determinePlayerWithHighestBidAmount(winningBox)

        return playerId
    }
}

data class Bid(
    val player: Player,
    val amount: Int,
    val box: String
)