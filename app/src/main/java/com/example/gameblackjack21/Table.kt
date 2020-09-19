package com.example.gameblackjack21

import java.util.*
import kotlin.collections.ArrayList

class Table internal constructor() {
    private val cards = ArrayList<Cards>(36)
    val cardFromTable: Cards
        get() {
            val random = Random()
            val draw = cards[random.nextInt(cards.size)]
            cards.remove(draw)
            return draw
        }

    init {
        for (i in 0..3) {
            for (j in 0..8) {
                cards.add(Cards(i, j))
            }
        }
    }
}