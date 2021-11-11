package com.example.pantallap.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.Carrito.Carrito
import com.example.pantallap.ProductosCardView
import com.example.pantallap.R
import com.example.pantallap.VerProductosDetalle
import com.example.pantallap.itemCarrito
import kotlinx.android.synthetic.main.item_carrito.view.*
import kotlinx.android.synthetic.main.ver_productos_detalle.*

class CarritoAdapter(val carritos:ArrayList<itemCarrito>):RecyclerView.Adapter<CarritoAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarritoAdapter.ViewHolder {
        var vista = LayoutInflater.from(parent.context).inflate(R.layout.item_carrito,parent,false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: CarritoAdapter.ViewHolder, position: Int) {
        holder.bindItems(carritos[position])
    }

    override fun getItemCount(): Int {
        return carritos.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        fun bindItems(carrito: itemCarrito) {
            val nombre = itemView.findViewById<TextView>(R.id.nombreCarrito)
            val cantidad = itemView.findViewById<EditText>(R.id.cantidadItem)
            val precio2 = itemView.findViewById<TextView>(R.id.precioCarrito2)
            val precio1 = itemView.findViewById<TextView>(R.id.precioCarrito1)
            val imagen = itemView.findViewById<ImageView>(R.id.imagenCarrito)

            cantidad.setText(carrito.cantidad)
            precio2.setText(carrito.precio2)

            nombre.text = itemView.context.getString(R.string.nombre, carrito.nombre)
            precio1.text = itemView.context.getString(R.string.precio2, carrito.precio1)
            imagen.setImageResource(carrito.imagen)

        }
    }
}
