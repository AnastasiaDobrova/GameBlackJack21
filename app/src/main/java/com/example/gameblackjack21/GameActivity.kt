package com.example.gameblackjack21

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_game.*
import kotlin.random.Random
import kotlin.random.nextInt

class GameActivity : AppCompatActivity() {

    private val cardsList = CardsList()
    private var currentCard1 : Cards? = null
    private var currentCard2 : Cards? = null
    private var currentCard3 : Cards? = null
    private var currentCard4 : Cards? = null
    private var currentCard5 : Cards? = null
    private var currentCard1Hero : Cards? = null
    private var currentCard2Hero : Cards? = null
    private var currentCard3Hero : Cards? = null
    private var currentCard4Hero : Cards? = null
    private var currentCard5Hero : Cards? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val intent = intent
        val name1View = intent.getStringExtra("Player1")
        val name2View = intent.getStringExtra("Player2")

        namePlayer1.text = "Player: $name1View"
        namePlayer2.text = "Player: $name2View"
        gameText.text = "$name1View and $name2View you are welcome to the game!"
        yesPlayButton.visibility = View.INVISIBLE

        var valuePlayer1: Int
        var valuePlayer2: Int
        var card3Player1Value: Int
        var card4Player1Value: Int
        var card5Player1Value: Int
        var card3Player2Value = 0
        var card4Player2Value = 0
        var card5Player2Value = 0

        val n = Random.nextInt(17..21)

        currentCard1 = cardsList.getNewCard()                                                                                 //Player card1
        val card1Player1Value: Int = currentCard1!!.value
        valuePlayer1 = card1Player1Value
        card1Player1.setImageResource(currentCard1!!.image)

        currentCard2 = cardsList.getNewCard()                                                                                 //Player card2
        val card2Player1Value: Int = currentCard2!!.value
        card2Player1.setImageResource(currentCard2!!.image)
        valuePlayer1 = card2Player1Value + card1Player1Value
        namePlayer1.text = "$name1View you have $valuePlayer1 points. Do you want to take a card?"

        currentCard1Hero = cardsList.getNewCard()                                                                                 //Hero card1
        val card1Player2Value: Int = currentCard1Hero!!.value
        valuePlayer2 = card1Player2Value
        card1Player2.setImageResource(currentCard1Hero!!.image)
        namePlayer2.text = "Player $name2View"

        currentCard2Hero = cardsList.getNewCard()                                                                                 //Hero card2
        val card2Player2Value: Int = currentCard2Hero!!.value
        valuePlayer2 = card2Player2Value + card1Player2Value
        card2Player2.setImageResource(currentCard2Hero!!.imageBack)

        yesButton1.setOnClickListener {
            currentCard3 = cardsList.getNewCard()                                                                                 //Player card3
            card3Player1Value = currentCard3!!.value
            card3Player1.setImageResource(currentCard3!!.image)
            valuePlayer1 = card3Player1Value +card2Player1Value + card1Player1Value
            namePlayer1.text = "$name1View you have $valuePlayer1 points. Do you want to take a card?"
            if (valuePlayer2<n) {
                currentCard3Hero = cardsList.getNewCard()                                                                                 //Hero card3
                card3Player2Value = currentCard3Hero!!.value
                card3Player2.setImageResource(currentCard3Hero!!.imageBack)
                valuePlayer2 = card1Player2Value +card2Player2Value + card3Player2Value
                }

            yesButton1.setOnClickListener {
                currentCard4 = cardsList.getNewCard()                                                                                 //Player card4
                card4Player1Value = currentCard4!!.value
                valuePlayer1 = card4Player1Value +card3Player1Value +card2Player1Value + card1Player1Value
                namePlayer1.text = "$name1View you have $valuePlayer1 points. Do you want to take a card?"
                card4Player1.setImageResource(currentCard4!!.image)
                    if (valuePlayer2<n) {
                        currentCard4Hero = cardsList.getNewCard()                                                                                 //Hero card4
                        card4Player2Value = currentCard4Hero!!.value
                        card4Player2.setImageResource(currentCard4Hero!!.imageBack)
                        valuePlayer2 = card4Player2Value +card3Player2Value +card2Player2Value + card1Player2Value
                        }
                yesButton1.setOnClickListener {
                    currentCard5 = cardsList.getNewCard()                                                                                 //Player card5
                    card5Player1Value = currentCard5!!.value
                    valuePlayer1 = card5Player1Value + card4Player1Value +card3Player1Value +card2Player1Value + card1Player1Value
                    namePlayer1.text = "$name1View you have $valuePlayer1 points. Do you want to take a card?"
                    card5Player1.setImageResource(currentCard5!!.image)
                    if (valuePlayer2<n && valuePlayer2<19) {
                        currentCard5Hero = cardsList.getNewCard()                                                                                 //Hero card5
                        card5Player2Value = currentCard5Hero!!.value
                        card5Player2.setImageResource(currentCard5Hero!!.imageBack)
                        valuePlayer2 = card5Player2Value + card4Player2Value +card3Player2Value +card2Player2Value + card1Player2Value
                    }
                    yesButton1.setOnClickListener {
                        noButton1
                    }
                }
            }
        }

