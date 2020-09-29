package com.example.gameblackjack21

class Cards(newSuit: Int, newRank: Int, name: String? = null, image: Int? = 0 ) {
    private var suit: CardSuits? = null
    private var rank: CardRanks? = null
    val nameOfCard: String
        get() = "suit: $suit rank: $rank;\n"

    val valueOfCard: Int
        get() = rank!!.value

    init {
        when (newSuit) {
            0 -> suit = CardSuits.Heart
            1 -> suit = CardSuits.Diamond
            2 -> suit = CardSuits.Club
            3 -> suit = CardSuits.Spade
            else -> {
                suit = null
                println("There is no such suit here")
            }
        }
        when (newRank) {
            0 -> rank = CardRanks.Ace
            1 -> rank = CardRanks.King
            2 -> rank = CardRanks.Queen
            3 -> rank = CardRanks.Jack
            4 -> rank = CardRanks.Six
            5 -> rank = CardRanks.Seven
            6 -> rank = CardRanks.Eight
            7 -> rank = CardRanks.Nine
            8 -> rank = CardRanks.Ten
            else -> {
                rank = null
                println("There is no such rank here")
            }
        }
    }
}

internal enum class CardSuits {
    Heart, Diamond, Club, Spade
}

internal enum class CardRanks(val value: Int) {
    Ace(11,), King(4), Queen(3), Jack(2), Ten(10), Nine(9), Eight(8), Seven(7), Six(6);
}

