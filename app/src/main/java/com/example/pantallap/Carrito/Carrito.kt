package com.example.pantallap.Carrito

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.pantallap.Adapters.CarritoAdapter
import com.example.pantallap.ItemCarrito
import com.example.pantallap.R

class Carrito : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_carrito, container, false)

        var lista = root.findViewById<RecyclerView>(R.id.listaCarrito)
        var listaProductos = ArrayList<ItemCarrito>()
        listaProductos.add(ItemCarrito("PRUEBA","12",R.drawable.samsungs10,"10"))
        var adapter = CarritoAdapter(listaProductos)
        lista.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        lista.adapter = adapter

        return root;
    }

}