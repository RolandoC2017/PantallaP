package com.example.pantallap.Telefono

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pantallap.Adapters.ProductosAdapterCV
import com.example.pantallap.BD.Conexion
import com.example.pantallap.Data.ProductosCardView
import com.example.pantallap.R

class Apple : Fragment() {

    companion object {
        fun newInstance() = Apple()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.apple, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycle)
        var productos = ArrayList<ProductosCardView>()

        productos.add(
            ProductosCardView("iPhone 11 128GB - Negro","S/ 4,599.00","3499",R.drawable.iphone11,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Pantalla LCD Multi-Touch de 6.1 pulgadas \n" +
                    "Chip A13 Bionic\n" +
                    "Sistema de dos cámaras de 12 MP: ultra gran angular y gran angular\n" +
                    "Grabación de video 4K \n" +
                    "Camara frontal:  de 12 MP\n" +
                    "Reconocimiento facial\n" + "\n" +
                    "DETALLE DE PRODUCTO:\n" + "\n" +
                    "SKU: AP032EL1JH8LZLPE\n" +
                    "Modelo: iphone 11\n" +
                    "Peso (kg): 0.2\n" +
                    "Color: negro\n" +
                    "Garantía del producto: 06 meses.\n" +
                    "Condición del producto: Nuevo\n" +
                    "Detalle condición física del producto: nuevo sellado\n" +
                    "Tamaño de la pantalla (pulg): 6.1\n" +
                    "Capacidad: 128\n" +
                    "Memoria RAM: 4\n" +
                    "Megapixeles: 12.0\n" +
                    "Sistema operativo: iOS 13\n" +
                    "Qué hay en la caja: iPhone 11, Cable de Lightning a USB, Manuales\n"+ "\n",false)
        )
        productos.add(ProductosCardView("Apple IPhone XR 64GB - Negro","S/ 4,559.00","2489",R.drawable.iphonexr,"ANDROID 10",false))
        productos.add(ProductosCardView("Apple IPhone 7 32GB - Oro Rosa","S/ 4,000.00","1549",R.drawable.iphone7,"ANDROID 10",false))
        productos.add(ProductosCardView("Apple IPhone XS MAX 64GB 4GB 8MPX 2915MAH 5.5 - Space Gray","S/ 4,505.00","3267",R.drawable.iphonexs,"ANDROID 10",false))
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