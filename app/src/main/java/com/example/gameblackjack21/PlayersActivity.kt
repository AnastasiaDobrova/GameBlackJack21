package com.example.gameblackjack21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class PlayersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_players)

        val name1View = findViewById<EditText>(R.id.name1View)
        val name2View = findViewById<EditText>(R.id.name2View)
        val playButton = findViewById<Button>(R.id.playButton)

        playButton.setOnClickListener {
            val namePlayer1 = name1View.text.toString()
            val namePlayer2 = name2View.text.toString()

            val intent = Intent(this@PlayersActivity, GameActivity::class.java)
            intent.putExtra("Player1", namePlayer1)
            intent.putExtra("Player2", namePlayer2)

            startActivity(intent)
        }
    }
}



