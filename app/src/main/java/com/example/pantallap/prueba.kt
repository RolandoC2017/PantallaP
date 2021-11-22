package com.example.pantallap

import android.content.Intent
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.pantallap.BD.Conexion
import com.example.pantallap.Data.itemUsuario
import com.example.pantallap.Login.Login

class prueba : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prueba)

        var pruebau = findViewById<TextView>(R.id.pruebausuario)
        var cerrar = findViewById<Button>(R.id.cerrarSesion)

        var usuario = intent.getSerializableExtra("user") as itemUsuario?
        if (usuario != null) {
            pruebau.text = getString(R.string.nombreU, usuario.nombreU)
        }

        cerrar.setOnClickListener {
            var intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}