package com.example.pantallap

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.pantallap.Carrito.Carrito
import kotlinx.android.synthetic.main.ver_productos_detalle.*


class VerProductosDetalle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ver_productos_detalle)

        var toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val producto = intent.getSerializableExtra("pro") as ProductosCardView

        advImagen.setImageResource(producto.imagen)
        advNombre.text = getString(R.string.titulo, producto.nombre)
        advDescripcion.text = getString(R.string.descripcion, producto.descripcion)
        advPrecio.text = getString(R.string.precio, producto.precio2)

        val cantidad = findViewById<EditText>(R.id.cantidad)
        val precio = findViewById<TextView>(R.id.advPrecio)

        btnmas.setOnClickListener {
            cantidad.setText((cantidad.text.toString().toInt() + 1).toString())
            precio.setText((precio.text.toString().toDouble() + getString(R.string.precio, producto.precio2).toDouble()).toString())
        }

        btnmenos.setOnClickListener {
            if (cantidad.text.toString().toInt() > 1) {
                cantidad.setText((cantidad.text.toString().toInt() - 1).toString())
                precio.setText((precio.text.toString().toDouble() - getString(R.string.precio, producto.precio2).toDouble()).toString())
            }
        }
        btnCarrito.setOnClickListener {
            var intent = Intent(this, Carrito::class.java)

        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}