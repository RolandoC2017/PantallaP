package com.example.pantallap.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.BD.Conexion
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
            val btnmas = itemView.findViewById<Button>(R.id.btnmasItem)
            val btnmenos = itemView.findViewById<Button>(R.id.btnmenosItem)
            val btnEliminar = itemView.findViewById<ImageButton>(R.id.btnEliminar)

            cantidad.setText(carrito.cantidad)
            precio2.text = carrito.precio2.toDouble().toString()

            nombre.text = itemView.context.getString(R.string.nombre, carrito.nombre)
            precio1.text = itemView.context.getString(R.string.precio2, carrito.precio1).toDouble().toString()

            imagen.setImageResource(carrito.imagen)

            btnEliminar.setOnClickListener {
                /* ELIMINAR ITEM DEL CARRITO */
                listacarrito.removeAt(position)
                notifyItemRemoved(position)
                notifyItemRangeChanged(position,listacarrito.size)
                notifyDataSetChanged()

                /* ELIMINAR REGISTRO DE LA BD */
                val db = Conexion(itemView.context)
                val Nombre = nombre.text.toString()
                val mensaje: String = db.eliminar(Nombre)
                Toast.makeText(itemView.context, mensaje, Toast.LENGTH_SHORT).show()
            }

            var conexion = Conexion(itemView.context)
            var  db = conexion.writableDatabase

            btnmas.setOnClickListener {
                cantidad.setText((cantidad.text.toString().toInt() + 1).toString())
                precio2.setText((precio1.text.toString().toDouble() * cantidad.text.toString().toInt()).toString())
                db.execSQL("Update BDcarrito set precio2="+precio2.text.toString()+",cantidad="+cantidad.text.toString()+" where nombre='"+carrito.nombre+"'")
            }

            btnmenos.setOnClickListener {
                if (cantidad.text.toString().toInt() > 1) {
                    cantidad.setText((cantidad.text.toString().toInt() - 1).toString())
                    precio2.setText((precio2.text.toString().toDouble() - precio1.text.toString().toDouble()).toString())
                    db.execSQL("Update BDcarrito set precio2="+precio2.text.toString()+",cantidad="+cantidad.text.toString()+" where nombre='"+carrito.nombre+"'")
                }
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
    fun getIndicador(): Int {
        var fee = 0
        for (i in 0 until listacarrito.size) {
            fee = fee + listacarrito[i].indicador.toString().toInt()
        }
        return fee
    }
}
