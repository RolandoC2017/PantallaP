package com.example.pantallap.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.R
import com.example.pantallap.ProductosCardView
import com.example.pantallap.VerProductosDetalle


class ProductosAdapterCV(val productos:ArrayList<ProductosCardView>):RecyclerView.Adapter<ProductosAdapterCV.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductosAdapterCV.ViewHolder {
        var vista = LayoutInflater.from(parent.context).inflate(R.layout.productoscardview,parent,false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ProductosAdapterCV.ViewHolder, position: Int) {
        holder.bindItems(productos[position])
    }

    override fun getItemCount(): Int {
        return productos.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        fun bindItems(producto: ProductosCardView) {
            val nombre = itemView.findViewById<TextView>(R.id.nombre)
            val precio1 = itemView.findViewById<TextView>(R.id.precio1)
            val precio2 = itemView.findViewById<TextView>(R.id.precio2)
            val imagen = itemView.findViewById<ImageView>(R.id.imagen)
            nombre.text = producto.nombre
            precio1.text = producto.precio1
            precio2.text = "S/ "+ producto.precio2
            imagen.setImageResource(producto.imagen)

            itemView.setOnClickListener {
                   itemView.context.startActivity(Intent(itemView.context, VerProductosDetalle::class.java).putExtra("pro",producto))
                }
        }
    }
}
