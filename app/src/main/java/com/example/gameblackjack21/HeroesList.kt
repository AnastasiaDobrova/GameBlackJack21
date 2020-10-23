package com.example.gameblackjack21

class HeroesList {
    private val heroes = mutableListOf<Heroes>()
    init {
        initialize()
    }
    private fun initialize () {
        heroes.add(Heroes("Angelina Jolie", R.drawable.angelinajolie))
        heroes.add(Heroes("Brad Pitt", R.drawable.bradpitt))
        heroes.add(Heroes("Chuck Norris", R.drawable.chucknorris))
        heroes.add(Heroes("Emma Stone", R.drawable.emmastone))
        heroes.add(Heroes("Jennifer Aniston", R.drawable.jenniferaniston))
        heroes.add(Heroes("Jessica Alba", R.drawable.jessicaalba))
        heroes.add(Heroes("Leonardo DiCaprio", R.drawable.leonardodicaprio))
        heroes.add(Heroes("Marilyn Monroe", R.drawable.marilynmonroe))
        heroes.add(Heroes("Mark Zuckerberg", R.drawable.markzuckerberg))
        heroes.add(Heroes("Selena Gomez", R.drawable.selenagomez))
        heroes.add(Heroes("Snoop Dogg", R.drawable.snoopdogg))
        heroes.add(Heroes("Tom Cruise", R.drawable.tomcruise))
        heroes.add(Heroes("Will Smith", R.drawable.willsmith))

    }
    fun getNewHero() : Heroes {
        if (heroes.size <= 0) {
            initialize()
        }
        val rnd = (0 until heroes.size).random()
        return this.heroes.removeAt(rnd)
    }
}