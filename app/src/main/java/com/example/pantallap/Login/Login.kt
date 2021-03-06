package com.example.pantallap.Login

import android.content.Intent
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.pantallap.BD.Conexion
import com.example.pantallap.Data.itemUsuario
import com.example.pantallap.MainActivity
import com.example.pantallap.R
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnRegLogin.setOnClickListener {
            startActivity(Intent(this, Registro_Login::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        }

        val usuario = findViewById<TextInputEditText>(R.id.usuarioI)
        val password = findViewById<TextInputEditText>(R.id.passwordI)
        val iniciarSesion = findViewById<Button>(R.id.btnIniciarSesion)
        val salir = findViewById<ImageButton>(R.id.btnSalir)

        var conexion = Conexion(this)
        var  db = conexion.writableDatabase

        iniciarSesion.setOnClickListener {

            var sql = "select * from BDusuario where usuario = '"+usuario.text.toString()+"' and password = '"+password.text.toString()+"'"
            var respuesta : Cursor = db.rawQuery(sql, null)
            var Usuario = itemUsuario(usuario.text.toString())

            if(usuario.text.toString().equals("") || password.text.toString().equals("")){
                Toast.makeText(this, "Ingrese Usuario y/o contraseña", Toast.LENGTH_SHORT).show()
            }
           else if(respuesta.count == 1){

                var intent = Intent(this, MainActivity::class.java)
                intent.putExtra("user",Usuario)
                startActivity(intent)
                finish()
                Toast.makeText(this, "Datos Correctos", Toast.LENGTH_SHORT).show()
           }
            else if(respuesta.count == 0){
                usuario.setText("")
                password.setText("")
               Toast.makeText(this, "Usuario y/o Contraseña incorrectos", Toast.LENGTH_SHORT).show()
           }
            else{
                usuario.setText("")
                password.setText("")
               Toast.makeText(this, "Usuarios duplicados, contacte al Administrador", Toast.LENGTH_SHORT).show()
           }
        }

        salir.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}