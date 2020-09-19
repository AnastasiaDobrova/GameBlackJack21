package com.example.gameblackjack21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PlayersActivity : AppCompatActivity() {

    lateinit var questionView : TextView
    lateinit var answerView: EditText
    var numberOfPlayers = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_players)

        questionView = findViewById(R.id.qestionView)
        answerView = findViewById(R.id.answerView)

        val button = findViewById<Button>(R.id.playButton)

        button.setOnClickListener {
            startGame()
        }
    }

    override fun onRestart() {
        super.onRestart()
    }

    fun startGame() {
        val intent = Intent(this , GameActivity::class.java )
        startActivity(intent)
    }
}