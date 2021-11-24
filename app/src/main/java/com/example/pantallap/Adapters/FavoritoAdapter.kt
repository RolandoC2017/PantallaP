package com.example.pantallap.Adapters

import android.content.Intent
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.BD.Conexion
import com.example.pantallap.Data.itemFavorito
import com.example.pantallap.DetalleFavorito.VerDetalleFavorito
import com.example.pantallap.DetalleProducto.VerProductosDetalle
import com.example.pantallap.R
import kotlinx.android.synthetic.main.productoscardview.view.*

class FavoritoAdapter(val favoritos:ArrayList<itemFavorito>): RecyclerView.Adapter<FavoritoAdapter.ViewHolder>() {

    private var listafavoritos = favoritos

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoritoAdapter.ViewHolder {
        var vista = LayoutInflater.from(parent.context).inflate(R.layout.productoscardview,parent,false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: FavoritoAdapter.ViewHolder, position: Int) {
        holder.bindItems(listafavoritos[position],position)
    }

    override fun getItemCount(): Int {
        return listafavoritos.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItems(favorito: itemFavorito,position: Int) {
            val nombre = itemView.findViewById<TextView>(R.id.nombre)
            val precio1 = itemView.findViewById<TextView>(R.id.precio1)
            val precio2 = itemView.findViewById<TextView>(R.id.precio2)
            val imagen = itemView.findViewById<ImageView>(R.id.imagen)
            val corazon = itemView.findViewById<CheckBox>(R.id.favorito)

            precio1.setPaintFlags(precio2.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)

            nombre.text = itemView.context.getString(R.string.nombre, favorito.nombre)
            precio1.text = itemView.context.getString(R.string.precio1, favorito.precio1)
            precio2.text = "S/ "+String.format("%.2f",itemView.context.getString(R.string.precio2, favorito.precio2).toString().toDouble())
            imagen.setImageResource(favorito.imagen)

            itemView.setOnClickListener {
                itemView.context.startActivity(Intent(itemView.context, VerDetalleFavorito::class.java).putExtra("fav",favorito))
            }

            corazon.setOnCheckedChangeListener { buttonView, isChecked ->

                if(isChecked){
                    /* ELIMINAR ITEM DE FAVORITOS */
                    favoritos.removeAt(position)
                    notifyItemRemoved(position)
                    notifyItemRangeChanged(position,listafavoritos.size)
                    notifyDataSetChanged()

                    /* ELIMINAR REGISTRO DE LA BD */
                    val db = Conexion(itemView.context)
                    val Nombre = nombre.text.toString()
                    val mensaje: String = db.eliminarF(Nombre)
                    Toast.makeText(itemView.context, mensaje, Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(itemView.context, "Producto Eliminado de favoritos", Toast.LENGTH_SHORT).show()
                }
            }

        }
    }
}