        noButton1.setOnClickListener {
            yesPlayButton.visibility = View.VISIBLE
            card2Player2.setImageResource(currentCard2Hero!!.image)
            if(card3Player2Value !=0) card3Player2.setImageResource(currentCard3Hero!!.image)
            if(card4Player2Value !=0) card4Player2.setImageResource(currentCard4Hero!!.image)
            if(card5Player2Value !=0) card5Player2.setImageResource(currentCard5Hero!!.image)

            if (card3Player2Value == 0 && valuePlayer2<18 ) {
                currentCard3Hero = cardsList.getNewCard()                                                                                 //Hero card3
                card3Player2Value = currentCard3Hero!!.value
                card3Player2.setImageResource(currentCard3Hero!!.image)
                valuePlayer2 = card1Player2Value +card2Player2Value + card3Player2Value
            }

            if (card4Player2Value == 0 && card3Player2Value != 0 && valuePlayer2<18) {
                    currentCard4Hero = cardsList.getNewCard()                                                                                 //Hero card4
                    card4Player2Value = currentCard4Hero!!.value
                    card4Player2.setImageResource(currentCard4Hero!!.image)
                    valuePlayer2 = card4Player2Value +card3Player2Value +card2Player2Value + card1Player2Value
            }
            if (card5Player2Value == 0 && card4Player2Value != 0 && valuePlayer2<19) {
                currentCard5Hero = cardsList.getNewCard()                                                                                 //Hero card5
                card5Player2Value = currentCard5Hero!!.value
                card5Player2.setImageResource(currentCard5Hero!!.image)
                valuePlayer2 = card5Player2Value + card4Player2Value +card3Player2Value +card2Player2Value + card1Player2Value
            }
            namePlayer1.text = "$name1View you have $valuePlayer1 points."
            namePlayer2.text = "$name2View has $valuePlayer2 points."
            when {
                valuePlayer1 == 21 && valuePlayer1 != valuePlayer2 -> winView.text = "$name1View won!"
                valuePlayer2 == 21 && valuePlayer1 != valuePlayer2 -> winView.text = "$name2View won!"
                valuePlayer1 == valuePlayer2 -> winView.text = "You have played with draw!"

                valuePlayer1 < valuePlayer2 && valuePlayer2 > 21 -> winView.text = "$name1View won!"
                valuePlayer1 < valuePlayer2 && valuePlayer2 < 21 -> winView.text = "$name2View won!"
                valuePlayer2 < valuePlayer1 && valuePlayer1 > 21 -> winView.text = "$name2View won!"
                valuePlayer2 > valuePlayer1 && valuePlayer1 < 21 -> winView.text = "$name1View won!"


            }
            yesPlayButton.setOnClickListener {
                startActivity(intent)
            }
        }
    }
}







