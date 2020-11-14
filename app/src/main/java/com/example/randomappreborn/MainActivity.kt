package com.example.randomappreborn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceActivityButton: Button = findViewById(R.id.dice_activity)
        val numActivityButton: Button = findViewById(R.id.random_num_activity)

        diceActivityButton.setOnClickListener {
            val intent = Intent(this, DiceActivity::class.java)
            startActivity(intent)
        }

        numActivityButton.setOnClickListener {
            val intent = Intent(this, NumActivity::class.java)
            startActivity(intent)
        }
    }
}