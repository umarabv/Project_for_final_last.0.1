package com.example.project_for_final_last01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Food_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)
        val kyrfood = findViewById<TextView>(R.id.kr_fdn)

        kyrfood.setOnClickListener {
            startActivity(Intent(this, FoodlistActivity9::class.java))
        }
    }
}