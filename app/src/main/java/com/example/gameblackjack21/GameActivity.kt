package com.example.gameblackjack21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GameActivity : AppCompatActivity() {

    lateinit var gameText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        gameText = findViewById(R.id.gameText)
    }
}