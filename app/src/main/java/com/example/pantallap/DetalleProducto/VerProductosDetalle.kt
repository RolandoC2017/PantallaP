package com.example.pantallap.DetalleProducto

import android.content.Intent
import android.database.Cursor
import android.os.Bundle
import android.view.MenuItem
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.ver_productos_detalle.*
import com.example.pantallap.BD.Conexion
import com.example.pantallap.Carrito.Carrito
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
                advFavorito.isChecked = producto.favorito

        val cantidad = findViewById<EditText>(R.id.cantidad)
        val precio = findViewById<TextView>(R.id.advPrecio)
        val favorito = findViewById<CheckBox>(R.id.advFavorito)

        val indicador = findViewById<TextView>(R.id.toolbarIndicator)

        btnmas.setOnClickListener {
            cantidad.setText((cantidad.text.toString().toInt() + 1).toString())
            precio.setText((getString(R.string.precio2, producto.precio2).toDouble() * cantidad.text.toString().toInt()).toString())
        }

        btnmenos.setOnClickListener {
            if (cantidad.text.toString().toInt() > 1) {
                cantidad.setText((cantidad.text.toString().toInt() - 1).toString())
                precio.setText((precio.text.toString().toDouble() - getString(R.string.precio2, producto.precio2).toDouble()).toString())
            }
        }

            var conexion = Conexion(this)
            var  db = conexion.writableDatabase

            favorito.setOnCheckedChangeListener { buttonView, isChecked ->
                var sql = "select * from BDFavoritos where nombre = '"+producto.nombre+"'"
                var respuesta : Cursor = db.rawQuery(sql, null)

                if(isChecked){
                    if(respuesta.count == 0){
                    db.execSQL("Insert into BDFavoritos(nombre, precio1, precio2, imagen, descripcion) values('"+producto.nombre+"','"+producto.precio1+"',"+producto.precio2+","+producto.imagen+",'"+producto.descripcion+"')")
                    Toast.makeText(this, "Producto A??adido a favoritos", Toast.LENGTH_SHORT).show()
                    }
                    else if(respuesta.count == 1){
                        Toast.makeText(this, "Producto ya existe", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show()
                    }
                }
                else{
                    Toast.makeText(this, "Producto Eliminado de favoritos", Toast.LENGTH_SHORT).show()
                }
            }

        btnCarrito.setOnClickListener {
            var sql = "select * from BDcarrito where nombre = '"+producto.nombre+"'"
            var respuesta : Cursor = db.rawQuery(sql, null)

            if(respuesta.count == 0){
                indicador.setText((indicador.text.toString().toInt()+1).toString())
                db.execSQL("Insert into BDcarrito(nombre, precio1, precio2, imagen, cantidad, indicador) values('"+producto.nombre+"',"+producto.precio2+","+precio.text.toString()+","+producto.imagen+","+cantidad.text.toString()+","+indicador.text.toString()+")")
                Toast.makeText(this, "Producto A??adido al carrito", Toast.LENGTH_SHORT).show()
            }
            else if(respuesta.count == 1){
                Toast.makeText(this, "Producto ya existe", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show()
            }
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