package com.example.pantallap.Carrito

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.Adapters.CarritoAdapter
import com.example.pantallap.BD.Conexion
import com.example.pantallap.R
import com.example.pantallap.Data.itemCarrito

class Carrito : Fragment() {

    lateinit var adapter : CarritoAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_carrito, container, false)

        var lista: RecyclerView = root.findViewById(R.id.listaCarrito)

        var listaProductos = ArrayList<itemCarrito>()

        var conexion = Conexion(requireContext())
        var db = conexion.writableDatabase
        var sql = "select * from prueba1"
        var respuesta = db.rawQuery(sql, null)
        if (respuesta.moveToFirst()) {
            do {
                listaProductos.add(
                    itemCarrito(respuesta.getString(1), respuesta.getString(2), respuesta.getString(3), respuesta.getInt(4), respuesta.getString(5))
                )
            } while (respuesta.moveToNext())
        }

        adapter = CarritoAdapter(listaProductos)
        lista.layoutManager = LinearLayoutManager(context)
        lista.addItemDecoration(DividerItemDecoration(context,LinearLayoutManager.VERTICAL))
        lista.adapter = adapter

        return root;
    }
}