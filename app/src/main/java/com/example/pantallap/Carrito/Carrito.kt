package com.example.pantallap.Carrito

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.Adapters.CarritoAdapter
import com.example.pantallap.Adapters.ProductosAdapterCV
import com.example.pantallap.BD.Conexion
import com.example.pantallap.ProductosCardView
import com.example.pantallap.R
import com.example.pantallap.itemCarrito
import kotlinx.android.synthetic.main.fragment_carrito.*
import kotlinx.android.synthetic.main.item_carrito.*
import kotlinx.android.synthetic.main.llamar_fragment.*
import kotlinx.android.synthetic.main.ver_productos_detalle.*

class Carrito : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_carrito, container, false)

        var lista: RecyclerView = root.findViewById<RecyclerView>(R.id.listaCarrito)

        var listaProductos = ArrayList<itemCarrito>()

        var conexion = Conexion(requireContext())
        var  db = conexion.writableDatabase
        var sql = "select * from prueba1"
        var respuesta = db.rawQuery(sql,null)
        if(respuesta.moveToFirst()){
            do {
                listaProductos.add(itemCarrito(respuesta.getString(1),respuesta.getString(2),respuesta.getString(3),respuesta.getInt(4),respuesta.getString(5)))
            }while (respuesta.moveToNext())
        }

        var adapter = CarritoAdapter(listaProductos)
        lista.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        lista.adapter = adapter

        return root;
    }

}