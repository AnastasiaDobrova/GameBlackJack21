package com.example.gameblackjack21

class CardsList {
    private val cards = mutableListOf<Cards>()
    init {
        initialize()
    }
    private fun initialize () {
        //class Cards (var name: String, var image: Int, var imageBack: Int, var value: Int)

        cards.add(Cards("6 of Spade", R.drawable.spadesix, R.drawable.purpleback, 6 ))
        cards.add(Cards("7 of Spade", R.drawable.spadeseven, R.drawable.purpleback, 7 ))
        cards.add(Cards("8 of Spade", R.drawable.spadeeight, R.drawable.purpleback, 8 ))
        cards.add(Cards("9 of Spade", R.drawable.spadenine, R.drawable.purpleback, 9 ))
        cards.add(Cards("10 of Spade", R.drawable.spadeten, R.drawable.purpleback, 10 ))
        cards.add(Cards("Jack of Spade", R.drawable.spadejack, R.drawable.purpleback, 2 ))
        cards.add(Cards("Queen of Spade", R.drawable.spadequeen, R.drawable.purpleback, 3 ))
        cards.add(Cards("King of Spade", R.drawable.spadeking, R.drawable.purpleback, 4 ))
        cards.add(Cards("Ace of Spade", R.drawable.spadeace, R.drawable.purpleback, 11 ))

        cards.add(Cards("6 of Сlub", R.drawable.clubsix, R.drawable.purpleback, 6 ))
        cards.add(Cards("7 of Сlub", R.drawable.clubseven, R.drawable.purpleback, 7 ))
        cards.add(Cards("8 of Сlub", R.drawable.clubeight, R.drawable.purpleback, 8 ))
        cards.add(Cards("9 of Сlub", R.drawable.clubnine, R.drawable.purpleback, 9 ))
        cards.add(Cards("10 of Сlub", R.drawable.clubten, R.drawable.purpleback, 10 ))
        cards.add(Cards("Jack of Сlub", R.drawable.clubjack, R.drawable.purpleback, 2 ))
        cards.add(Cards("Queen of Сlub", R.drawable.clubqueenthree, R.drawable.purpleback, 3 ))
        cards.add(Cards("King of Сlub", R.drawable.clubking, R.drawable.purpleback, 4 ))
        cards.add(Cards("Ace of Сlub", R.drawable.clubace, R.drawable.purpleback, 11 ))

        cards.add(Cards("6 of Diamond", R.drawable.diamondsix, R.drawable.purpleback, 6 ))
        cards.add(Cards("7 of Diamond", R.drawable.diamondseven, R.drawable.purpleback, 7 ))
        cards.add(Cards("8 of Diamond", R.drawable.diamondeight, R.drawable.purpleback, 8 ))
        cards.add(Cards("9 of Diamond", R.drawable.diamondnine, R.drawable.purpleback, 9 ))
        cards.add(Cards("10 of Diamond", R.drawable.diamondten, R.drawable.purpleback, 10 ))
        cards.add(Cards("Jack of Diamond", R.drawable.diamondjack, R.drawable.purpleback, 2 ))
        cards.add(Cards("Queen of Diamond", R.drawable.diamondqueen, R.drawable.purpleback, 3 ))
        cards.add(Cards("King of Diamond", R.drawable.diamondking, R.drawable.purpleback, 4 ))
        cards.add(Cards("Ace of Diamond", R.drawable.diamondace, R.drawable.purpleback, 11 ))

        cards.add(Cards("6 of Heart", R.drawable.heart6, R.drawable.purpleback, 6 ))
        cards.add(Cards("7 of Heart", R.drawable.heartseven, R.drawable.purpleback, 7 ))
        cards.add(Cards("8 of Heart", R.drawable.hearteight, R.drawable.purpleback, 8 ))
        cards.add(Cards("9 of Heart", R.drawable.heartnine, R.drawable.purpleback, 9 ))
        cards.add(Cards("10 of Heart", R.drawable.heartten, R.drawable.purpleback, 10 ))
        cards.add(Cards("Jack of Heart", R.drawable.heartjack, R.drawable.purpleback, 2 ))
        cards.add(Cards("Queen of Heart", R.drawable.heartqueen, R.drawable.purpleback, 3 ))
        cards.add(Cards("King of Heart", R.drawable.heartking, R.drawable.purpleback, 4 ))
        cards.add(Cards("Ace of Heart", R.drawable.heartace, R.drawable.purpleback, 11 ))


    }
    fun getNewCard() : Cards {
        if (cards.size <= 0) {
            initialize()
        }
        val rnd = (0 until cards.size).random()
        return this.cards.removeAt(rnd)
    }
}

