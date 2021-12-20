package com.example.project_for_final_last01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FoodlistActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foodlist9)
        val btn = findViewById<TextView>(R.id.besht)

        btn.setOnClickListener {
            startActivity(Intent(this, ZakazActivity::class.java))
        }
    }
}