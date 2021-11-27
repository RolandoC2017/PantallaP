package com.example.pantallap.Carrito

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.Adapters.CarritoAdapter
import com.example.pantallap.BD.Conexion
import com.example.pantallap.R
import kotlinx.android.synthetic.main.item_carrito.*
import kotlinx.android.synthetic.main.productoscardview.*
import com.example.pantallap.Data.itemCarrito as itemCarrito

class Carrito : Fragment() {

    lateinit var adapter : CarritoAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_carrito, container, false)

        var lista: RecyclerView = root.findViewById(R.id.listaCarrito)
        val total = root.findViewById<TextView>(R.id.idtotal)
        var listaProductos = ArrayList<itemCarrito>()

        var conexion = Conexion(requireContext())
        var db = conexion.writableDatabase
        var sql = "select * from BDcarrito"
        var respuesta = db.rawQuery(sql, null)
        if (respuesta.moveToFirst()) {
            do {
                listaProductos.add(
                    itemCarrito(respuesta.getString(1), respuesta.getString(2), respuesta.getString(3), respuesta.getInt(4), respuesta.getString(5),respuesta.getInt(6))
                )

            } while (respuesta.moveToNext())
        }

        adapter = CarritoAdapter(listaProductos)
        lista.layoutManager = LinearLayoutManager(context)
        lista.addItemDecoration(DividerItemDecoration(context,LinearLayoutManager.VERTICAL))
        lista.adapter = adapter

        val itemTotal : Double = adapter.getTotalFee()
        total.setText("S/ " + itemTotal)

        return root;
    }
}