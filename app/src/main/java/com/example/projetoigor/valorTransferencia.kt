package com.example.projetoigor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class valorTransferencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_valor_transferencia)
        val btnProximaTela : Button = findViewById(R.id.btnSeguinte)
        btnProximaTela.setOnClickListener{
            val intent = Intent(this,transferirParaQuem::class.java)
            startActivity(intent)
        }
    }
}