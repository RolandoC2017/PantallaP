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

class LG : Fragment() {

    companion object {
        fun newInstance() = LG()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.lg, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycle3)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("LG STYLUS 3 3GB RAM 16GB 13MP - titanio","S/ 899.00","469",R.drawable.lgstylus,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Pantalla: 5.7, 720 x 1280 pixels\n" +
                    "Procesador: Mediatek MT6750 1.5GHz\n" +
                    "RAM: 3GB\n" +
                    "Almacenamiento: 16GB\n" +
                    "Expansión: microSD\n" +
                    "Cámara: 13 MP\n" +
                    "Batería: 3200 mAh\n" +
                    "OS: Android 7.0\n" + "\n" +
                    "DETALLE DE PRODUCTO:\n" + "\n" +
                    "SKU: LG018EL17BFMELPE" +
                    "Condición del producto: Nuevo\n" +
                    "Qué hay en la caja: CARGADOR, EQUIPO, AUDÍFONO",false))

        productos.add(ProductosCardView("LG Smartphone 6.5 K51S 3GB 64GB 5 Camaras LM-K510HM - Titan","S/ 997.00","697",R.drawable.lgsmartphone,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Color:Titan\n" +
                    "Pantalla:6.55\" HD+\n" +
                    "Memoria Interna:64GB\n" +
                    "Memoria RAM:3GB\n" +
                    "Sistema Operativo:Android 9 Pie\n" +
                    "Procesador:MediaTek MT6762 Octa 2.0GHz\n" +
                    "Memoria Expandible:2TB\n" +
                    "Cámara Frontal:8MP\n" +
                    "Cámara Posterior:13MP + 5MP (G.A.) + 2MP (R) + 2MP (M)\n" +
                    "Conectividad:4G/WiFi/USB/Bluetooth/hotspot/GPS",false))

        productos.add(ProductosCardView("LG VELVET 5G AURORA PLATA CELULAR","S/ 2,999.00","1499.00",R.drawable.lgvelvet,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Marca:LG\n" +
                    "Diseño elegante y de primera calidad con bordes ergonómicos en 3D\n" +
                    "Pantalla OLED FullVision ™ de 6,8 ”\n" +
                    "Cámaras traseras triples: 48 MP, 8 MP ultra gran angular, 5 MP de profundidad\n" +
                    "Grabaciones de video 4K a 4 veces la resolución de HD\n" +
                    "Motor de sonido 3D y altavoces estéreo\n" +
                    "Polvo, agua, resistente a los golpes\n" +
                    "Batería para todo el día con carga rápida e inalámbrica\n" +
                    "Velocidades irreales y conectividad robusta 5G-Era Ready",false))

        productos.add(ProductosCardView("LG X SCREEN 2GB RAM 16GB 13MP - Negro","S/ 690.00","389",R.drawable.lgk20,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "pantalla de 4.93 pulgadas con resolución HD\n" +
                    "procesador quad-core a 1.2GHz\n" +
                    "RAM: 2GB\n" +
                    "Almacenamiento: 16GB\n" +
                    "Cámara: 13MP\n" +
                    "Batería: 2300 mAh\n" +
                    "Android 6.0 Marshmallow\n" + "\n" +
                    "DETALLE DE PRODUCTO:\n" + "\n" +
                    "SKU: LG018EL0Z5L38LPE" +
                    "Condición del producto: Nuevo\n" +
                    "Qué hay en la caja: CAJA SELLADA",false))

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