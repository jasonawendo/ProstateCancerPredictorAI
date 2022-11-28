package com.example.prostatecancerpredictorai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class InputActivity : AppCompatActivity() {

    lateinit var etRadius: EditText
    lateinit var etTexture: EditText
    lateinit var etPerimeter: EditText
    lateinit var etArea: EditText
    lateinit var etSmoothness: EditText
    lateinit var etCompactness: EditText
    lateinit var etSymmetry: EditText
    lateinit var etFD: EditText
    lateinit var btnPredict: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        etRadius = findViewById(R.id.etRadius)
        etTexture = findViewById(R.id.etTexture)
        etPerimeter = findViewById(R.id.etPerimeter)
        etArea = findViewById(R.id.etArea)
        etSmoothness = findViewById(R.id.etSmoothness)
        etCompactness = findViewById(R.id.etCompactness)
        etSymmetry = findViewById(R.id.etSymmetry)
        etFD = findViewById(R.id.etFD)
        btnPredict = findViewById(R.id.btnPredict)

    }
}