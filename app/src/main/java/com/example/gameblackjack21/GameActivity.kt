package com.example.gameblackjack21

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.sax.Element
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_game.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random.Default.nextInt

class GameActivity : AppCompatActivity() {

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

        val yesButton1 = findViewById<Button>(R.id.yesButton1)

        val card1Player1 = findViewById<ImageView>(R.id.card1Player1)


        var cards = mutableListOf(R.drawable.clubjack, R.drawable.clubeight, R.drawable.clubace, R.drawable.clubnine, R.drawable.clubqueenthree)
        var r = Random()
        var n = r.nextInt(cards.size)

        card1Player1.setOnClickListener {
            card1Player1.setImageResource(cards[n])
            card1Player1.setOnClickListener {
                card1Player1
            }
        }
        card2Player1.setOnClickListener {
            card2Player1.setImageResource(cards[n])
            card2Player1.setOnClickListener {
                card2Player1
            }
        }
        card3Player1.setOnClickListener {
            card3Player1.setImageResource(cards[n])
            card3Player1.setOnClickListener {
                card3Player1
            }
        }
        card4Player1.setOnClickListener {
            card4Player1.setImageResource(cards[n])
            card4Player1.setOnClickListener {
                card4Player1
            }
        }
    }
}