package com.example.pantallap.Pc

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

class Dell : Fragment() {

    companion object {
        fun newInstance() = Dell()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.dell, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.pcrecycle)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Laptop Dell Inspiron 3501 15.6 Intel Core i5 11°Gen 256GB SSD 8GB Sin Sistema","S/ 3,500.00","3262",R.drawable.dellinspiron3501,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                        "Marca: Dell\n" +
                        "Procesador: Intel Corel I5-11\n" +
                        "Sistema Operativo: Linux\n" +
                        "Tamaño de Pantalla: 15.6\" Full HD LCD\n" +
                        "Almacenamiento: 256 GB SSD\n" +
                        "Memoria RAM: 8GB DDR4  \n" +
                        "BATERIA 3 CELDAS \n" +
                        "Garantía: 1 año\n" +
                        "COLOR BLACK",false))

        productos.add(ProductosCardView("Laptop Dell Gaming G3 15 3500 I5-10300H/8Gb/Ssd256+1Tb/Tv4Gb1650/15.6/W10Sl","S/ 5,699.00","4599",R.drawable.dellgamingg3,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Marca: DELL\n" +
                    "Modelo: G3 3500\n" +
                    "Nro parte: M2RP0\n" +
                    "Cod. Interno: 103839\n" +
                    "Tipo: Gaming\n" +
                    "Procesador: Intel Core i5 10300H, 10ma Generación\n" +
                    "Memoria RAM: 8Gb DDR4\n" +
                    "Disco Solido:  256GB M2\n" +
                    "Disco Mecánico: 1TB \n" +
                    "Tarjeta de Video: NVIDIA Geforce GTX 1650Ti  4GB GDDR6\n" +
                    "Pantalla: 15.6 FULL HD, (1920 x 1080) ANTI-GLARE\n" +
                    "Teclado: Completo incluye numérico - retroiluminado\n" +
                    "Color: Negro\n" +
                    "Sistema Operativo: Windows 10 Home 64 BITS / Idioma: Español",false))

        productos.add(ProductosCardView("Computadora DELL Vostro 3681 Intel Core i3-10100 3.6/4.3 GHz 4GB DDR4 1TB SATA","S/ 2,599.00","2065.00",R.drawable.dellcomputadoravostro,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "FACTOR DE FORMA PC\n" +
                    "MARCA DELL\n" +
                    "MODELO VOSTRO DESKTOP 3681\n" +
                    "PART NUMBER 7FG21\n" +
                    "SISTEMA OPERATIVO VERSION LINUX UBUNTU, IDIOMA ESPAÑOL, 18.04\n" +
                    "PROCESADOR INTEL CORE i3 10100 3.60 / 4.30GHz 6 MB CACHE\n" +
                    "MEMORIA RAM CAPACIDAD 4 GB, TIPO DDR4, BUS 3200 MHZ\n" +
                    "ALMACENAMIENTO DISCO DURO CAPACIDAD 1 TB, VELOCIDAD 7200 RPM, 3.5\"\n" +
                    "TARJETAS INTEGRADAS VIDEO INTEL UHD GRAPHICS 630\n" +
                    "WIRELESS ESTANDAR 802.11AC\n" +
                    "BLUETOOTH INCLUYE SI\n" +
                    "PUERTOS POSTERIOR VIDEO DB-15 1, HDMI 1, RJ-45 1, JACK COMBO AUDIO/MICROFONO 1, ALIMENTACION 1, \n" +
                    "USB 3.2 GEN 1 x 2, USB 2.0 TIPO A X 2\n" +
                    "FRONTAL JACK COMBO AUDIO/MICROFONO 1, LECTOR DE MEMORIA SD (SECURE DIGITAL), USB 3.2 GEN 1 x 2, USB 2.0 TIPO A X 2\n" +
                    "DIMENSIONES (CM) ALTO 37.37, ANCHO 16.00, PROFUNDIDAD 18.94\n" +
                    "PESO (KG) 5.27\n" +
                    "BOTONES POWER\n" +
                    "TECLADO IDIOMA ESPAÑOL, INTERFAZ USB, NEGRO",false))

        productos.add(ProductosCardView("Laptop Dell Vostro 3400 14, i7-1165G7, 8GB RAM, 512GB SSD, MX330 2GB, Linux","S/ 5,299.00","4399",R.drawable.delllaptopvostro,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Marca: Dell\n" +
                    "Modelo: Vostro 3400\n" +
                    "Número de Parte: PPWH7\n" +
                    "Procesador: Intel Core i7-1165G7 (2.8 GHz - 4.7 GHz)\n" +
                    "Memoria RAM: 8GB DDR4 3200 MHz\n" +
                    "Almacenamiento: 512GB SSD M.2\n" +
                    "Pantalla: 14\" Full HD ( 1920 x 1080 )\n" +
                    "Tarjeta de Video: Nvidia GeForce MX330 2GB GDDR5\n" +
                    "Lector de Memorias: SD (Secure Digital)\n" +
                    "Conectividad\n" +
                    "Lan Ethernet 10/100/1000 Mb/s\n" +
                    "Wireless 801.11 AC\n" +
                    "Bluetooth V 5.0\n" +
                    "Sonido: HD Audio con parlantes stereo\n" +
                    "Puertos:\n" +
                    "USB 2.0: 1\n" +
                    "USB 3.2 Tipo-A Gen1: 2\n" +
                    "USB 3.2 Tipo-C Gen1: 1\n" +
                    "RJ45: 1\n" +
                    "Batería: Integrada: 42Wh",false))

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