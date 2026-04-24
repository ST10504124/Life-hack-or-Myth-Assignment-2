package com.example.lifehackormyth

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnStart = findViewById<Button>(R.id.btnNext)
        val intent = Intent(this, quiz::class.java)

        // Go to quiz page when button is clicked
        // / IIE.2026d.
        // Introduction to Mobile Application Development [Module Manual].
        // The Independent Institute of Education.
        // [Accessed 24 April 2026].

        btnStart.setOnClickListener {
            startActivity(intent)
            Log.d("MSG", "Navigation successful")
        }
    }
}