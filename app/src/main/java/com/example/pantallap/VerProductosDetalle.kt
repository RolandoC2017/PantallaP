package com.example.pantallap

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.ver_productos_detalle.*
import com.example.pantallap.BD.Conexion

class VerProductosDetalle : AppCompatActivity() {

    //lateinit var producto : ProductosCardView

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ver_productos_detalle)

        var toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

            val producto = intent.getSerializableExtra("pro") as ProductosCardView

                advImagen.setImageResource(producto.imagen)
                advNombre.text = getString(R.string.nombre, producto.nombre)
                advDescripcion.text = getString(R.string.descripcion, producto.descripcion)
                advPrecio.text = getString(R.string.precio2, producto.precio2)

        val cantidad = findViewById<EditText>(R.id.cantidad)
        val precio = findViewById<TextView>(R.id.advPrecio)

        btnmas.setOnClickListener {
            cantidad.setText((cantidad.text.toString().toInt() + 1).toString())
            precio.setText((precio.text.toString().toDouble() + getString(R.string.precio2, producto.precio2).toDouble()).toString())
        }

        btnmenos.setOnClickListener {
            if (cantidad.text.toString().toInt() > 1) {
                cantidad.setText((cantidad.text.toString().toInt() - 1).toString())
                precio.setText((precio.text.toString().toDouble() - getString(R.string.precio2, producto.precio2).toDouble()).toString())
            }
        }

            var conexion = Conexion(this)
            var  db = conexion.writableDatabase
        btnCarrito.setOnClickListener {
            db.execSQL("Insert into prueba1(nombre, precio1, precio2, imagen, cantidad) values('"+producto.nombre+"',"+producto.precio2+","+precio.text.toString()+","+producto.imagen+","+cantidad.text.toString()+")");

            //var intent = Intent(this, LlamarFragment::class.java)
            //startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

}