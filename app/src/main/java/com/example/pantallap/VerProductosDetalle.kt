package com.example.pantallap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.ver_productos_detalle.*

class VerProductosDetalle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ver_productos_detalle)

        var toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val producto =  intent.getSerializableExtra("pro") as ProductosCardView

        advImagen.setImageResource(producto.imagen)
        advNombre.text = getString(R.string.titulo, producto.nombre)
        advDescripcion.text = getString(R.string.descripcion, producto.descripcion)
        advPrecio.text = getString(R.string.precio, producto.precio2)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}