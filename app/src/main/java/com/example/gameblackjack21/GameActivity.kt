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





        card1Player1.setOnClickListener {
            currentCards = cardsList.getNewCard()
            textCard1.inputType = currentCards!!.value
            card1Player1.setImageResource(currentCards!!.image)
            card1Player1.setOnClickListener {
                card1Player1
            }
        }
        card2Player1.setOnClickListener {
            currentCards = cardsList.getNewCard()
            textCard1.inputType = currentCards!!.value
            card2Player1.setImageResource(currentCards!!.image)
            card2Player1.setOnClickListener {
                card2Player1
            }
        }
        card3Player1.setOnClickListener {
            currentCards = cardsList.getNewCard()
            textCard1.text = currentCards?.name
            card3Player1.setImageResource(currentCards!!.image)
            card3Player1.setOnClickListener {
                card3Player1
            }
        }
        card4Player1.setOnClickListener {
            currentCards = cardsList.getNewCard()
            textCard1.text = currentCards?.name
            card4Player1.setImageResource(currentCards!!.image)
            card4Player1.setOnClickListener {
                card4Player1
            }
        }

        card1Player2.setOnClickListener {
            currentCards = cardsList.getNewCard()
            textCard1.inputType = currentCards!!.value
            card1Player2.setImageResource(currentCards!!.image)
            card1Player2.setOnClickListener {
                card1Player2
            }
        }
        card2Player2.setOnClickListener {
            currentCards = cardsList.getNewCard()
            textCard1.inputType = currentCards!!.value
            card2Player2.setImageResource(currentCards!!.image)
            card2Player2.setOnClickListener {
                card2Player2
            }
        }
        card3Player2.setOnClickListener {
            currentCards = cardsList.getNewCard()
            textCard1.text = currentCards?.name
            card3Player2.setImageResource(currentCards!!.image)
            card3Player2.setOnClickListener {
                card3Player2
            }
        }
        card4Player2.setOnClickListener {
            currentCards = cardsList.getNewCard()
            textCard1.text = currentCards?.name
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
