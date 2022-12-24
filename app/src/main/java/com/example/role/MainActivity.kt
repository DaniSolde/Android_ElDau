package com.example.role

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
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

        val botoAugmenta:Button =findViewById(R.id.botoSuma.toInt())
        botoAugmenta.setOnClickListener() {
            augmenta1()
        }
    }

    private fun augmenta1() {
        val numeroDau: TextView = findViewById(R.id.txtNumero)

        if (numeroDau.text.isNullOrEmpty()) {
            Toast.makeText(this, "Error", Toast.LENGTH_LONG).show()
        }
        else{

            if (numeroDau.text == "6"){

                numeroDau.text = "1"

            }
            else{
                var numeroDauInt = numeroDau.text.toString().toInt()
                numeroDauInt++
                numeroDau.text = numeroDauInt.toString()
            }
        }
    }

    private fun tirada() {
     var numeroDau:TextView = findViewById(R.id.txtNumero)
        var randomInt = (1..6).random()
        numeroDau.text=randomInt.toString()
    }
}

