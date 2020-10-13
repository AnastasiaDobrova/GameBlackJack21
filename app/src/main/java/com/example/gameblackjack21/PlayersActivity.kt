package com.example.gameblackjack21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_players.*

class PlayersActivity : AppCompatActivity() {

    val heroesList = HeroesList()
    var currentHeroes : Heroes? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_players)

        val name1View = findViewById<EditText>(R.id.name1View)
        val name2View = findViewById<TextView>(R.id.celebrityView)
        val playButton = findViewById<Button>(R.id.playButton)



        currentHeroes = heroesList.getNewHero()
        imageView.setImageResource(currentHeroes!!.image)
        celebrityView.text = currentHeroes!!.name


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



