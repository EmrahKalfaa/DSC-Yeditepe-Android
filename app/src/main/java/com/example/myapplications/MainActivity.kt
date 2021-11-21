package com.example.myapplications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun RollDiceButton(v : View)
    {
        val diceValue = findViewById(R.id.dice_value_holder) as TextView
        val diceImage = findViewById(R.id.dice_image_holder) as ImageView

        var rnd = Random.nextInt(1,7)
        diceValue.text = rnd.toString()

        when (v.id)
        {
            R.id.roll_button ->
            {
                if(rnd == 1)
                {
                    diceImage.setImageResource(R.drawable.dice_one)
                }
                else if(rnd == 2)
                {
                    diceImage.setImageResource(R.drawable.dice_two)
                }
                else if(rnd == 3)
                {
                    diceImage.setImageResource(R.drawable.dice_three)
                }
                else if(rnd == 4)
                {
                    diceImage.setImageResource(R.drawable.dice_four)
                }
                else if(rnd == 5)
                {
                    diceImage.setImageResource(R.drawable.dice_five)
                }
                else if(rnd == 6)
                {
                    diceImage.setImageResource(R.drawable.dice_six)
                }
            }
            R.id.reset_button ->
            {
                diceValue.text = "Sıfırlandı"
                diceImage.setImageResource(R.drawable.gdsc)
            }
        }


    }


}