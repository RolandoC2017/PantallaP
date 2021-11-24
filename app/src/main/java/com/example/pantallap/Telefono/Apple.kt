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
                    "Sistema operativo: iOS 13\n" +
                    "Qué hay en la caja: iPhone 11, Cable de Lightning a USB, Manuales\n"+ "\n",false))

        productos.add(ProductosCardView("Apple IPhone XR 64GB - Negro","S/ 4,559.00","2489",R.drawable.iphonexr,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Pantalla LCD IPS 6,1 pulgadas\n" +
                    "Cámara principal de 12 MP / Frontal de 7 MP.\n" +
                    "Grabación de video 4K.\n" +
                    "Chip A12 Bionic.\n" +
                    "Sistema operativo iOS 12.\n" +
                    "Memoria 64gb\n" +
                    "Tecnología de reconocimiento facial FaceID.\n" +
                    "Carga inalámbrica (funciona con cargadores Qi).\n" +
                    "Batería no removible Li-Ion 2942 mAh.\n" +
                    "Resistente a salpicaduras, agua y polvo (certificación IP67-Profundidad máxima 1 metro).\n" + "\n" +
                    "DETALLE DE PRODUCTO:\n" + "\n" +
                    "SKU: AP032EL1LFS6ZLPE\n" +
                    "Modelo: iPhone XR\n" +
                    "Peso: 0.2\n" +
                    "Color: Negro\n" +
                    "Material: Frente y posterior de vidrio, marco de aluminio serie 7000\n" +
                    "Garantía del producto: 01 AÑO \n" +
                    "Condición del producto: Nuevo\n" +
                    "Detalle condición física del producto: NUEVO\n" +
                    "Memoria RAM: 3\n" +
                    "Qué hay en la caja: Equipo Celular, Cable USB, Manuales, Clip para SIM\n"+ "\n",false))

        productos.add(ProductosCardView("Apple IPhone 7 32GB - Oro Rosa","S/ 4,000.00","1549",R.drawable.iphone7,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Pantalla retina HD de 4.7”\n" +
                    "Cámara principal 4K de 12 MP y frontal de 7 MP\n" +
                    "Sistema operativo iOS 10\n" +
                    "Nuevo procesador A10 Fusion\n" +
                    "Altavoces estéreo\n" +
                    "3D Touch\n" +
                    "Conectividad 4G\n" +
                    "Resistente a salpicaduras, agua y polvo\n" + "\n" +
                    "DETALLE DE PRODUCTO:\n" + "\n" +
                    "SKU: AP032EL14I2RILPE\n" +
                    "Modelo: 7\n" +
                    "País de Origen: China\n" +
                    "Peso (kg): 0.13\n" +
                    "Color: Oro Rosa\n" +
                    "Garantía del producto: 6 meses\n" +
                    "Condición del producto: Nuevo\n" +
                    "Detalle condición física del producto: sellado\n" +
                    "Capacidad: 32\n" +
                    "Sistema operativo: iOS 10\n" +
                    "Qué hay en la caja: iPhone con iOS 10, EarPods con conector Lightning, Adaptador de Lightning a entrada de 3.5 mm para audífonos, Cable de Lightning a USB, Adaptador de corriente USB, Documentación",false))

        productos.add(ProductosCardView("Apple IPhone XS MAX 64GB 4GB 8MPX 2915MAH 5.5 - Space Gray","S/ 4,505.00","3267",R.drawable.iphonexs,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Especificaciones técnicas: Pantalla Super Retina de 6.5 pulgadas: la pantalla más grande en un iPhone. Identificación avanzada de la cara. El chip más inteligente y poderoso de un teléfono inteligente. Y un innovador sistema de doble cámara. iPhone XS Max es todo lo que te gusta de iPhone y más.\n" +
                    "OS iOS 12 con Memoji, Screen Time y Group FaceTime\n" +
                    "Monitor, Pantalla Super Retina de 6.5 pulgadas (OLED) con HDR1\n" +
                    "Cámara dual de 12MP con doble OIS y cámara frontal TrueDepth de 7MP: modo de retrato, iluminación de retrato, control de profundidad y HDR inteligente\n" +
                    "Procesador A12 Bionic con motor neuronal de última generación\n" +
                    "Conectividad 4G / LTE\n" +
                    "Batería de iones de litio recargable incorporada\n" +
                    "Otros ID de cara para una autenticación segura; IP68 resistente al polvo y al agua (profundidad máxima de 2 metros hasta 30 minutos)\n" + "\n" +
                    "DETALLE DE PRODUCTO:\n" + "\n" +
                    "SKU: AP032EL15CE7QLPE\n" +
                    "Modelo: IPHONE XS MAX\n" +
                    "Color: Space Gray\n" +
                    "Tamaño de la pantalla (pulg): 5.5\n" +
                    "Capacidad: 64\n" +
                    "Memoria RAM: 4\n" +
                    "Megapixeles: 8.0\n" +
                    "Sistema operativo: iOS 12",false))

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