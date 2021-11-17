package com.example.pantallap.Telefono

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.Adapters.ProductosAdapterCV
import com.example.pantallap.Data.ProductosCardView
import com.example.pantallap.R

class Motorola : Fragment() {

    companion object {
        fun newInstance() = Motorola()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.motorola, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycle4)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Smartphone Motorola G20 Azul","S/ 1,000.00","799",R.drawable.motorolag20,"ANDROID 10",false))
        productos.add(ProductosCardView("Smartphone Motorola E7-Negro","S/ 899.00","599",R.drawable.motorolae7,"ANDROID 10",false))
        productos.add(ProductosCardView("Motorola Moto G50 128GB / 4GB - Gris","S/ 1,899.00","1138",R.drawable.motorolag50,"ANDROID 10",false))
        productos.add(ProductosCardView("Motorola Moto G9 Plus 128gb 4gb Ram Color Azul","S/ 1,999.00","1219",R.drawable.motorolag9,"ANDROID 10",false))
        var adapter = ProductosAdapterCV(productos)

        //recyclerView.layoutManager = LinearLayoutManager(root.context,LinearLayoutManager.VERTICAL,false)
        recyclerView.layoutManager = GridLayoutManager(root.context,2)
        recyclerView.adapter = adapter

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}