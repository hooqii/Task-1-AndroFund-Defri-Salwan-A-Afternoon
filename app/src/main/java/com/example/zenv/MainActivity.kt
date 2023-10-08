package com.example.zenv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvEmailRegistered:TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        tvEmailRegistered = findViewById(R.id.tvEmailRegistered)

        val email = intent.getStringExtra("email")

        tvEmailRegistered.text = email

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}