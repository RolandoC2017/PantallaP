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

class Xiaomi : Fragment() {

    companion object {
        fun newInstance() = Xiaomi()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.xiaomi, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycle6)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Xiaomi Poco X3 Pro 6GB 128GB","S/ 1,299.00","1149",R.drawable.xiaomipocox3,"ANDROID 10",false))
        productos.add(ProductosCardView("Xiaomi Poco M3 Pro 6GB 128GB 5G teléfono M2103K19PG - Negro","S/ 1,199.00","859",R.drawable.xiaomipocom3,"ANDROID 10",false))
        productos.add(ProductosCardView("Xiaomi Redmi Note 9 Pro 6GB 128GB M2003J6B2G 4G LTE Smartphone","S/ 1,229.00","899",R.drawable.xiaomiredminote9,"ANDROID 10",false))
        productos.add(ProductosCardView("Xiaomi Redmi Note 10 Pro 8GB 128GB 108MP NFC Smartphone M2101K6G - Naranja","S/ 1,899.00","1489",R.drawable.xiaomiredminote10,"ANDROID 10",false))
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