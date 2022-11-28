package com.example.prostatecancerpredictorai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            var inputIntent = Intent(this, InputActivity::class.java)
            startActivity(inputIntent)
        }
    }
}