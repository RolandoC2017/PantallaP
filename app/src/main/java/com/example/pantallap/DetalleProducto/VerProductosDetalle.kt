package com.example.pantallap.DetalleProducto

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.ver_productos_detalle.*
import com.example.pantallap.BD.Conexion
import com.example.pantallap.LlamarFragment
import com.example.pantallap.Data.ProductosCardView
import com.example.pantallap.R

class VerProductosDetalle : AppCompatActivity() {

    lateinit var producto : ProductosCardView

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ver_productos_detalle)

        var toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

             producto = intent.getSerializableExtra("pro") as ProductosCardView

                advImagen.setImageResource(producto.imagen)
                advNombre.text = getString(R.string.nombre, producto.nombre)
                advDescripcion.text = getString(R.string.descripcion, producto.descripcion)
                advPrecio.text = getString(R.string.precio2, producto.precio2).toDouble().toString()

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
            db.execSQL("Insert into prueba1(nombre, precio1, precio2, imagen, cantidad) values('"+producto.nombre+"',"+producto.precio2+","+precio.text.toString()+","+producto.imagen+","+cantidad.text.toString()+")")
            Toast.makeText(this, "Producto Añadido al carrito", Toast.LENGTH_SHORT).show()

            //var intent = Intent(this, LlamarFragment::class.java)
            //startActivity(intent)
        }

            val botonCar = findViewById<ImageButton>(R.id.toolbarCar)
            botonCar.setOnClickListener {
                var intent = Intent(this, LlamarFragment::class.java)
                startActivity(intent)
            }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

}