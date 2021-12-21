package com.example.project_for_final_last01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tamakorder = findViewById<TextView>(R.id.nmlk)

        tamakorder.setOnClickListener {
            startActivity(Intent(this, Menu_Activity::class.java))
        }
    }
}