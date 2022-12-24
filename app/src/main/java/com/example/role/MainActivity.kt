package com.example.role

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botoApretat:Button = findViewById(R.id.boto_tira.toInt())
        botoApretat.setOnClickListener(){
            Toast.makeText(this, "Nova tirada",Toast.LENGTH_LONG).show()
            tirada()
        }

        val imatgeDau:ImageView = findViewById(R.id.imatgeDau)
        imatgeDau.setImageResource(R.drawable.empty_dice)
    }


    private fun tirada() {
     val imatgeDau:ImageView = findViewById(R.id.imatgeDau)
        var randomInt = (1..6).random()
        var imatgeFinal=R.drawable.empty_dice
        when (randomInt){
            1 -> imatgeFinal=R.drawable.dice_1
            2 -> imatgeFinal=R.drawable.dice_2
            3 -> imatgeFinal=R.drawable.dice_3
            4 -> imatgeFinal=R.drawable.dice_4
            5 -> imatgeFinal=R.drawable.dice_5
            6 -> imatgeFinal=R.drawable.dice_6
            else -> imatgeFinal=R.drawable.empty_dice
        }
        imatgeDau.setImageResource(imatgeFinal)
    }
}

