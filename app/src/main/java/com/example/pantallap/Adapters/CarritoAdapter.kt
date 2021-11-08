package com.example.pantallap.Adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.ItemCarrito
import com.example.pantallap.ProductosCardView
import com.example.pantallap.R
import com.example.pantallap.VerProductosDetalle

class CarritoAdapter(val productos:ArrayList<ItemCarrito>): RecyclerView.Adapter<CarritoAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarritoAdapter.ViewHolder {
        var vista = LayoutInflater.from(parent.context).inflate(R.layout.item_carrito,parent,false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: CarritoAdapter.ViewHolder, position: Int) {
        holder.bindItems(productos[position])
    }

    override fun getItemCount(): Int {
        return productos.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItems(producto: ItemCarrito) {
            val nombre = itemView.findViewById<TextView>(R.id.nombreCarrito)
            val precio = itemView.findViewById<TextView>(R.id.precioCarrito)
            val imagen = itemView.findViewById<ImageView>(R.id.imagenCarrito)
            //val cantidad = itemView.findViewById<TextView>(R.id.cantidadItem)
            nombre.text = producto.nombre
            precio.text = "S/ " + producto.precio
            imagen.setImageResource(producto.imagen)
        }
    }
}