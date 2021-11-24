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

class Samsung : Fragment() {

    companion object {
        fun newInstance() = Samsung()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.samsung, container, false)

        var recyclerView: RecyclerView = root.findViewById<RecyclerView>(R.id.recycle5)
        var productos = ArrayList<ProductosCardView>()

        productos.add(ProductosCardView("Samsung Galaxy Note 20 ULTRA 256GB Ram 8GB - Negro","S/ 5,900.00","4499",R.drawable.samsungnote20,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Compatible con 4G LTE \n" +
                    "Variante norteamericana\n" +
                    "3 x cámaras traseras (108MP / 12MP / 12MP)\n" +
                    "Gran angular, telefoto de periscopio y ultraancho\n" +
                    "Cámara frontal para selfies amplia de 10 MP\n" +
                    "Snapdragon 865+ y CPU de ocho núcleos\n" +
                    "Capacidad de almacenamiento de 256 GB + 8 GB de RAM\n" +
                    "6,9' 1440 x 3088 AMOLED dinámico 2x\n" +
                    "S-Pen Stylus y captura de video 8K\n" +
                    "Sistema operativo Android 10\n" +
                    "Se Emite Boleta De Venta / Factura.",false))

        productos.add(ProductosCardView("Samsung Galaxy S10 Plus SM G975U 128GB - Azul","S/ 2,199.00","1759",R.drawable.samsungs10,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Pantalla: 6,4\" Dynamic AMOLED Touchscreen\n" +
                    "Resolución: 3040x 1440 pixeles\n" +
                    "Procesador: Snapdragon 855\n" +
                    "Almacenamiento: 128GB\n" +
                    "Memoria RAM: 8GB\n" +
                    "Cámara: Triple, 12 MP (f/1.5 y f/2.4)\n" +
                    "Cámara Frontal: 10 MP (f/1.9)\n" +
                    "Batería: 4001mAh (no extraíble)\n" +
                    "Sistema Operativo: Android 9.0 Pie\n" +
                    "Dimensiones: 157.6 x 74.1 x 7.8 mm",false))

        productos.add(ProductosCardView("Samsung Galaxy A52s 5G Negro","S/ 1,999.00","1899",R.drawable.samsunga52,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "Cámara posterior 64.0 MP + 12.0 MP + 5.0 MP + 5.0 MP\n" +
                    "Cámara frontal 32.0 MP\n" +
                    "Tamaño de la pantalla 6.5 pulgadas\n" +
                    "Memoria interna 128GB\n" +
                    "Núcleos del procesador Octa Core\n" +
                    "Memoria expandible Hasta 1 TB\n" +
                    "Flash frontal: No\n" +
                    "Velocidad del procesador 2.4GHz,1.8GHz\n" +
                    "Memoria RAM 6GB\n" +
                    "Batería 4500 mAh\n" +
                    "Memoria externa incluida: No\n" +
                    "Tipo de pantalla Super AMOLED\n" +
                    "Sistema operativo Android\n" +
                    "Lector de huella: Sí\n" +
                    "GPS integrado: Sí\n" +
                    "Conexión Bluetooth: Sí\n" +
                    "Resistente al agua: NO\n" +
                    "Conectividad 5G\n" +
                    "Dual SIM: No\n" +
                    "Marca Samsung Galaxy\n" +
                    "Modelo SM-A528BZKLLTP\n" +
                    "Nombre comercial: Galaxy A52s 5G Negro\n" +
                    "Tipo: Smartphones\n" +
                    "Alto: 15.99\n" +
                    "Ancho: 7.51\n" +
                    "Profundidad: 0.84\n" +
                    "Peso: 0.189",false))

        productos.add(ProductosCardView("Samsung Galaxy S9 Plus SM-G965U 64GB Púrpura","S/ 2,659.00","919",R.drawable.samsungs9,
            "CARACTERISTICAS DESTACADAS:\n" + "\n" +
                    "PANTALLA: 6.2\", 1440 x 2960 \n" +
                    "PROCESADOR: Snapdragon 845\n" +
                    "RAM: 6GB.\n" +
                    "ALMACENAMIENTO: 64GB\n" +
                    "EXPANSIÓN: microSD.\n" +
                    "CÁMARA: 12 MP\n" +
                    "BATERÍA: 3500 mAh.\n" +
                    "SISTEMA OPERATIVO: Android 8.0\n" +
                    "DIMENSIONES: 158.1 x 73.8 x 8.5 mm\n" +
                    "Garantía por 12 meses.",false))

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