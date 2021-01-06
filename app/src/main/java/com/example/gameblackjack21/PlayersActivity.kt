package com.example.gameblackjack21

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.gameblackjack21.db.MyDbManager
import kotlinx.android.synthetic.main.activity_players.*

class PlayersActivity : AppCompatActivity() {

    val myDbManager = MyDbManager(this)

    private val heroesList = HeroesList()
    private var currentHeroes : Heroes? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_players)

        val name1View = findViewById<EditText>(R.id.name1View)
        val name2View = findViewById<TextView>(R.id.celebrityView)
        val playButton = findViewById<Button>(R.id.playButton)

        myDbManager.openDb()
        history.text = ""

        currentHeroes = heroesList.getNewHero()
        imageView.setImageResource(currentHeroes!!.image)
        celebrityView.text = currentHeroes!!.name
        imageView.setOnClickListener {
            currentHeroes = heroesList.getNewHero()                                                                                 //Player card1
            imageView.setImageResource(currentHeroes!!.image)
            celebrityView.text = currentHeroes!!.name
        }


        playButton.setOnClickListener {
            // following code in comment reads data from database
           /* myDbManager.insertToDb(name1View.text.toString(), name2View.text.toString())
            val dataList = myDbManager.readDbData()
            for (item in dataList) {
                history.append(item)
                history.append("\n")
            }

            */
            val namePlayer1 = name1View.text.toString()
            val namePlayer2 = name2View.text.toString()
            val intent = Intent(this@PlayersActivity, GameActivity::class.java)
            intent.putExtra("Player1", namePlayer1)
            intent.putExtra("Player2", namePlayer2)
            startActivity(intent)
        }

    }
    override fun onDestroy() {
        super.onDestroy()
        myDbManager.closeDb()
    }
}



