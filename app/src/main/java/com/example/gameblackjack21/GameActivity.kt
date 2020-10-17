package com.example.gameblackjack21

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_players.view.*
import kotlin.random.Random
import kotlin.random.nextInt

class GameActivity : AppCompatActivity() {

    val cardsList = CardsList()
    var currentCard1 : Cards? = null
    var currentCard2 : Cards? = null
    var currentCard3 : Cards? = null
    var currentCard4 : Cards? = null
    var currentCard5 : Cards? = null
    var currentCard1Hero : Cards? = null
    var currentCard2Hero : Cards? = null
    var currentCard3Hero : Cards? = null
    var currentCard4Hero : Cards? = null
    var currentCard5Hero : Cards? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val intent = intent
        val name1View = intent.getStringExtra("Player1")
        val name2View = intent.getStringExtra("Player2")

        namePlayer1.text = "Player: "+name1View+""
        namePlayer2.text = "Player: "+name2View+""
        gameText.text = "$name1View and $name2View you are welcome to the game!"

        var valuePlayer1: Int
        var valuePlayer2 = 0
        var card1Player1Value: Int
        var card2Player1Value = 0
        var card3Player1Value = 0
        var card4Player1Value = 0
        var card5Player1Value = 0
        var card1Player2Value = 0
        var card2Player2Value = 0
        var card3Player2Value = 0
        var card4Player2Value = 0
        var card5Player2Value = 0

        winView.setOnClickListener {
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Do you want to play again?")
                .setCancelable(false)
                .setPositiveButton("Play game with opponent!", DialogInterface.OnClickListener {
                        dialog, id -> startActivity(intent)
                })
                .setNegativeButton("Play with another celebrity!", DialogInterface.OnClickListener {
                        dialog, id -> onRestart()
                })
            val alert = dialogBuilder.create()
            alert.setTitle("You won!")
            alert.show()
        }

        val n = Random.nextInt(17..21)

        currentCard1 = cardsList.getNewCard()                                                                                 //Player card1
        card1Player1Value = currentCard1!!.value
        valuePlayer1 = card1Player1Value
        card1Player1.setImageResource(currentCard1!!.image)

        currentCard2 = cardsList.getNewCard()                                                                                 //Player card2
        card2Player1Value = currentCard2!!.value
        card2Player1.setImageResource(currentCard2!!.image)
        valuePlayer1 = card2Player1Value + card1Player1Value
        namePlayer1.text = name1View + " you have " + valuePlayer1.toString() + " points. Do you want to take a card?"

        currentCard1Hero = cardsList.getNewCard()                                                                                 //Hero card1
        card1Player2Value = currentCard1Hero!!.value
        valuePlayer2 = card1Player2Value
        card1Player2.setImageResource(currentCard1Hero!!.image)
        namePlayer2.text = "Player " + name2View

        currentCard2Hero = cardsList.getNewCard()                                                                                 //Hero card2
        card2Player2Value = currentCard2Hero!!.value
        valuePlayer2 = card2Player2Value + card1Player2Value
        card2Player2.setImageResource(currentCard2Hero!!.imageBack)

        yesButton1.setOnClickListener {
            currentCard3 = cardsList.getNewCard()                                                                                 //Player card3
            card3Player1Value = currentCard3!!.value
            card3Player1.setImageResource(currentCard3!!.image)
            valuePlayer1 = card3Player1Value +card2Player1Value + card1Player1Value
            namePlayer1.text = name1View + " you have " + valuePlayer1.toString() + " points. Do you want to take a card?"
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
                namePlayer1.text = name1View + " you have " + valuePlayer1.toString() + " points. Do you want to take a card?"
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
                    namePlayer1.text = name1View + " you have " + valuePlayer1.toString() + " points. Do you want to take a card?"
                    card5Player1.setImageResource(currentCard5!!.image)
                    if (valuePlayer2<n && valuePlayer2<19) {
                        currentCard5Hero = cardsList.getNewCard()                                                                                 //Hero card5
                        card5Player2Value = currentCard5Hero!!.value
                        card5Player2.setImageResource(currentCard5Hero!!.imageBack)
                        valuePlayer2 = card5Player2Value + card4Player2Value +card3Player2Value +card2Player2Value + card1Player2Value
                    }
                }
            }
        }

        noButton1.setOnClickListener {
            card2Player2.setImageResource(currentCard2Hero!!.image)
            if(card3Player2Value !=0) card3Player2.setImageResource(currentCard3Hero!!.image) else card3Player2.setImageResource(R.drawable.emptycard)
            if(card4Player2Value !=0) card4Player2.setImageResource(currentCard4Hero!!.image) else card4Player2.setImageResource(R.drawable.emptycard)
            if(card5Player2Value !=0) card5Player2.setImageResource(currentCard5Hero!!.image) else card5Player2.setImageResource(R.drawable.emptycard)

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
            namePlayer1.text = name1View + " you have " + valuePlayer1.toString() + " points."
            namePlayer2.text = name2View + " you have " + valuePlayer2.toString() + " points."
            when {
                valuePlayer1 == 21 && valuePlayer1 != valuePlayer2 -> winView.text = name1View + " won!"
                valuePlayer2 == 21 && valuePlayer1 != valuePlayer2 -> winView.text = name2View + " won!"
                valuePlayer1 == valuePlayer2 -> winView.text = "You have played with draw!"
                valuePlayer1 < valuePlayer2 && valuePlayer2 > 21 -> winView.text = name1View + " won!"
                valuePlayer2 < valuePlayer1 && valuePlayer1 > 21 -> winView.text = name2View + " won!"
                valuePlayer1 < valuePlayer2 && valuePlayer2 < 21 -> winView.text = name2View + " won!"
                valuePlayer2 < valuePlayer1 && valuePlayer1 < 21 -> winView.text = name1View + " won!"
            }
        }
    }
}







