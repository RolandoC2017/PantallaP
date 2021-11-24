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

        productos.add(ProductosCardView("Smartphone Motorola G20 Azul","S/ 1,000.00","799",R.drawable.motorolag20,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Pantalla: 6.5\", 720 x 1600 pixels\n" +
                    "Procesador: Unisoc T700 1.8GHz\n" +
                    "RAM: 4GB\n" +
                    "Almacenamiento: 64GB\n" +
                    "Expansión: microSD\n" +
                    "Cámara: Cuádruple, 48MP+8MP +2MP+2MP\n" +
                    "Batería: 5000 mAh\n" +
                    "OS: Android 11",false))

        productos.add(ProductosCardView("Smartphone Motorola E7-Negro","S/ 899.00","599",R.drawable.motorolae7,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Cámara Posterior: 48+2\n" +
                    "Velocidad Del Procesador: 2.0Ghz\n" +
                    "Memoria Ram: 2Gb\n" +
                    "Tipo De Pantalla: Hd\n" +
                    "Sistema Operativo: Android 10\n" +
                    "Lector De Huella: Sí\n" +
                    "Gps Integrado: Sí\n" +
                    "Conexión Bluetooth: Sí\n" +
                    "Resistente Al Agua: Ipx4 (Protegido Contra Las Salpicaduras De Agua)\n" +
                    "Cámara Frontal: 5Mp\n" +
                    "Conectividad: Wifi/3G/4G\n" +
                    "Marca: Motorola\n" +
                    "Modelo: E7\n" +
                    "Tipo: Smartphones\n" +
                    "Alto: 16.49\n" +
                    "Ancho: 7.5\n" +
                    "Profundidad: 0.89\n" +
                    "Tamaño De La Pantalla: 6.5 Pulgadas\n" +
                    "Peso: 0.19\n" +
                    "Memoria Interna: 32Gb\n" +
                    "Núcleos Del Procesador: Octa Core\n" +
                    "Memoria Expandible: Hasta 512Gb",false))

        productos.add(ProductosCardView("Motorola Moto G50 128GB / 4GB - Gris","S/ 1,899.00","1138",R.drawable.motorolag50,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Pantalla: 6.5, 720 x 1600 pixels\n" +
                    "Procesador: Snapdragon 480 5G 2.0GHz\n" +
                    "RAM: 4GB\n" +
                    "Almacenamiento: 64GB/128GB\n" +
                    "Expansión: microSD\n" +
                    "Cámara: Triple, 48MP+8MP+2MP\n" +
                    "Batería: 5000 mAh\n" +
                    "OS: Android 11\n" +
                    "PRODUCTO SELLADO",false))

        productos.add(ProductosCardView("Motorola Moto G9 Plus 128gb 4gb Ram Color Azul","S/ 1,999.00","1219",R.drawable.motorolag9,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Pantalla: 6.81\", 1080 x 2400 pixels\n" +
                    "Procesador: Snapdragon 730G 2.2GHz\n" +
                    "RAM: 4GB\n" +
                    "Almacenamiento: 128GB\n" +
                    "Expansión: microSD\n" +
                    "Cámara: Cuádruple, 64MP+8MP +2MP+2MP\n" +
                    "Batería: 5000 mAh\n" +
                    "OS: Android 10\n" +
                    "Perfil: 9.7 mm\n" +
                    "Peso: 223 g",false))

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