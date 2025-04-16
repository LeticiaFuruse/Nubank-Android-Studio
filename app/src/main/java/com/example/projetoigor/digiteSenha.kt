package com.example.projetoigor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class digiteSenha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_digite_senha)
        val btnProximaTela : Button = findViewById(R.id.btnConfirmarSenha)
        btnProximaTela.setOnClickListener{
            val intent = Intent(this,transferenciaRealizada::class.java)
            startActivity(intent)
        }
    }
}