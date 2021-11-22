package com.example.pantallap.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pantallap.R

class AlertaInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alerta_inicio)

        val iniciarsesion = findViewById<Button>(R.id.btnIniciar)
        val registrar = findViewById<Button>(R.id.btnRegistrar)

        iniciarsesion.setOnClickListener {
            var intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        registrar.setOnClickListener {
            var intent = Intent(this, Registro_Login::class.java)
            startActivity(intent)
        }
    }
}