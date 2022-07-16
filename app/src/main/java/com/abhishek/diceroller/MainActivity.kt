package com.abhishek.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button)
        val imageView : ImageView = findViewById(R.id.imageView)

        val dice = DiceRoll(6)
        rollButton.setOnClickListener{
            val imageResource = when(dice.getRandom()){
                1 -> R.drawable.dice_1
                2-> R.drawable.dice_2
                3-> R.drawable.dice_3
                4-> R.drawable.dice_4
                5-> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            imageView.setImageResource(imageResource)
            imageView.contentDescription = dice.getRandom().toString()
        }

    }
}
class DiceRoll(private val side : Int ){
    fun getRandom() : Int{
        return (1..side).random()
    }
}