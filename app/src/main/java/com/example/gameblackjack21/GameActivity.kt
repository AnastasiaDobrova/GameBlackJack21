package com.example.gameblackjack21

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_game.*
import java.lang.Math.random
import kotlin.random.Random

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
/*
        val card1Player1 = findViewById<ImageView>(R.id.card1Player1)
        card1Player1.setImageResource(R.drawable.clubace)
 */
        var cardNames = arrayOf(R.drawable.clubace, R.drawable.clubeight, R.drawable.clubjack, R.drawable.clubking);
        yesButton1.setOnClickListener {
        var n = random()
            card1Player1.setImageResource(cardNames[n.toInt()]);
         }
    }
}