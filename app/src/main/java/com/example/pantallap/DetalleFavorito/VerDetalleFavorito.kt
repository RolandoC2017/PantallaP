package com.example.pantallap.DetalleFavorito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.*
import androidx.appcompat.widget.Toolbar
import com.example.pantallap.BD.Conexion
import com.example.pantallap.Data.ProductosCardView
import com.example.pantallap.Data.itemFavorito
import com.example.pantallap.LlamarFragment
import com.example.pantallap.R
import kotlinx.android.synthetic.main.activity_ver_detalle_favorito.*
import kotlinx.android.synthetic.main.ver_productos_detalle.*

class VerDetalleFavorito : AppCompatActivity() {

    lateinit var favorito : itemFavorito

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_detalle_favorito)

        var toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        favorito = intent.getSerializableExtra("fav") as itemFavorito

        advImagenFav.setImageResource(favorito.imagen)
        advNombreFav.text = getString(R.string.nombre, favorito.nombre)
        advDescripcionFav.text = getString(R.string.descripcion, favorito.descripcion)
        advPrecioFav.text = getString(R.string.precio2, favorito.precio2).toDouble().toString()
       //advFavorito.isChecked = favorito.favorito

        val cantidad = findViewById<EditText>(R.id.cantidadFav)
        val precio = findViewById<TextView>(R.id.advPrecioFav)
        //val favorito = findViewById<CheckBox>(R.id.advFavorito)

        btnmasFav.setOnClickListener {
            cantidad.setText((cantidad.text.toString().toInt() + 1).toString())
            precio.setText((precio.text.toString().toDouble() + getString(R.string.precio2, favorito.precio2).toDouble()).toString())
        }

        btnmenosFav.setOnClickListener {
            if (cantidad.text.toString().toInt() > 1) {
                cantidad.setText((cantidad.text.toString().toInt() - 1).toString())
                precio.setText((precio.text.toString().toDouble() - getString(R.string.precio2, favorito.precio2).toDouble()).toString())
            }
        }

        var conexion = Conexion(this)
        var  db = conexion.writableDatabase

        /*favorito.setOnCheckedChangeListener { buttonView, isChecked ->

            if(isChecked){
                db.execSQL("Insert into BDFavoritos(nombre, precio1, precio2, imagen, descripcion) values('"+producto.nombre+"','"+producto.precio1+"',"+producto.precio2+","+producto.imagen+",'"+producto.descripcion+"')")
                Toast.makeText(this, "Producto Añadido a favoritos", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Producto Eliminado de favoritos", Toast.LENGTH_SHORT).show()
            }
        }

        btnFavorito.setOnClickListener {
            db.execSQL("Insert into BDFavoritos(nombre, precio1, precio2, imagen) values('"+producto.nombre+"','"+producto.precio1+"',"+producto.precio2+","+producto.imagen+")")
            Toast.makeText(this, "Producto Añadido a favoritos", Toast.LENGTH_SHORT).show()
        }*/

        btnCarritoFav.setOnClickListener {
            db.execSQL("Insert into BDcarrito(nombre, precio1, precio2, imagen, cantidad) values('"+favorito.nombre+"',"+favorito.precio2+","+precio.text.toString()+","+favorito.imagen+","+cantidad.text.toString()+")")
            Toast.makeText(this, "Producto Añadido al carrito", Toast.LENGTH_SHORT).show()
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