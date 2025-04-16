package com.example.projetoigor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class transferirParaQuem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_transferir_para_quem)
        val botaoProximaTela : Button = findViewById(R.id.btnTransferirParaQuem)
        botaoProximaTela.setOnClickListener{
            val intent = Intent(this,Transferindo::class.java)
            startActivity(intent)
            }
    }
}