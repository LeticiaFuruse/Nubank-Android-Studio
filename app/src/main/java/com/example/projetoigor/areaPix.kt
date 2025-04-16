package com.example.projetoigor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class areaPix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_area_pix)

        val btnProximaTela : Button = findViewById(R.id.btnTransferir)
        btnProximaTela.setOnClickListener{
            val intent = Intent(this,valorTransferencia::class.java)
            startActivity(intent)
        }
    }
}