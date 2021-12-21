package com.example.project_for_final_last01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ZakazActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zakaz)
        val zakaz = findViewById<Button>(R.id.knock_knock)

        zakaz.setOnClickListener {
            startActivity(Intent(this, ThankuActivity::class.java))
        }
    }
}