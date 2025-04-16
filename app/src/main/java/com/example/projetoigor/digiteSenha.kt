package com.example.projetoigor

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class digiteSenha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_digite_senha)
        val edit1 = findViewById<EditText>(R.id.editText1)
        val edit2 = findViewById<EditText>(R.id.editText2)
        val edit3 = findViewById<EditText>(R.id.editText3)
        val edit4 = findViewById<EditText>(R.id.editText4)

        // Função para avançar o foco
        fun autoMove(current: EditText, next: EditText?) {
            current.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
                override fun afterTextChanged(s: Editable?) {
                    if (s?.length == 1) {
                        next?.requestFocus()
                    }
                }
            })
        }

        // Aplica a lógica nos campos
        autoMove(edit1, edit2)
        autoMove(edit2, edit3)
        autoMove(edit3, edit4)




        //logica do botao para outra tela
        val btnProximaTela : Button = findViewById(R.id.btnConfirmarSenha)
        btnProximaTela.setOnClickListener{
            val intent = Intent(this,transferenciaRealizada::class.java)
            startActivity(intent)
        }
    }
}