package com.example.prateekthakur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Achivements : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achivements)
        supportActionBar?.title = "My achievements"
    }
}