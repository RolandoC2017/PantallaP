package com.example.pantallap.Adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.R
import com.example.pantallap.Data.ProductosCardView
import com.example.pantallap.DetalleProducto.VerProductosDetalle


class ProductosAdapterCV(val productos:ArrayList<ProductosCardView>):RecyclerView.Adapter<ProductosAdapterCV.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductosAdapterCV.ViewHolder {
        var vista = LayoutInflater.from(parent.context).inflate(R.layout.productoscardview,parent,false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ProductosAdapterCV.ViewHolder, position: Int) {
        holder.bindItems(productos[position],position)
    }

    override fun getItemCount(): Int {
        return productos.size
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        fun bindItems(producto: ProductosCardView,position: Int) {
            val nombre = itemView.findViewById<TextView>(R.id.nombre)
            val precio1 = itemView.findViewById<TextView>(R.id.precio1)
            val precio2 = itemView.findViewById<TextView>(R.id.precio2)
            val imagen = itemView.findViewById<ImageView>(R.id.imagen)
            val favorito = itemView.findViewById<CheckBox>(R.id.favorito)

            nombre.text = producto.nombre
            precio1.text = producto.precio1
            precio2.text = "S/ "+String.format("%.2f", producto.precio2.toString().toDouble())
            imagen.setImageResource(producto.imagen)
            favorito.isChecked = producto.favorito

            itemView.setOnClickListener {
                   itemView.context.startActivity(Intent(itemView.context, VerProductosDetalle::class.java).putExtra("pro",producto))
                }

            favorito.setOnCheckedChangeListener { buttonView, isChecked ->

                if(isChecked){
                     Toast.makeText(itemView.context, "Producto Añadido a favoritos", Toast.LENGTH_SHORT).show()
                }else{
                     Toast.makeText(itemView.context, "Producto Eliminado de favoritos", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
