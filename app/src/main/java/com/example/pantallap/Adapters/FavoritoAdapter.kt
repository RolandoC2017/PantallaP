package com.example.pantallap.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.Data.itemFavorito
import com.example.pantallap.R

class FavoritoAdapter(val favoritos:ArrayList<itemFavorito>): RecyclerView.Adapter<FavoritoAdapter.ViewHolder>() {

 //   private var listafavoritos = favoritos

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoritoAdapter.ViewHolder {
        var vista = LayoutInflater.from(parent.context).inflate(R.layout.productoscardview,parent,false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: FavoritoAdapter.ViewHolder, position: Int) {
        holder.bindItems(favoritos[position])
    }

    override fun getItemCount(): Int {
        return favoritos.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItems(favorito: itemFavorito) {
            val nombre = itemView.findViewById<TextView>(R.id.nombre)
            val precio1 = itemView.findViewById<TextView>(R.id.precio1)
            val precio2 = itemView.findViewById<TextView>(R.id.precio2)
            val imagen = itemView.findViewById<ImageView>(R.id.imagen)

            nombre.text = itemView.context.getString(R.string.nombre, favorito.nombre)
            precio1.text = itemView.context.getString(R.string.precio1, favorito.precio1)
            precio2.text = "S/ "+String.format("%.2f",itemView.context.getString(R.string.precio2, favorito.precio2).toString().toDouble())
            imagen.setImageResource(favorito.imagen)

        }
    }
}