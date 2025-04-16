package com.example.projetoigor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Transferindo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_transferindo)
        val botaoProximaTela : Button = findViewById(R.id.btnEscolher)
        botaoProximaTela.setOnClickListener{
            val intent = Intent(this,comoGostaria::class.java)
            startActivity(intent)
        }
    }
}