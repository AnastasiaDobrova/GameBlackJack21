package com.example.gameblackjack21

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_main.*

class GameActivity : AppCompatActivity() {

    val cardsList = CardsList()
    var currentCards : Cards? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

       val intent = intent

        val name1View = intent.getStringExtra("Player1")
        val name2View = intent.getStringExtra("Player2")

        val namePlayer1 = findViewById<TextView>(R.id.namePlayer1)
        val namePlayer2 = findViewById<TextView>(R.id.namePlayer2)
        val gameText = findViewById<TextView>(R.id.gameText)
        val yesButton1 = findViewById<Button>(R.id.yesButton1)
        val yesButton2 = findViewById<Button>(R.id.yesButton2)
        //val winView = findViewById<TextView>(R.id.winView)

        namePlayer1.text = "Player: "+name1View+""
        namePlayer2.text = "Player: "+name2View+""
        gameText.text = "$name1View and $name2View you are welcome to the game!"
        yesButton1.text = "take card for $name1View"
        yesButton2.text = "Open cards!"

        var valuePlayer1 = 0
        var valuePlayer2 = 0
        var card1Player1Value = 0
        var card2Player1Value = 0
        var card3Player1Value = 0
        var card4Player1Value = 0
        var card5Player1Value = 0
        var card1Player2Value = 0
        var card2Player2Value = 0
        var card3Player2Value = 0
        var card4Player2Value = 0
        var card5Player2Value = 0

        fun win() {

            //winView.text = "You won!"

        }

        //winView.setOnClickListener {
        noButton2.setOnClickListener {
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

        currentCards = cardsList.getNewCard()
        card1Player1Value = currentCards!!.value
        valuePlayer1 = card1Player1Value
        namePlayer1.text = name1View + " you have " + card1Player1Value.toString() + " points. Do you want to take a card?"
        card1Player1.setImageResource(currentCards!!.image)


        yesButton1.setOnClickListener {
                currentCards = cardsList.getNewCard()
                card2Player1Value = currentCards!!.value
                valuePlayer1 = card2Player1Value + card1Player1Value
                //textCard1.text = valuePlayer1.toString()
                namePlayer1.text = name1View + " you have " + valuePlayer1.toString() + " points. Do you want to take a card?"
                if (valuePlayer1.equals(21)) {

                    win()
                }
                card2Player1.setImageResource(currentCards!!.image)
                yesButton1.setOnClickListener {
                    currentCards = cardsList.getNewCard()
                    card3Player1Value = currentCards!!.value
                    valuePlayer1 = card3Player1Value +card2Player1Value + card1Player1Value
                    namePlayer1.text = name1View + " you have " + valuePlayer1.toString() + " points. Do you want to take a card?"
                    //textCard1.text = valuePlayer1.toString()
                    if (valuePlayer1.equals(21)) {

                        win()
                    }
                    card3Player1.setImageResource(currentCards!!.image)
                    yesButton1.setOnClickListener {
                        currentCards = cardsList.getNewCard()
                        card4Player1Value = currentCards!!.value
                        valuePlayer1 = card4Player1Value +card3Player1Value +card2Player1Value + card1Player1Value
                        namePlayer1.text = name1View + " you have " + valuePlayer1.toString() + " points. Do you want to take a card?"
                        //textCard1.text = valuePlayer1.toString()
                        if (valuePlayer1.equals(21)) {

                            win()
                        }
                        card4Player1.setImageResource(currentCards!!.image)
                        yesButton1.setOnClickListener {
                            currentCards = cardsList.getNewCard()
                            card5Player1Value = currentCards!!.value
                            valuePlayer1 = card5Player1Value + card4Player1Value +card3Player1Value +card2Player1Value + card1Player1Value
                            namePlayer1.text = name1View + " you have " + valuePlayer1.toString() + " points. Do you want to take a card?"
                            //textCard1.text = valuePlayer1.toString()
                            if (valuePlayer1.equals(21)) {

                                win()
                            }
                            card5Player1.setImageResource(currentCards!!.image)
                            yesButton1.setOnClickListener {
                                card5Player1
                            }
                        }
                    }
                }
            }

        yesButton2.setOnClickListener {
        currentCards = cardsList.getNewCard()
        card1Player2Value = currentCards!!.value
        //valuePlayer2 = card1Player2Value
        //textCard2.text = card1Player2Value.toString()
        card1Player2.setImageResource(currentCards!!.image)

            currentCards = cardsList.getNewCard()
            card2Player2Value = currentCards!!.value
            //valuePlayer2 = card2Player2Value + card1Player2Value
            //textCard2.text = valuePlayer2.toString()
            card2Player2.setImageResource(currentCards!!.image)

                    currentCards = cardsList.getNewCard()
                    card3Player2Value = currentCards!!.value
                    //valuePlayer2 = card3Player2Value +card2Player2Value + card1Player2Value
                    //textCard2.text = valuePlayer2.toString()
                    card3Player2.setImageResource(currentCards!!.image)

                        currentCards = cardsList.getNewCard()
                        card4Player2Value = currentCards!!.value
                        //valuePlayer2 = card4Player2Value +card3Player2Value +card2Player2Value + card1Player2Value
                        //textCard2.text = valuePlayer2.toString()
                        card4Player2.setImageResource(currentCards!!.image)
                        currentCards = cardsList.getNewCard()
                            card5Player2Value = currentCards!!.value
                            valuePlayer2 = card5Player2Value + card4Player2Value +card3Player2Value +card2Player2Value + card1Player2Value
                            namePlayer2.text = name2View + " has " + valuePlayer2.toString() + " points."
                            //textCard2.text = valuePlayer2.toString()
                            if (valuePlayer2.equals(21)) {

                                win()
                            }
        }
                }
            }





