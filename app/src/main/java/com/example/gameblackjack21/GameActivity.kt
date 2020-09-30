package com.example.gameblackjack21

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.sax.Element
import android.view.MotionEvent
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_game.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random.Default.nextInt

class GameActivity : AppCompatActivity() {

    val cardsList = CardsList()
    var currentCards : Cards? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

       var intent = intent

        val name1View = intent.getStringExtra("Player1")
        val name2View = intent.getStringExtra("Player2")

        val namePlayer1 = findViewById<TextView>(R.id.namePlayer1)
        val namePlayer2 = findViewById<TextView>(R.id.namePlayer2)

        namePlayer1.text = "Player: "+name1View+""
        namePlayer2.text = "Player: "+name2View+""

        var valuePlayer1 = 0
        var valuePlayer2 = 0
        var card1Player1Value = 0
        var card2Player1Value = 0
        var card3Player1Value = 0
        var card4Player1Value = 0
        var card1Player2Value = 0
        var card2Player2Value = 0
        var card3Player2Value = 0
        var card4Player2Value = 0


        card1Player1.setOnClickListener {
            currentCards = cardsList.getNewCard()
            card1Player1Value = currentCards!!.value
            valuePlayer1 = card1Player1Value
            textCard1.text = card1Player1Value.toString()
            card1Player1.setImageResource(currentCards!!.image)
            card1Player1.setOnClickListener {
                card1Player1
            }
        }
        card2Player1.setOnClickListener {
            currentCards = cardsList.getNewCard()
            card2Player1Value = currentCards!!.value
            valuePlayer1 = card2Player1Value + card1Player1Value
            textCard1.text = valuePlayer1.toString()
            card2Player1.setImageResource(currentCards!!.image)
            card2Player1.setOnClickListener {
                card2Player1
            }
        }
        card3Player1.setOnClickListener {
            currentCards = cardsList.getNewCard()
            card3Player1Value = currentCards!!.value
            valuePlayer1 = card3Player1Value +card2Player1Value + card1Player1Value
            textCard1.text = valuePlayer1.toString()
            card3Player1.setImageResource(currentCards!!.image)
            card3Player1.setOnClickListener {
                card3Player1
            }
        }
        card4Player1.setOnClickListener {
            currentCards = cardsList.getNewCard()
            card4Player1Value = currentCards!!.value
            valuePlayer1 = card4Player1Value +card3Player1Value +card2Player1Value + card1Player1Value
            textCard1.text = valuePlayer1.toString()
            card4Player1.setImageResource(currentCards!!.image)
            card4Player1.setOnClickListener {
                card4Player1
            }
        }



        card1Player2.setOnClickListener {
            currentCards = cardsList.getNewCard()
            card1Player2Value = currentCards!!.value
            valuePlayer2 = card1Player1Value
            textCard2.text = card1Player2Value.toString()
            card1Player2.setImageResource(currentCards!!.image)
            card1Player2.setOnClickListener {
                card1Player2
            }
        }
        card2Player2.setOnClickListener {
            currentCards = cardsList.getNewCard()
            card2Player2Value = currentCards!!.value
            valuePlayer2 = card2Player2Value + card1Player2Value
            textCard2.text = valuePlayer2.toString()
            card2Player2.setImageResource(currentCards!!.image)
            card2Player2.setOnClickListener {
                card2Player2
            }
        }
        card3Player2.setOnClickListener {
            currentCards = cardsList.getNewCard()
            card3Player2Value = currentCards!!.value
            valuePlayer2 = card3Player2Value +card2Player2Value + card1Player2Value
            textCard2.text = valuePlayer2.toString()
            card3Player2.setImageResource(currentCards!!.image)
            card3Player2.setOnClickListener {
                card3Player2
            }
        }
        card4Player2.setOnClickListener {
            currentCards = cardsList.getNewCard()
            card4Player2Value = currentCards!!.value
            valuePlayer2 = card4Player2Value +card3Player2Value +card2Player2Value + card1Player2Value
            textCard2.text = valuePlayer2.toString()
            card4Player2.setImageResource(currentCards!!.image)
            card4Player2.setOnClickListener {
                card4Player2
            }
        }



    }

}
       /* var cards = mutableListOf(R.drawable.clubjack, R.drawable.clubeight, R.drawable.clubace, R.drawable.clubnine, R.drawable.clubqueenthree)
        var r = Random()
        var n1 = r.nextInt(cards.size)
        var n2 = r.nextInt(cards.size)
        var n3 = r.nextInt(cards.size)
        var n4 = r.nextInt(cards.size)


        card1Player1.setOnClickListener {
            card1Player1.setImageResource(cards[n1])

            card1Player1.setOnClickListener {
                card1Player1
            }
        }
        card2Player1.setOnClickListener {
            card2Player1.setImageResource(cards[n2])
            card2Player1.setOnClickListener {
                card2Player1
            }
        }
        card3Player1.setOnClickListener {
            card3Player1.setImageResource(cards[n3])
            card3Player1.setOnClickListener {
                card3Player1
            }
        }
        card4Player1.setOnClickListener {
            card4Player1.setImageResource(cards[n4])
            card4Player1.setOnClickListener {
                card4Player1
            }
        }
    }

        */
