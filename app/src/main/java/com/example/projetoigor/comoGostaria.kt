package com.example.projetoigor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class comoGostaria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_como_gostaria)
        val botaoProximaTela : Button = findViewById(R.id.btnSaldoEmConta)
        botaoProximaTela.setOnClickListener{
            val intent = Intent(this,revise::class.java)
            startActivity(intent)
        }
    }
}