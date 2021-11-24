package com.example.pantallap.Adapters

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.BD.Conexion
import com.example.pantallap.Carrito.Carrito
import com.example.pantallap.R
import com.example.pantallap.Data.itemCarrito

class CarritoAdapter(val carritos:ArrayList<itemCarrito>):RecyclerView.Adapter<CarritoAdapter.ViewHolder>() {

    private var listacarrito = carritos

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarritoAdapter.ViewHolder {
        var vista = LayoutInflater.from(parent.context).inflate(R.layout.item_carrito,parent,false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: CarritoAdapter.ViewHolder, position: Int) {
        holder.bindItems(listacarrito[position],position)
    }

    override fun getItemCount(): Int {
        return listacarrito.size
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        fun bindItems(carrito: itemCarrito, position: Int) {
            val nombre = itemView.findViewById<TextView>(R.id.nombreCarrito)
            val cantidad = itemView.findViewById<EditText>(R.id.cantidadItem)
            val precio2 = itemView.findViewById<TextView>(R.id.precioCarrito2)
            val precio1 = itemView.findViewById<TextView>(R.id.precioCarrito1)
            val imagen = itemView.findViewById<ImageView>(R.id.imagenCarrito)
            val btnEliminar = itemView.findViewById<ImageButton>(R.id.btnEliminar)

            //val numCarrito=itemView.findViewById<TextView>(R.id.toolbarIndicator)
                //numCarrito.text= itemCount.toInt().toString()

            cantidad.setText(carrito.cantidad)
            precio2.text = carrito.precio2.toDouble().toString()

            precio1.setPaintFlags(precio2.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)

            nombre.text = itemView.context.getString(R.string.nombre, carrito.nombre)
            precio1.text = itemView.context.getString(R.string.precio2, carrito.precio1).toDouble().toString()

            imagen.setImageResource(carrito.imagen)

            btnEliminar.setOnClickListener {
                /* ELIMINAR ITEM DEL CARRITO */
                listacarrito.removeAt(position)
                notifyItemRemoved(position)
                getTotalFee()
                notifyItemRangeChanged(position,listacarrito.size)
                notifyDataSetChanged()

                /* ELIMINAR REGISTRO DE LA BD */
                val db = Conexion(itemView.context)
                val Nombre = nombre.text.toString()
                val mensaje: String = db.eliminar(Nombre)
                Toast.makeText(itemView.context, mensaje, Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun getTotalFee(): Double {
        var fee = 0.0
        for (i in 0 until listacarrito.size) {
            fee = fee + listacarrito[i].precio2.toString().toDouble()
        }
        return fee
    }
}
