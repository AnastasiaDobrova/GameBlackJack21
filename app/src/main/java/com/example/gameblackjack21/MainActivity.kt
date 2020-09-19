package com.example.gameblackjack21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var welcome : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcome = findViewById(R.id.welcome)

        val button = findViewById<Button>(R.id.startButton )

        button.setOnClickListener {
            startPlayers()
        }
    }

    override fun onRestart() {
        super.onRestart()
    }

    fun startPlayers() {
        val intent = Intent(this , PlayersActivity::class.java )
        startActivity(intent)
    }
}