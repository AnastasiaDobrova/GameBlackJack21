package com.example.gameblackjack21
/*
class Hand internal constructor(//айди не статический, потому-что каждую игру нужно начинать с игрока №1
    private val id: Int
) {
    private val cards = ArrayList<Cards>(4)
    //если мгновенно обнаружился победитель
    val oneMoreCard: Boolean
        get() {
            cards.add(table.cardFromTable)
            return if (valueOfHand == 21) { //если мгновенно обнаружился победитель
                println("The winner is $this")
                println(showCards())
                false
            } else {
                true
            }
        }
    override fun toString(): String {
        return "Player #$id"
    }
    val valueOfHand: Int
        get() {
            var value = 0
            for (i in cards) {
                value += i.valueOfCard
            }
            return value
        }
    fun showCards(): String {
        val result = StringBuilder()
        var value = 0
        for (i in cards) {
            result.append(i.nameOfCard)
            value += i.valueOfCard
        }
        return result.toString() + "And value of those cards is:" + value
    }
    companion object {
        private val table = Table()
    }
    init {
        oneMoreCard //каждому игроку выдаётся по 1 карте вначале
    }
}

 */