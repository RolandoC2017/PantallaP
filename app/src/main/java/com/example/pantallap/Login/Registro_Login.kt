package com.example.pantallap.Login

import android.content.Intent
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.*
import androidx.appcompat.widget.Toolbar
import com.example.pantallap.BD.Conexion
import com.example.pantallap.MainActivity
import com.example.pantallap.R
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_registro_login.*

class Registro_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_login)

        btnLogRegister.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
            overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
        }

        val nombres = findViewById<TextInputEditText>(R.id.Nombres)
        val usuario = findViewById<TextInputEditText>(R.id.usuario)
        val email = findViewById<TextInputEditText>(R.id.email)
        val password = findViewById<TextInputEditText>(R.id.password)
        val registrar = findViewById<Button>(R.id.Registro)
        val salir = findViewById<ImageButton>(R.id.btnSalir)

        var conexion = Conexion(this)
        var  db = conexion.writableDatabase

        registrar.setOnClickListener {

            var sql = "select * from BDusuario where usuario = '"+usuario.text.toString()+"'"
            var respuesta : Cursor = db.rawQuery(sql, null)

            if(!nombres.text.toString().isEmpty() && !usuario.text.toString().isEmpty() && !email.text.toString().isEmpty() && !password.text.toString().isEmpty() && respuesta.count == 0){
                db.execSQL("Insert into BDusuario(nombre, usuario, email, password) values('"+nombres.text.toString()+"','"+usuario.text.toString()+"','"+email.text.toString()+"','"+password.text.toString()+"')")

                nombres.setText("")
                usuario.setText("")
                email.setText("")
                password.setText("")
                registrar.setText("")

                var intent = Intent(this, Login::class.java)
                startActivity(intent)
                finish()

                Toast.makeText(this, "Se Registro Exitosamente", Toast.LENGTH_SHORT).show()
            }
            else if(respuesta.count == 1){
                Toast.makeText(this, "El usuario ya existe", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Debes llenar todos los Campos", Toast.LENGTH_SHORT).show()
            }
        }

        salir.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    /*override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right)
    }*/
}